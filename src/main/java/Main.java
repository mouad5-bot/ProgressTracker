import com.youcode.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        User user1 = appContext.getBean("user1", User.class);
        User user2 = appContext.getBean("user2", User.class);

        user1.setId(1);
        user2.setId(2);

        System.out.println(user1);
        System.out.println(user2);



        User user11 = appContext.getBean("user1", User.class);
        User user22 = appContext.getBean("user2", User.class);

        System.out.println(user11);
        System.out.println(user22);
    }
}
