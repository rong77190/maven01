package com.xiechur.dao.impl;

import com.xiechur.dao.UserDaoI;
import com.xiechur.model.TUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by dell on 2016/3/14.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDaoI {
    public SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    public Serializable save(TUser t) {
        return this.getSessionFactory().getCurrentSession().save(t);
    }
}
