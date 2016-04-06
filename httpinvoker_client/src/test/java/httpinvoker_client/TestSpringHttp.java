package httpinvoker_client;

import org.felix.model.User;
import org.felix.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHttp {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("application-servlet.xml");
     
    public static UserService getUserService(){
        return (UserService)context.getBean("httpTestService");
    }
    public static void main(String[] args) {
        User user = new User();
        user.setName("felix");
        user.setPassword("felix");
        getUserService().add(user);
    }
}