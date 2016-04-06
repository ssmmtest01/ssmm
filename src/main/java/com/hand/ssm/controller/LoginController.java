package com.hand.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.service.LoginService;

@Controller
public class LoginController {

	@Resource
	LoginService service;
	@Resource
	HttpServletRequest req;
	@RequestMapping("lo")
	public ModelAndView toLogin(){
		return new ModelAndView("WEB-INF/jsp/login");
	}
	@RequestMapping("login")
	public ModelAndView Login(){
		String loginurl="WEB-INF/jsp/login";
		String loginsuccess="WEB-INF/jsp/success";
		String user = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		
		return service.login(loginurl,loginsuccess,user,pwd);
	}
	
	
	
	
	
	
	
}
