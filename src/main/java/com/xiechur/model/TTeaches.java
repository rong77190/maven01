package com.xiechur.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "teaches", schema = "", catalog = "db_jsp01")
@IdClass(TTeachesPK.class)
public class TTeaches {
    private String id;
    private String courseId;
    private String secId;
    private String semester;
    private int year;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @Column(name = "course_id")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "sec_id")
    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    @Id
    @Column(name = "semester")
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Id
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeaches tTeaches = (TTeaches) o;

        if (year != tTeaches.year) return false;
        if (courseId != null ? !courseId.equals(tTeaches.courseId) : tTeaches.courseId != null) return false;
        if (id != null ? !id.equals(tTeaches.id) : tTeaches.id != null) return false;
        if (secId != null ? !secId.equals(tTeaches.secId) : tTeaches.secId != null) return false;
        if (semester != null ? !semester.equals(tTeaches.semester) : tTeaches.semester != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (secId != null ? secId.hashCode() : 0);
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
