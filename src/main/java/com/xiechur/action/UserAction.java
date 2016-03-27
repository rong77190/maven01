package com.xiechur.action;

import com.opensymphony.xwork2.ModelDriven;
import com.xiechur.pageModel.User;
import com.xiechur.service.UserServiceI;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


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

public class UserAction extends BaseAction implements ModelDriven<User> {

    private static final Logger logger = Logger.getLogger(UserAction.class);

         private User user = new User();
         private UserServiceI userService;

//     private String name;
//     private String pwd;
//
//         public String getName() {
//             return name;
//         }
//
//         public void setName(String name) {
//             this.name = name;
//         }
//
//         public String getPwd() {
//             return pwd;
//         }
//
//         public void setPwd(String pwd) {
//             this.pwd = pwd;
//         }

         @Override
         public User getModel() {
             return user;
         }

    public UserServiceI getUserService() {
        return userService;
    }
    @Autowired//自动注入
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    public void test(){
        logger.info("进入action");
//        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        UserServiceI userServiceI = (UserServiceI) ac.getBean("userService");
        userService.test();
    }

         public void reg() throws IOException {
//        String name = ServletActionContext.getRequest().getParameter("name");
//        String pwd = ServletActionContext.getRequest().getParameter("pwd");
             Map<String, Object> map = new HashMap<String, Object>();

        try {
            userService.save(user.getName(), user.getPwd());
            map.put("success", true);
            map.put("msg", "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "注册失败");

        }
             super.writeJson(map);
         }
//        String json = null;
//        try {
//            userService.save(name,pwd);
//            json = "{'success':true,msg:'成功'}";//由于json是要双引号，所以把单引号转义
//                json = "{\"success\":true,\"msg\":\"成功\"}";

//        }catch (Exception e){
//            e.printStackTrace();
//            json = "{\"success\":true,\"msg\":\"失败\"}";
//        }


//        try {
//            ServletActionContext.getResponse().setContentType("text/hteml;charset=utf-8" );
//            ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
//            ServletActionContext.getResponse().getWriter().write(JSON.toJSONString(map));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    public void login() {
//        User u = userService.login(user);
//        Json j = new Json();
//        if (u != null) {
//            j.setSuccess(true);
//            j.setMsg("登陆成功！");
//        } else {
//            j.setMsg("登录失败，用户名或密码错误！");
//        }
//
//        super.writeJson(j);
//    }


     }
