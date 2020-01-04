package com.zking.shiro.sevice.impl;

import com.zking.shiro.dao.SysPermissionMapper;
import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.UserInfo;
import com.zking.shiro.sevice.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(SysPermission record) {
        System.out.println(2);
        return sysPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(SysPermission record) {
        return 0;
    }

    @Override
    public SysPermission selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysPermission record) {
        return 0;
    }

    @Override
    public List<SysPermission> selectByPermissions(Integer permissionId) {
        return sysPermissionMapper.selectByPermissions(permissionId);
    }


    @Override
    public List<SysPermission> selectByPermission() {
        List<SysPermission> sysNodes = sysPermissionMapper.selectByPermission();
        for ( SysPermission pp :sysNodes) {
            String ds1=pp.getId()+"";
            List<SysPermission>  ssa= sysPermissionMapper.selectByPermissions(Integer.parseInt(ds1));
            for ( SysPermission dd :ssa) {
                String ds=dd.getId()+"";
                List<SysPermission>  sss= sysPermissionMapper.selectByPermissions(Integer.parseInt(ds));
                dd.setChildren(sss);
            }
            pp.setChildren(ssa);
        }
        return sysNodes;
    }

    @Override
    public List<SysPermission> listPermissionsByUserName11(UserInfo user) {
        return null;
    }

    @Override
    public List<SysPermission> listPermissionsByUserName(UserInfo user) {
        List<SysPermission> sysNodes = sysPermissionMapper.listPermissionsByUserName(user);
//        for ( SysPermission pp :sysNodes) {
//            List<SysPermission>  ssa= sysPermissionMapper.listPermissionsByUserName1(user);
//            for ( SysPermission dd :ssa) {
//                List<SysPermission>  sss= sysPermissionMapper.listPermissionsByUserName2(user);
//                dd.setChildren(sss);
//            }
//            pp.setChildren(ssa);
//        }
        return sysNodes;
    }

    @Override
    public List<SysPermission> listPermissionsByUserName1(UserInfo user) {
        return null;
    }

    @Override
    public List<SysPermission> listPermissionsByUserName2(UserInfo user) {
        return null;
    }

    @Override
    public SysRole listRolesByUserName(UserInfo user) {
        return null;
    }


}

