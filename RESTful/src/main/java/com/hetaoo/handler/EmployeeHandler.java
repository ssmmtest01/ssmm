package com.hetaoo.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hetaoo.dao.DepartmentDao;
import com.hetaoo.dao.EmployeeDao;
import com.hetaoo.pojo.Employee;

@Controller
public class EmployeeHandler {
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
	@ModelAttribute
	public void getEmp(@RequestParam(value="id",required=false) Integer id , Map<String,Object> map){
		if(id != null){
			map.put("employee", employeeDao.get(id));
		}
		
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String editEmp(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String saveEmp(@PathVariable(value="id") Integer id,Map<String,Object> map ){
		map.put("employee",employeeDao.get(id));
		map.put("demps", departmentDao.getDepartments());
		System.out.println(employeeDao.get(id));
		return "save";
	}
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	public String deleteEmp(@PathVariable Integer id){
		employeeDao.delete(id);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.POST)
	public String saveEmp(Employee employee ){
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map){
		map.put("employees",employeeDao.getAll() );
		System.out.println(employeeDao.getAll());
		return "list";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.GET)
	public String getDemp(Map<String,Object> map){
		map.put("demps", departmentDao.getDepartments());
		map.put("employee",new Employee());
		
		return "save";
	}
}	
