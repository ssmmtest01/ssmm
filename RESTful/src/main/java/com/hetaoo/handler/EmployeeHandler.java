package com.hetaoo.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hetaoo.dao.EmployeeDao;

@Controller
public class EmployeeHandler {
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map){
		map.put("employees",employeeDao.getAll() );
		System.out.println(employeeDao.getAll());
		return "list";
	}
}	
