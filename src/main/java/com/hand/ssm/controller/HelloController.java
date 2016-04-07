package com.hand.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	/* 返回视图模型 */
	@RequestMapping(value="" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
		request.setAttribute("param", "Hello World");
		return "hello";
	}	
}

