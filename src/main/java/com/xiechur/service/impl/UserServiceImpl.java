package com.xiechur.service.impl;

import com.xiechur.dao.UserDaoI;
import com.xiechur.model.TUser;
import com.xiechur.service.UserServiceI;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Savepoint;


/**
 * Created by dell on 2016/3/14.
 */

@Service(value = "userService")
public class UserServiceImpl implements UserServiceI {
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    private UserDaoI userDao;

    public UserDaoI getUserDao() {
        return userDao;
    }
    @Autowired
    public void setUserDao(UserDaoI userDao) {
        this.userDao = userDao;
    }

    @Override
    public void test(){
        logger.info("测试测试");
    }

    @Override
    public Serializable save(TUser t) {
            return userDao.save(t);
    }


}
