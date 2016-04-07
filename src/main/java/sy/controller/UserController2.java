package sy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user2")
public class UserController2 {
	
	@RequestMapping(value="/a" ,method = {RequestMethod.GET })
	public String index(HttpServletRequest request ,HttpServletResponse response){
//		ModelAndView mav = new ModelAndView("index");
//		Map<String ,Object> map = new HashMap<String, Object>();
//		map.put("param", "111");
//		mav.addAllObjects(map);\
		System.out.println("aa");
		request.setAttribute("param", "zeng");
		return "redirect:/index.jsp";
	}
	@RequestMapping("/b")
	public void hello(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("今天天气真好");
		
	}
	
	@RequestMapping("/c")
	public void hello2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		//response.sendRedirect("/ssmm/myjsp/index2.jsp");
		response.sendRedirect("/index.jsp");
	}
	
	@RequestMapping("/d")
	public void hello3(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}
	@RequestMapping("/e")
	public String hello4(){
		return "forward:/index.jsp";
	}
	
	
	@RequestMapping("/f")
	public String hello5(){
		return "forward:b.do";
	}
}
