package sy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@RequestMapping("/hello")
@org.springframework.stereotype.Controller
public class HelloWorldController implements Controller{

	@Override
	@RequestMapping("/a")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		//1、收集参数、验证参数
		//2、绑定参数到命令对象
		//3、将命令对象传入业务对象进行业务处理
		//4、选择下一个页面
		System.out.println("hello");
		ModelAndView mv = new ModelAndView();
		//添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "Hello World!zhang");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello2");
		
		//return new ModelAndView("redirect:/hello2");
		return mv;
	}

}

/*@Controller
public class HelloWorldController {
	@RequestMapping("/Hello")
	public void hello(HttpServletRequest req, HttpServletResponse resp) {
	req.setAttribute("msg", "hello world!!!");
	try {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
}
*/
