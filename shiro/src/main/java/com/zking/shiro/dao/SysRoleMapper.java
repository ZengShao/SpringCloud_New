package com.zking.shiro.dao;

import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectByRole(UserInfo userInfo);
}