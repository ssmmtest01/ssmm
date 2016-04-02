package com.hand.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcControler {

	@ResponseBody
	@RequestMapping(value="mvc1",method=RequestMethod.GET)
	public String mvc1(@RequestParam String data){
		System.out.println(data);
		return data;
	}
}
