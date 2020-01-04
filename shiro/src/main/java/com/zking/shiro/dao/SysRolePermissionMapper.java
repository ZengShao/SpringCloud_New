package com.zking.shiro.dao;

import com.zking.shiro.model.SysRolePermission;

public interface SysRolePermissionMapper {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    int delPermission(SysRolePermission record);
}