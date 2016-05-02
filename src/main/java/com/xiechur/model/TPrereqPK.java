package com.xiechur.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dell on 2016/4/29.
 */
public class TPrereqPK implements Serializable {
    private String courseId;
    private String prereqId;

    @Column(name = "course_id")
    @Id
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Column(name = "prereq_id")
    @Id
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

        TPrereqPK tPrereqPK = (TPrereqPK) o;

        if (courseId != null ? !courseId.equals(tPrereqPK.courseId) : tPrereqPK.courseId != null) return false;
        if (prereqId != null ? !prereqId.equals(tPrereqPK.prereqId) : tPrereqPK.prereqId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (prereqId != null ? prereqId.hashCode() : 0);
        return result;
    }
}
