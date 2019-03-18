package com.hr.redis1.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3860179132340463653L;
    private Integer sid;

    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }
}