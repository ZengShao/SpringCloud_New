package com.zking.shiro.config;

import com.zking.shiro.util.JsonData;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class NoPermissionException {
    @ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    public JsonData handleShiroException(Exception ex) {
        JsonData jsonData = new JsonData();
        jsonData.setCode(403);
        jsonData.setMessage("您暂无该权限");
        return jsonData;
    }
    @ResponseBody
    @ExceptionHandler(AuthorizationException.class)
    public JsonData AuthorizationException(Exception ex) {
        JsonData jsonData = new JsonData();
        jsonData.setCode(403);
        jsonData.setMessage("权限认证失败");
        return jsonData;
    }
}


