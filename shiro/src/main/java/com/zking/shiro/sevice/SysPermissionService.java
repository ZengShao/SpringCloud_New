package com.zking.shiro.sevice;

import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SysPermissionService {

    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);


    @Transactional(readOnly = true)
    List<SysPermission> selectByPermissions(Integer permissionId);
    @Transactional(readOnly = true)
    List<SysPermission> selectByPermission();
    @Transactional(readOnly = true)
    List<SysPermission> listPermissionsByUserName11(UserInfo user);//查询指定用户拥有的权限
    @Transactional(readOnly = true)
    List<SysPermission> listPermissionsByUserName(UserInfo user);//查询指定用户拥有的权限
    List<SysPermission> listPermissionsByUserName1(UserInfo user);//查询指定用户拥有的权限
    List<SysPermission> listPermissionsByUserName2(UserInfo user);//查询指定用户拥有的权限
    @Transactional(readOnly = true)
    SysRole listRolesByUserName(UserInfo user);//查询指定用户拥有的角色


}
