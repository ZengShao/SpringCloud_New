package com.zking.shiro.sevice;

import com.zking.shiro.model.SysRolePermission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SysRolePermissionService {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    int delPermission(SysRolePermission record);
}
