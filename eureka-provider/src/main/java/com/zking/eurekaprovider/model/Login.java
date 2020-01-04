package com.zking.eurekaprovider.model;

public class Login {
    private Integer aid;

    private Integer auid;

    private String account;

    private String passwrord;

    private String state;

    private String aname;

    public Login(Integer aid, Integer auid, String account, String passwrord, String state, String aname) {
        this.aid = aid;
        this.auid = auid;
        this.account = account;
        this.passwrord = passwrord;
        this.state = state;
        this.aname = aname;
    }

    public Login() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswrord() {
        return passwrord;
    }

    public void setPasswrord(String passwrord) {
        this.passwrord = passwrord;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}