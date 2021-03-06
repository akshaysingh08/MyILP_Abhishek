package com.ilp.ilpschedule.model;

import com.ilp.ilpschedule.util.Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Notification implements Comparable<Notification> {
    public static SimpleDateFormat inputDateFormat = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss", Locale.US);
    public static SimpleDateFormat outputDateFormat = new SimpleDateFormat(
            "E, dd MMM yyyy", Locale.US);
    private Date date;
    private String msg;
    private long id;

    public Notification(Date date, String msg, long id) {
        super();
        this.date = date;
        this.msg = msg;
        this.id = id;
    }

    public Notification() {

    }

    @Override
    public String toString() {
        return "Notification [date=" + date + ", msg=" + msg + ", id=" + id
                + "]";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isValid() {
        return Util.checkString(msg) && id > 0 && date != null;
    }

    @Override
    public int compareTo(Notification another) {
        return Double.compare(this.getId(), another.getId());
    }
}
