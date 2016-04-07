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
	@RequestMapping("/show4")
	public String show(@RequestHeader("Host")String host,HttpServletRequest request){
		request.setAttribute("host", host);
		return "show";
	}
	/*
	 * 用户登录 POST方法登录
	 */	
	@RequestMapping(value="/check" ,method=RequestMethod.POST)
	public ModelAndView login( HttpServletRequest request,String username,int password){
		//验证传递的参数
	if(username=="baiyu"&&password==1234){
			System.out.println(username+" "+password);
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			return new ModelAndView("/succ");
		}
		System.out.println(username+" "+password);
		return  new ModelAndView("/failed");
		//传递参数
/*		request.setAttribute("username", username);
		request.setAttribute("age", age);
		return new ModelAndView("/succ");*/
	}
}
