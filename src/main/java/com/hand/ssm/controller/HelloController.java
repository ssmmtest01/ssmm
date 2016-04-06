package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring", "spring mvc");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(HttpServletRequest request ,HttpServletResponse response) {
		 response.setCharacterEncoding("UTF-8");
		 request.setAttribute("param", "This is spring mvc");
		return "welcome";
	}
	
}