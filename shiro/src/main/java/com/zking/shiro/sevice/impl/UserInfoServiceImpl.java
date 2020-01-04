package com.zking.shiro.sevice.impl;

import com.zking.shiro.dao.SysPermissionMapper;
import com.zking.shiro.dao.UserInfoDao;
import com.zking.shiro.dao.UserInfoMapper;
import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import com.zking.shiro.sevice.UserInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println(username);
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return 0;
    }

    @Override
    public int insert(UserInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(UserInfo record) {
        return 0;
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer uid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UserInfo> selectUserInfo() {
        return userInfoMapper.selectUserInfo();
    }

    @Override
    public int updateState(UserInfo userInfo) {
        return userInfoMapper.updateState(userInfo);
    }

}