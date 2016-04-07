package com.hand.ssm.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class UserController {
	
	@RequestMapping(value="/show1" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
//		ModelAndView mav = new ModelAndView("index");
//		Map<String ,Object> map = new HashMap<String, Object>();
//		map.put("param", "111");
//		mav.addAllObjects(map);\
		System.out.println("+++++++++++");
		System.out.println(request.getRequestURL());
		response.setCharacterEncoding("UTF-8");
		request.setAttribute("param", "baiyu");
		return "index";
	}
	
	//返回视图模型
	@RequestMapping("/show2")
	public ModelAndView mav(HttpServletResponse response,Model model){
		response.setCharacterEncoding("UTF-8");
		Date today = new Date();
		model.addAttribute("today", today);
		return new ModelAndView("hello");
	}
	
	//转发
	@RequestMapping("/show3")
	public String mav(){
		return "redirect:/test/show1";
	}
	
	//参数绑定

}
