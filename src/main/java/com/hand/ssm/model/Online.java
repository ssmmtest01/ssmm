package com.hand.ssm.model;

import java.util.Date;

public class Online {
    private String id;

    private String ip;

    private Date longindatetime;

    private String longinname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLongindatetime() {
        return longindatetime;
    }

    public void setLongindatetime(Date longindatetime) {
        this.longindatetime = longindatetime;
    }

    public String getLonginname() {
        return longinname;
    }

    public void setLonginname(String longinname) {
        this.longinname = longinname == null ? null : longinname.trim();
    }
}