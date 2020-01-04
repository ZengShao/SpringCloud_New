package com.zking.shiro.sevice;

import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectUserInfo();

    int updateState(UserInfo userInfo);


}