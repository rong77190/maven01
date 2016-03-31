package com.xiechur.service;

import com.xiechur.model.TUser;
import com.xiechur.pageModel.User;

import java.io.Serializable;

/**
 * Created by dell on 2016/3/14.
 */
public interface UserServiceI {
    public void test();
    public Serializable save(TUser t);

    //    public   void save(String name, String pwd);
    public void save(User user);

    public User login(User user);

}

