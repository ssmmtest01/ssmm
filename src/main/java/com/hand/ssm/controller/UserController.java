package com.hand.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
//		ModelAndView mav = new ModelAndView("index");
//		Map<String ,Object> map = new HashMap<String, Object>();
//		map.put("param", "111");
//		mav.addAllObjects(map);\
		request.setAttribute("param", "zeng");
		return "index";
	}
	
	
}
