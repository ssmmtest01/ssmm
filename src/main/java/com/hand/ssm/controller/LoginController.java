package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hand.ssm.model.User;

import sun.applet.Main;

@Controller
@RequestMapping("/login")

public class LoginController {
	
//	@RequestMapping(value="/a",method = {RequestMethod.GET })
//	public ModelAndView testForward(ModelAndView mv){
//		mv.addObject("u","seven");
//		mv.setViewName("login");
//		return mv;
		
		
//	@RequestMapping(value="/a",method = {RequestMethod.GET })
//	public String testForward(RedirectAttributes attr){
//		attr.addAttribute("u", "seven");
//		
//		return "redirect:/login.jsp";	
	
	
	@RequestMapping(value="/b",method = {RequestMethod.GET })
	public String testForward(HttpServletRequest request){
		request.setAttribute("u", "seven");
		System.out.println(request.getRequestURI());	
		return "forward:/login.jsp";
	}
	
	@RequestMapping("a")
	public String getparam(User u){
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getPwd());
		
		return "redirect:/index.jsp";
	
	}
	

		
	
}
