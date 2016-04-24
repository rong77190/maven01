package com.xiechur.pageModel;

/**
 * Created by dell on 2016/4/24.
 */
public class Student {
    private String id;
    private String name;
    private Integer totCred;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotCred() {
        return totCred;
    }

    public void setTotCred(Integer totCred) {
        this.totCred = totCred;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totCred=" + totCred +
                '}';
    }

}
