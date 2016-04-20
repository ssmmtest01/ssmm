package cn.hetaoo.handler;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hetaoo.dao.EmployeeDao;
import cn.hetaoo.pojo.Employee;

@Controller
public class TestJson {
	
	@Autowired
	EmployeeDao employees;
	
	@ResponseBody
	@RequestMapping("/testJson")
	public Collection<Employee> testJosn(){
		
		return employees.getAll();
	}
}
