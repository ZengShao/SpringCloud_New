package com.zking.eurekaprovider.model;

public class Register {
    private Integer rid;

    private String rcound;

    private String passwrord;

    public Register(Integer rid, String rcound, String passwrord) {
        this.rid = rid;
        this.rcound = rcound;
        this.passwrord = passwrord;
    }

    public Register() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRcound() {
        return rcound;
    }

    public void setRcound(String rcound) {
        this.rcound = rcound;
    }

    public String getPasswrord() {
        return passwrord;
    }

    public void setPasswrord(String passwrord) {
        this.passwrord = passwrord;
    }
}