package com.zking.eurekaprovider.model;

import java.util.Date;

public class User {
    private Integer uid;

    private String uname;

    private String usex;

    private Integer uage;

    private String tel;

    private String card;

    private Date createdata;

    private Integer state;

    public User(Integer uid, String uname, String usex, Integer uage, String tel, String card, Date createdata, Integer state) {
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.uage = uage;
        this.tel = tel;
        this.card = card;
        this.createdata = createdata;
        this.state = state;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Date getCreatedata() {
        return createdata;
    }

    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}