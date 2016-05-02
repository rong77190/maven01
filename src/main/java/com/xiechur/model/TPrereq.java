package com.xiechur.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "prereq", schema = "", catalog = "db_jsp01")
@IdClass(TPrereqPK.class)
public class TPrereq {
    private String courseId;
    private String prereqId;

    @Id
    @Column(name = "course_id")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "prereq_id")
    public String getPrereqId() {
        return prereqId;
    }

    public void setPrereqId(String prereqId) {
        this.prereqId = prereqId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPrereq tPrereq = (TPrereq) o;

        if (courseId != null ? !courseId.equals(tPrereq.courseId) : tPrereq.courseId != null) return false;
        if (prereqId != null ? !prereqId.equals(tPrereq.prereqId) : tPrereq.prereqId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (prereqId != null ? prereqId.hashCode() : 0);
        return result;
    }
}
