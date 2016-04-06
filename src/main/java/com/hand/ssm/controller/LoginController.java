package com.hand.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.service.LoginService;


@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	LoginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping(value="/index" ,method = {RequestMethod.GET })
	public ModelAndView toLoginPage(){
		return new ModelAndView("WEB-INF/jsp/login");
	}
	
	@RequestMapping(value="/login" ,method = {RequestMethod.GET })
	public ModelAndView doLogin(){
		
		String loginPageUrl = "WEB-INF/jsp/login";
		String successPageUrl = "WEB-INF/jsp/success";
		
		String uname = request.getParameter("uname");
		String upasswd = request.getParameter("upasswd");
		
		return service.doLogin(loginPageUrl, successPageUrl, uname, upasswd);
		
	}
}
