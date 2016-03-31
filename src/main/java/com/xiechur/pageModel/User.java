package com.xiechur.pageModel;


import java.io.Serializable;

/**
 * Created by dell on 2016/3/25.
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;

    public User() {
        super();
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User(String name, String pwd, int id) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
