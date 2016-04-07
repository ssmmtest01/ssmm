package com.hand.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class HelloController {
	
	/* 返回视图模型 */
	@RequestMapping(value="/hello" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
		request.setAttribute("param", "Hello World");
		return "hello";
	}	
	
	/*转发*/
	@RequestMapping(value="/ts" ,method = {RequestMethod.GET })
	public String ts(HttpServletRequest request ,HttpServletResponse response){
		request.setAttribute("param", "转发成功！");
		return "hello";
	}
	
	/*重定向*/
	@RequestMapping(value="/re" ,method = {RequestMethod.GET })
	public String re(RedirectAttributes attr){
		attr.addFlashAttribute("message", "重定向成功！");
		return "redirect:/hello.jsp";	
	}
	
	/*参数绑定*/
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public ModelAndView TestParam(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.setViewName("param");
		return mv;
	}	
		
	/*rest、ant、正则表达式风格*/
	@RequestMapping(value ={ "/{id}/rest", "/{id}/rest*", "{id}/{categoryCode:\\d+}-{pageNumber:\\d+}"}, method = RequestMethod.GET)
	public ModelAndView TestRest(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.setViewName("param");
		return mv;
	}
	
}

