import com.youcode.entities.Objectif;
import com.youcode.entities.User;
import com.youcode.service.ServiceProgressTracker;
import com.youcode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        UserService userServiceBean = applicationContext.getBean("userService", UserService.class);

//        Objectif objectif = Objectif.builder()
//                .id(1)
//                .description("this is desc")
//                .status("done")
//                .build();
        User user = User.builder()
                .id(2)
                .name("test name 2")
                .avatar("test avatar 2")
                .build();
//        user.addObjectif(objectif);
//        objectif.setUser(user);

        userServiceBean.saveUser(user);
        userServiceBean.findAllUsers().stream().forEach(System.out::println);






//        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
//
//        ServiceProgressTracker serviceProgressTrackerBean = appContext.getBean(ServiceProgressTracker.class);
//
//        serviceProgressTrackerBean.showData();





//        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
//
//        User user1 = appContext.getBean("user1", User.class);
//        User user2 = appContext.getBean("user2", User.class);
//
//        user1.setId(1);
//        user2.setId(2);
//
//        System.out.println(user1);
//        System.out.println(user2);
//
//        User user11 = appContext.getBean("user1", User.class);
//        User user22 = appContext.getBean("user2", User.class);
//
//        System.out.println(user11);
//        System.out.println(user22);
    }
}
