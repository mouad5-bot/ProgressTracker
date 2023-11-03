import com.youcode.repository.TestRespository;
import com.youcode.repository.TestRespositoryImp;
import com.youcode.service.TestService;
import com.youcode.service.TestServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "testService")
    public TestService getTestService(){
        TestServiceImp service = new TestServiceImp(testRespository());
        //service.setTestRespository(testRespository());
        return service;
    }

    @Bean(name = "testRepository")
    public TestRespository testRespository(){
        return new TestRespositoryImp();
    }
}
