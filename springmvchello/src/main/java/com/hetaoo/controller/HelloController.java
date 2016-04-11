package com.hetaoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String helloPrint(){
		System.out.println("hello SpringMVC");
		return "success";
	}
}
