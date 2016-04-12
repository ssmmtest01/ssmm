package com.hetaoo.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hetaoo.pojo.User;

//@SessionAttributes(value="user",types=String.class)
@Controller
public class SpringmvcTest {
	private static  final String SUCCESS = "success";
	
	@RequestMapping("/testRedirect")
	public String testRedirect(){
		System.out.println("test redirect");
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/testView")
	public String testView(){
		System.out.println("test view");
		return "helloView";
	}
	
	@RequestMapping("/testViewAndViewResolvel")
	public String testViewAndViewResolvel(){
		System.out.println("testViewAndViewResolvel");
		return SUCCESS;
	}
	
	/**
	 * 每次目标方法调用之前都会调用@modelattribute注解方法
	 * @param id
	 * @param map
	 */
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false)Integer id,Map<String,Object>map){
		if(id != null){
			System.out.println("模拟数据库取数据");
			User user = new User(1,"hetaoo","123456",18);
			map.put("user", user);
		}
	}
	
	/**
	 * 运行流程
	 * 1.执行@modelattribute注解修饰的方法:从数据库中取出对象，把对象加到map中，键为user
	 * 2.SpringMVC 从map中取出User对象，并把表单的参数赋给user对象的对应属性
	 * 3.springmvc 把上述对象传入目标方法的参数
	 * @param user
	 * @return
	 */
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){
		System.out.println("User被修改为："+ user);
		return SUCCESS;
	}
	
	
	/**
	 * SessionAttributes 除了可以通过属性名指定需要放到会 
	 * 话中的属性外，还可以通过模型属性的对象类型指定哪些
	 * 模型属性需要放到会话中
	 * @param map
	 * @return
	 */
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String,Object> map){
		User user = new User("hetaoo", "123456", 18);
		map.put("user", user);
		map.put("name","hetaoo");
		return SUCCESS;
	}
	
	/**
	 * 目标方法可以添加为map类型的参数
	 * @param map
	 * @return
	 */
	@RequestMapping("/testMapAndModel")
	public String testMapAndModel(Map<String,Object> map){
		map.put("names", Arrays.asList("tom","joek"));
		map.put("time",new Date());
		return SUCCESS;
	}
	
	/**
	 * 控制器处理方法的返回值如果为 ModelAndView, 则其既
	 * 包含视图信息，也包含模型数据信息。
	 * @return
	 */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(){
		String viewName = SUCCESS;
		ModelAndView mv = new ModelAndView(viewName);
		mv.addObject("time", new Date());
		return mv;
	}
	

	/**
	 * Spring MVC 会按请求参数名和 POJO 属性名进行自动匹
	 * 配，自动为该对象填充属性值。支持级联属性。
	 * 如address.city等
	 * @param user
	 * @return
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user){
		System.out.println(user);
		return SUCCESS;
	}
	
	
	/**
	 * @CookieValue 可以让处理方法入参绑定某个 Cookie 值  属性和requestParam一样
	 * @param cv
	 * @return
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID")String cv){
		System.out.println("testCookieValue:"+cv);
		return SUCCESS;
	}
	
	/**
	 * @requestHeader 和requestparam 差不多
	 * @param al
	 * @return
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language")String al){
		System.out.println("testRequestHeader:" + al);
		return SUCCESS;
	}
	
	
	
	
	/**
	 * @requestParam 映射请求参数
	 * value值即请求参数的参数名
	 * required 该参数是否为必须 默认为true
	 * defaultvalue 请求参数的默认值
	 */
	@RequestMapping("/testrequestparams")
	public String testRequestParams(@RequestParam(value="username") String username,
	@RequestParam(value="age",required=false,defaultValue="0") int age){
		System.out.println("testrequestparams; username:"+ username +",age:"+age);
		return SUCCESS;
	}
	
	/**
	 * REST test
	 * @param 
	 * @return
	 */
	
	@RequestMapping(value="/testput/{id}",method=RequestMethod.PUT)
	public String testPut(@PathVariable("id") Integer id){
		System.out.println("test put:"+ id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testdelete/{id}",method=RequestMethod.DELETE)
	public String testDelete(@PathVariable("id") Integer id){
		System.out.println("test delete:"+ id);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testpost",method=RequestMethod.POST)
	public String testPost(){
		System.out.println("test post");
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testget/{id}",method=RequestMethod.GET)
	public String testGet(@PathVariable("id") Integer id){
		System.out.println("test get:"+ id);
		
		return SUCCESS;
	}
	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		System.out.println("PathVariable:" + id);
		return SUCCESS;
	}
	
	@RequestMapping("/testAut/*/abc")
	public String testAut(){
		System.out.println("testAut");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testmethod",method=RequestMethod.POST)
	public String testMethod(){
		System.out.println("test springMethod");
		return "success";
	}
	
	@RequestMapping(value="/testParamsAndHeaders",
			params = "!username")
	public String testParamsAndHeaders(){
		System.out.println("testParamsAndHeards11");
		return SUCCESS;
	}
}
