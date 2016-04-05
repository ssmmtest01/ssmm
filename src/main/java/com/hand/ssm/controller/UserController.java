package com.hand.ssm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/*@RequestMapping(value="/we" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){	
		request.setAttribute("param", "zeng");
		return "index";
	}
	*/

	/*@RequestMapping(value="/index",method={RequestMethod.GET})
	public  String  index(Model  model){
		model.addAttribute("param", "123");
		return "index" ;
	} */
	
	@RequestMapping(value="/a",method={RequestMethod.GET})
	public  String  index(HttpServletRequest request){
		request.setAttribute("param","123");
		return "redirect:/index1.jsp" ;
	}
	
//	@RequestMapping(value="",method={RequestMethod.GET})
//	public  String  index(HttpServletRequest request){
//		request.setAttribute("param", "123");
//		return "forward:/index1.jsp" ;
//	}	
	
	
//	@RequestMapping(value="/a",method={RequestMethod.GET})
//	public ModelAndView  index(HttpServletRequest request,HttpServletResponse response){
//		ModelAndView  mav=new ModelAndView();
//		mav.addObject("param", "qwe");
//		mav.setViewName("index");
//		return mav;
//	
//	}
	
	
}

