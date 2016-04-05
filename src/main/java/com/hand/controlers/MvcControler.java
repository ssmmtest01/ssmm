package com.hand.controlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcControler {

	@ResponseBody
	@RequestMapping(value = "mvc1", method = RequestMethod.GET)
	public String mvc1(@RequestParam String data) {
		System.out.println(data);
		return data;
	}

	@RequestMapping(value = "testRedirect/{name}/{age}")
	public String testRedirect(@PathVariable String name, @PathVariable int age) {

		System.out.println("name:" + name + "  age:" + age);
		System.out.println("这是重定向，通知浏览器访问hello.jsp，数据带不过去");
		return "redirect:/redirectTest.jsp";
	}
	
	@RequestMapping(value = "testForward/{name}/{age}")
	public String testForward(@PathVariable String name, @PathVariable int age,ModelAndView mv ) {
		
		System.out.println("name:" + name + "  age:" + age);
		System.out.println("这是转发，通知服务器访问/WEB-INF/views/forwardTest.jsp，数据通过mv带过去");
		mv.addObject("name", name);
		mv.addObject("age", age);
		return "forward:/WEB-INF/views/forwardTest.jsp";
	}
}
