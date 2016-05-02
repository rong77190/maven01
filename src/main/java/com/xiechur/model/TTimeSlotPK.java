package com.xiechur.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by dell on 2016/4/29.
 */
public class TTimeSlotPK implements Serializable {
    private String timeSlotId;
    private String day;
    private BigInteger startHr;
    private BigInteger startMin;

    @Column(name = "time_slot_id")
    @Id
    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    @Column(name = "day")
    @Id
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Column(name = "start_hr")
    @Id
    public BigInteger getStartHr() {
        return startHr;
    }

    public void setStartHr(BigInteger startHr) {
        this.startHr = startHr;
    }

    @Column(name = "start_min")
    @Id
    public BigInteger getStartMin() {
        return startMin;
    }

    public void setStartMin(BigInteger startMin) {
        this.startMin = startMin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTimeSlotPK that = (TTimeSlotPK) o;

        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (startHr != null ? !startHr.equals(that.startHr) : that.startHr != null) return false;
        if (startMin != null ? !startMin.equals(that.startMin) : that.startMin != null) return false;
        if (timeSlotId != null ? !timeSlotId.equals(that.timeSlotId) : that.timeSlotId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timeSlotId != null ? timeSlotId.hashCode() : 0;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (startHr != null ? startHr.hashCode() : 0);
        result = 31 * result + (startMin != null ? startMin.hashCode() : 0);
        return result;
    }
}
