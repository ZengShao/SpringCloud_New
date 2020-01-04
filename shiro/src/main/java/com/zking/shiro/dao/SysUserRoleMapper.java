package com.zking.shiro.dao;

import com.zking.shiro.model.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}