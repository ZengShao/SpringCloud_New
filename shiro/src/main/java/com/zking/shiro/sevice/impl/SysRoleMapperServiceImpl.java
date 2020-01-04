package com.zking.shiro.sevice.impl;

import com.zking.shiro.dao.SysRoleMapper;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import com.zking.shiro.sevice.SysRoleMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleMapperServiceImpl implements SysRoleMapperService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(SysRole record) {
        return 0;
    }

    @Override
    public int insertSelective(SysRole record) {
        return 0;
    }

    @Override
    public SysRole selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return 0;
    }

    @Override
    public List<SysRole> selectByRole(UserInfo userInfo) {
        return sysRoleMapper.selectByRole(userInfo);
    }
}
