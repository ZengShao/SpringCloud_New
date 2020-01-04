package com.zking.shiro.model;

public class SysRolePermission {
    private Integer permissionId;

    private Integer roleId;

    private Integer parentId;

    public SysRolePermission(Integer permissionId, Integer roleId, Integer parentId) {
        this.permissionId = permissionId;
        this.roleId = roleId;
        this.parentId = parentId;
    }

    public SysRolePermission() {
        super();
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}