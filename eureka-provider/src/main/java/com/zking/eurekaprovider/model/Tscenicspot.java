package com.zking.eurekaprovider.model;

public class Tscenicspot {
    private Integer sid;

    private String sname;

    private Integer type;

    private Integer number;

    public Tscenicspot(Integer sid, String sname, Integer type, Integer number) {
        this.sid = sid;
        this.sname = sname;
        this.type = type;
        this.number = number;
    }

    public Tscenicspot() {
        super();
    }

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
        this.sname = sname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}