package com.xiechur.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/24.
 */
@Entity
@Table(name = "student", schema = "", catalog = "db_jsp01")
public class TStudent {
    private String id;
    private String name;
    private Integer totCred;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tot_cred")
    public Integer getTotCred() {
        return totCred;
    }

    public void setTotCred(Integer totCred) {
        this.totCred = totCred;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TStudent tStudent = (TStudent) o;

        if (id != null ? !id.equals(tStudent.id) : tStudent.id != null) return false;
        if (name != null ? !name.equals(tStudent.name) : tStudent.name != null) return false;
        if (totCred != null ? !totCred.equals(tStudent.totCred) : tStudent.totCred != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (totCred != null ? totCred.hashCode() : 0);
        return result;
    }
}
