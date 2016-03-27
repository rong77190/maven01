import com.xiechur.model.TUser;
import com.xiechur.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * Created by dell on 2016/3/14.
 */
public class TestHibernate {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
        UserServiceI userService = (UserServiceI)ac.getBean("userService");
        TUser t = new TUser();
        t.setId(123);
//        t.setId(UUID.randomUUID().toString());
        t.setUserName("lisi");
        t.setPassword("00000");
        userService.save(t);
    }
}
