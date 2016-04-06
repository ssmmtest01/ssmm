package com.hand.ssm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {


	public ModelAndView login(String loginurl, String loginsuccess, String user, String pwd) {
		
		if(user ==null||"".equals(user)){
			return new ModelAndView(loginurl,"error","no user");
		}
		if(pwd ==null||"".equals(pwd)){
			return new ModelAndView(loginurl,"error","no pwd");
		}
		//zyk,qwe.
		if(user.equals("zyk")&&pwd.equals("qwe")){
			return new ModelAndView(loginsuccess);
		}
		return new ModelAndView(loginurl,"error","wrong user or pwd");
	}

	
}
