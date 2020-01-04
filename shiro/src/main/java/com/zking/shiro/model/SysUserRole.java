package com.zking.shiro.model;

public class SysUserRole {
    private Integer uid;

    private Integer roleId;

    public SysUserRole(Integer uid, Integer roleId) {
        this.uid = uid;
        this.roleId = roleId;
    }

    public SysUserRole() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}