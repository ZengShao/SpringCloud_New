package com.zking.eurekaprovider.model;

public class Tcomment {
    private Integer cid;

    private Integer csid;

    private Integer cuid;

    private String content;

    public Tcomment(Integer cid, Integer csid, Integer cuid, String content) {
        this.cid = cid;
        this.csid = csid;
        this.cuid = cuid;
        this.content = content;
    }

    public Tcomment() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}