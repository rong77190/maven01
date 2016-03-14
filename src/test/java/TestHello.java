import com.xiechur.service.UserServiceI;
import com.xiechur.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.apache.log4j.Logger;

/**
 * Created by dell on 2016/3/14.
 */
public class TestHello {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Test
        public void test(){

        ApplicationContext  appletContext = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        UserServiceI userServiceI = (UserServiceI) appletContext.getBean("userService");
        userServiceI.test();
    }
}
