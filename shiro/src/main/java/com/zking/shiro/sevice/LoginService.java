package com.zking.shiro.sevice;

import com.zking.shiro.model.LoginResult;
import com.zking.shiro.model.SysPermission;
import com.zking.shiro.util.JsonData;
import org.apache.shiro.session.Session;

import java.util.List;

/**
 * @Author: xu.dm
 * @Date: 2018/8/11 21:34
 * @Description:
 */
public interface LoginService {
    JsonData login(String userName, String password);
    String getCurrentUserName();
    Session getSession();
    void logout();

}
