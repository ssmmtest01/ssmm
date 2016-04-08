package sy.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sy.model.User;

@Controller
@RequestMapping("/myajax.do")
public class MyAjaxControl {
	@RequestMapping(params="method=test1",method=RequestMethod.GET)
	public @ResponseBody List<User> test1(String name) throws UnsupportedEncodingException{
		String name2=new String(name.getBytes("iso8859-1"),"utf-8");
		System.out.println(name2);
		List<User> list=new ArrayList<User>();
		list.add(new User("zhang","123"));
		list.add(new User("zhang2","123"));
		return list;
	}
}
