package com.xiechur.service.impl;

import com.xiechur.service.UserServiceI;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * Created by dell on 2016/3/14.
 */

@Service(value = "userService")
public class UserServiceImpl implements UserServiceI {
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Override
    public void test(){
        logger.info("测试测试");
    }
}
