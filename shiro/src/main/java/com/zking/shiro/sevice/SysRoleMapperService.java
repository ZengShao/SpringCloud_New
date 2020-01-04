package com.zking.shiro.sevice;

import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SysRoleMapperService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectByRole(UserInfo userInfo);
}
