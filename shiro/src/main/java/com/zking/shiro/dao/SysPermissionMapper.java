package com.zking.shiro.dao;

import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);


    List<SysPermission> selectByPermission();

    List<SysPermission> selectByPermissions(Integer permissionId);

    List<SysPermission> listPermissionsByUserName11(UserInfo user);//查询指定用户拥有的权限

    List<SysPermission> listPermissionsByUserName(UserInfo user);//查询指定用户拥有的权限
    List<SysPermission> listPermissionsByUserName1(UserInfo user);//查询指定用户拥有的权限
    List<SysPermission> listPermissionsByUserName2(UserInfo user);//查询指定用户拥有的权限

    SysRole listRolesByUserName(UserInfo user);//查询指定用户拥有的角色

}