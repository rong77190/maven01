package com.xiechur.action;

import com.xiechur.service.UserServiceI;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Created by dell on 2016/3/14.
// * @ParentPackage("basePackage")相当于在strcts2.xml 配置了action
// *@Namespace("/")根目录
// * @Namespace("/demo")demo目录下
 *访问userAction!test.action
 */
@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "userAction")//现在会被spring管理因为有了org.apache.struts:struts2-spring-plugin:2.3.4.1的这个包，不用在spring.xml中扫描了

public class UserAction {
    private static final Logger logger = Logger.getLogger(UserAction.class);

    private UserServiceI userServiceI;

    public UserServiceI getUserServiceI() {
        return userServiceI;
    }
    @Autowired//自动注入
    public void setUserServiceI(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    public void test(){
        logger.info("进入action");
//        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        UserServiceI userServiceI = (UserServiceI) ac.getBean("userService");
        userServiceI.test();
    }
}
