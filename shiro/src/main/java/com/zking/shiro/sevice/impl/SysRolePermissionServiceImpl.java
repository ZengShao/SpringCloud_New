package com.zking.shiro.sevice.impl;

import com.zking.shiro.dao.SysRolePermissionMapper;
import com.zking.shiro.model.SysRolePermission;
import com.zking.shiro.sevice.SysRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRolePermissionServiceImpl implements SysRolePermissionService {


    @Autowired
    SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public int insert(SysRolePermission record) {
        return sysRolePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRolePermission record) {
        return 0;
    }

    @Override
    public int delPermission(SysRolePermission record) {
        return sysRolePermissionMapper.delPermission(record);
    }
}
