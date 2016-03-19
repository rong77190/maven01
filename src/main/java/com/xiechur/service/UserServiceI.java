package com.xiechur.service;

import com.xiechur.model.TUser;

import java.io.Serializable;

/**
 * Created by dell on 2016/3/14.
 */
public interface UserServiceI {
    public void test();
    public Serializable save(TUser t);

    public   void save(String name, String pwd);
}
