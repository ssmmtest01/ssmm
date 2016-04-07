package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.SysUser;
import sy.serviceimpl.SysUserServiceImpl;

@Controller
@RequestMapping("/userController")
public class UserController {
	private SysUserServiceImpl sysUserServiceImpl;
	
	public SysUserServiceImpl getSysUserServiceImpl() {
		return sysUserServiceImpl;
	}
	@Autowired
	public void setSysUserServiceImpl(SysUserServiceImpl sysUserServiceImpl) {
		this.sysUserServiceImpl = sysUserServiceImpl;
	}

	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable int id,HttpServletRequest request){
		SysUser user=  sysUserServiceImpl.getUserById(id);
		request.setAttribute("user", user);
		System.out.println(user+"???????????????????1111111111111111111");
		return "showUser";
	}
	
	
	
}
