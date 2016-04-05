package com.hand.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Bean.User;

@Controller
@RequestMapping("/uu")
public class User1Controller {
	
      @RequestMapping(value="user",method={RequestMethod.GET})
	public  String  regst(HttpServletRequest  request,HttpServletResponse  response){
    	  List<User> list=new  ArrayList<>();
    	  User  user1=new User();
    	  user1.setId(1);
    	  user1.setName("tom");
    	  user1.setAge(20);
    	  user1.setGender("male");
    	  User  user2=new User();
    	  user2.setId(2);
    	  user2.setName("jack");
    	  user2.setAge(20);
    	  user2.setGender("male");
    	  list.add(user1);
    	  list.add(user2);
    	  request.setAttribute("list", list);
		return "test";
		
	}
}
