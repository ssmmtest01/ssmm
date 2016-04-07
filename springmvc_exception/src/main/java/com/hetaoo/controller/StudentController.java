package com.hetaoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hetaoo.pojo.Student;
import com.hetaoo.utils.SpringException;

@Controller
public class StudentController {
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("springmvc_exception")Student student,
			Model model){
		if(student.getName().length() < 5){
			throw new SpringException("名字小于5位");
		}else{
			model.addAttribute("name",student.getName());
		}
		
		if(student.getAge() <10){
			throw new SpringException("年龄小于10");
		}else{
			model.addAttribute("age",student.getAge());
		}
		
		model.addAttribute("id", student.getId());
	
		return "result";
	}
}
