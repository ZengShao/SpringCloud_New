package com.zking.shiro.dao;

import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectUserInfo();

    int updateState(UserInfo userInfo);
//
//    List<SysPermission> listPermissionsByUserName(UserInfo user);//查询指定用户拥有的权限
//    SysRole listRolesByUserName(UserInfo user);//查询指定用户拥有的角色
}