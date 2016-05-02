package com.xiechur.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "department", schema = "", catalog = "db_jsp01")
public class TDepartment {
    private String deptName;
    private String building;
    private BigDecimal budget;

    @Id
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "building")
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Basic
    @Column(name = "budget")
    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDepartment that = (TDepartment) o;

        if (budget != null ? !budget.equals(that.budget) : that.budget != null) return false;
        if (building != null ? !building.equals(that.building) : that.building != null) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptName != null ? deptName.hashCode() : 0;
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        return result;
    }
}
