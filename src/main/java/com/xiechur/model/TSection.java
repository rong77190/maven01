package com.xiechur.model;

import javax.persistence.*;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "section", schema = "", catalog = "db_jsp01")
@IdClass(TSectionPK.class)
public class TSection {
    private String courseId;
    private String secId;
    private String semester;
    private int year;
    private String timeSlotId;

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

    @Basic
    @Column(name = "time_slot_id")
    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSection tSection = (TSection) o;

        if (year != tSection.year) return false;
        if (courseId != null ? !courseId.equals(tSection.courseId) : tSection.courseId != null) return false;
        if (secId != null ? !secId.equals(tSection.secId) : tSection.secId != null) return false;
        if (semester != null ? !semester.equals(tSection.semester) : tSection.semester != null) return false;
        if (timeSlotId != null ? !timeSlotId.equals(tSection.timeSlotId) : tSection.timeSlotId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (secId != null ? secId.hashCode() : 0);
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (timeSlotId != null ? timeSlotId.hashCode() : 0);
        return result;
    }
}
