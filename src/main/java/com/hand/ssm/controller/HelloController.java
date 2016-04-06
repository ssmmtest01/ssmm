package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	/*返回视图模型*/
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring", "spring mvc");
		mv.setViewName("hello");
		return mv;
	}
	
	/*转发*/
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(HttpServletRequest request ,HttpServletResponse response) {
		 response.setCharacterEncoding("UTF-8");
		 request.setAttribute("param", "This is spring mvc");
		return "welcome";
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