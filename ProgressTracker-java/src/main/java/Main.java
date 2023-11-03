import com.youcode.model.Test;
import com.youcode.service.TestService;
import com.youcode.service.TestServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        TestService testService = applicationContext.getBean("testService", TestService.class);

        //TestService testService = new TestServiceImp();

        System.out.println(testService.alltests().get(0).getName());
        System.out.println(testService.alltests().get(0).getAge());
    }
}
