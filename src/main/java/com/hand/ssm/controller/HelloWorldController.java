package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@RequestMapping("/zyk")
public class HelloWorldController {

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//		//1、收集参数、验证参数
//		//2、绑定参数到命令对象
//		//3、将命令对象传入业务对象进行业务处理
//		//4、选择下一个页面
//		ModelAndView mv=new ModelAndView();
//		//建立模型数据
//		mv.addObject("message","Hello World!");
//		//设置逻辑视图名字
//		mv.setViewName("zyk");
//		return mv;
//	}
	
	@RequestMapping(value="" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
		request.setAttribute("nn", "hid");
		return "forward:/zyk.jsp";
	}

}
