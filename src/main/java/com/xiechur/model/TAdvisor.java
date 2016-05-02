package com.xiechur.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "advisor", schema = "", catalog = "db_jsp01")
public class TAdvisor {
    private String sId;

    @Id
    @Column(name = "s_ID")
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAdvisor tAdvisor = (TAdvisor) o;

        if (sId != null ? !sId.equals(tAdvisor.sId) : tAdvisor.sId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sId != null ? sId.hashCode() : 0;
    }
}
