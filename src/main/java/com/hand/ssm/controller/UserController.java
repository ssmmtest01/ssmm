package com.hand.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.model.user;
import com.hand.ssm.service.userService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="new" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
//		ModelAndView mav = new ModelAndView("index");
//		Map<String ,Object> map = new HashMap<String, Object>();
//		map.put("param", "111");
//		mav.addAllObjects(map);\
		request.setAttribute("param", "zeng");
		return "index";
	}
	
	
	private userService userService;

	public userService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(userService userService) {
		this.userService = userService;
	}

	@RequestMapping("/new")
	public ModelAndView test1(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView("index");
//		user user = userService.getById(1);
//		request.setAttribute("user",user);
		return modelAndView;
	}
	
	//查询所有
	@RequestMapping("getall")
	public String all(HttpServletRequest request){
		List<user> all3 = userService.getAll();
		System.out.println(all3.size());
		request.setAttribute("users",all3);
		return "all";
	}
	
	//删除
	@RequestMapping("delete")
	 public String delete(HttpServletRequest request){
		String parameter = request.getParameter("id");
		Integer idInteger=Integer.parseInt(parameter);
		user user = userService.getById(idInteger);
		userService.deleteUser(idInteger);
		return "redirect:/user/getall";
	}
	//添加
	@RequestMapping("add")
	public String  add(HttpServletRequest request){
		String name = request.getParameter("name");
		System.out.println(name);
		user user=new user();
		user.setName(name);
		userService.addUser(user);
		return "redirect:/user/getall";
	}
	//更新
	@RequestMapping("update")
	public String update(HttpServletRequest request){
		String id=request.getParameter("Id");
		String name = request.getParameter("name");
		user user = userService.getById(Integer.parseInt(id));
		user.setName(name);
		userService.updateUser(user);
		return "redirect:/user/getall";
	}
	
	
	
	
	
	
	
	
}
