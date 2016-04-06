//package testMybatis;
//
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.alibaba.fastjson.JSON;
//import com.hand.ssm.model.user;
//import com.hand.ssm.service.userService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
//public class Test1 {
//	private userService userService;
//	public userService getUserService() {
//		return userService;
//	}
//@Autowired
//	public void setUserService(userService userService) {
//		this.userService = userService;
//	}
//
//	@Test
//	public void testMybatis(){
////			user byId = userService.getById(1);
////			System.out.println(byId.getId());
////			System.out.println(byId.getName());
////			String jsonString = JSON.toJSONString(byId);
////			System.out.println(jsonString);
//			
////			List<user> all = userService.getAll();
////			String all1 = JSON.toJSONString(all);
////			System.out.println(all1);
////			System.out.println("-------");
//			List<user> alll = userService.getAll2();
//			String all1l = JSON.toJSONString(alll);
//			System.out.println(all1l);
//	}
//	
//	@Test
//	public void test2(){
//		userService.deleteUser(3);
//	}
//	
//	
//	@Test
//	public void test3(){
//	    user user=new user();
//	    user.setId(1);
//	    user.setName("heihei");
//		userService.updateUser(user);
//	}
//	
//	@Test
//	public void test4(){
//		user user=new user();
//		user.setName("lalala");
//		userService.addUser(user);
//	}
//	
//	@Test
//	 public void test5(){
//		List<user> all3 = userService.getAll3();
//		String jsonString = JSON.toJSONString(all3);
//		System.out.println(jsonString);
//		
//	}
//}
