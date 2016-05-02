package com.xiechur.model;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "course", schema = "", catalog = "db_jsp01")
public class TCourse {
    private String courseId;
    private String title;
    private BigInteger credits;

    @Id
    @Column(name = "course_id")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "credits")
    public BigInteger getCredits() {
        return credits;
    }

    public void setCredits(BigInteger credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCourse tCourse = (TCourse) o;

        if (courseId != null ? !courseId.equals(tCourse.courseId) : tCourse.courseId != null) return false;
        if (credits != null ? !credits.equals(tCourse.credits) : tCourse.credits != null) return false;
        if (title != null ? !title.equals(tCourse.title) : tCourse.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (credits != null ? credits.hashCode() : 0);
        return result;
    }
}
