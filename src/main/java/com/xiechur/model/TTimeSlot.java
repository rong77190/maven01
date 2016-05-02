package com.xiechur.model;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by dell on 2016/4/29.
 */
@Entity
@Table(name = "time_slot", schema = "", catalog = "db_jsp01")
@IdClass(TTimeSlotPK.class)
public class TTimeSlot {
    private String timeSlotId;
    private String day;
    private BigInteger startHr;
    private BigInteger startMin;
    private BigInteger endHr;
    private BigInteger endMin;

    @Id
    @Column(name = "time_slot_id")
    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    @Id
    @Column(name = "day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Id
    @Column(name = "start_hr")
    public BigInteger getStartHr() {
        return startHr;
    }

    public void setStartHr(BigInteger startHr) {
        this.startHr = startHr;
    }

    @Id
    @Column(name = "start_min")
    public BigInteger getStartMin() {
        return startMin;
    }

    public void setStartMin(BigInteger startMin) {
        this.startMin = startMin;
    }

    @Basic
    @Column(name = "end_hr")
    public BigInteger getEndHr() {
        return endHr;
    }

    public void setEndHr(BigInteger endHr) {
        this.endHr = endHr;
    }

    @Basic
    @Column(name = "end_min")
    public BigInteger getEndMin() {
        return endMin;
    }

    public void setEndMin(BigInteger endMin) {
        this.endMin = endMin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTimeSlot tTimeSlot = (TTimeSlot) o;

        if (day != null ? !day.equals(tTimeSlot.day) : tTimeSlot.day != null) return false;
        if (endHr != null ? !endHr.equals(tTimeSlot.endHr) : tTimeSlot.endHr != null) return false;
        if (endMin != null ? !endMin.equals(tTimeSlot.endMin) : tTimeSlot.endMin != null) return false;
        if (startHr != null ? !startHr.equals(tTimeSlot.startHr) : tTimeSlot.startHr != null) return false;
        if (startMin != null ? !startMin.equals(tTimeSlot.startMin) : tTimeSlot.startMin != null) return false;
        if (timeSlotId != null ? !timeSlotId.equals(tTimeSlot.timeSlotId) : tTimeSlot.timeSlotId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timeSlotId != null ? timeSlotId.hashCode() : 0;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (startHr != null ? startHr.hashCode() : 0);
        result = 31 * result + (startMin != null ? startMin.hashCode() : 0);
        result = 31 * result + (endHr != null ? endHr.hashCode() : 0);
        result = 31 * result + (endMin != null ? endMin.hashCode() : 0);
        return result;
    }
}
