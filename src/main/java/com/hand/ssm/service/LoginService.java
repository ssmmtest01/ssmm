package com.hand.ssm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {
	public ModelAndView doLogin(String loginPageUrl, String successPageUrl, String uname, String upasswd) {
		
		if (uname == null || "".equals(uname)) {
			return new ModelAndView(loginPageUrl, "error", "用户名不能为空");
		}
		
		if (upasswd == null || "".equals(upasswd)) {
			return new ModelAndView(loginPageUrl, "error", "密码不能为空");
		}
		
		// uname = admin , passwd = 123
		
		if (uname.equals("admin") && upasswd.equals("123")) {
			return new ModelAndView(successPageUrl);
		}
		
		return new ModelAndView(loginPageUrl, "error", "用户名或者密码错误");
	}


}
