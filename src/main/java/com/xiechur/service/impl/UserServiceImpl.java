package com.xiechur.service.impl;

import com.xiechur.dao.UserDaoI;
import com.xiechur.model.TUser;
import com.xiechur.pageModel.Json;
import com.xiechur.pageModel.User;
import com.xiechur.service.UserServiceI;
import com.xiechur.util.Encrypt;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Savepoint;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


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

    @Override
    public void save(User user) {
        TUser t = new TUser();
        t.setUserName(user.getName());
        t.setPassword(user.getPwd());
        t.setPassword(Encrypt.e(user.getPwd()));//加密
//        BeanUtils.copyProperties(user, t , new String[] { "pwd" });
// 相等名的copy,但是我手残写的User中的name,pwd跟Tuser中username，password名字不一样这里就不可以弄进去了
//        t.setId((int) System.currentTimeMillis());
        userDao.save(t);


    }

    @Override
    public User login(User user) {
        TUser t = userDao.get("from Tuser t  where t.userName=' " + user.getName() + " 'and t.password=' " + Encrypt.e(user.getPwd()) + " ' ");

        if (t != null)
            return user;
        return null;
    }
}
