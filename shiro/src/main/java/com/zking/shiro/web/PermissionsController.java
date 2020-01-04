package com.zking.shiro.web;

import com.zking.shiro.model.SysPermission;
import com.zking.shiro.model.SysRole;
import com.zking.shiro.model.SysRolePermission;
import com.zking.shiro.model.UserInfo;
import com.zking.shiro.sevice.*;
import com.zking.shiro.sevice.impl.LoginServiceImpl;
import com.zking.shiro.util.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Permissisons")
public class PermissionsController {

    @Autowired
    SysPermissionService sysPermissionService;

    @Autowired
    LoginServiceImpl loginService;

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    SysRolePermissionService sysRolePermissionService;

    @Autowired
    SysRoleMapperService sysRoleMapperService;

    JsonData  jsonData;

    @RequestMapping("/tree")
    public JsonData tree(){
        jsonData = new JsonData();
        List<SysPermission> sysPermissions = sysPermissionService.selectByPermission();

        jsonData.setCode(0);
        jsonData.setResult(sysPermissions);
        return jsonData;
    }

    @GetMapping("/add")
    public JsonData add(SysPermission sysPermission){
        jsonData = new JsonData();
        int add = sysPermissionService.insert(sysPermission);

        jsonData.setCode(0);
        jsonData.setResult(add);
        return jsonData;
    }

    @RequestMapping("/List")
    public JsonData List(){
        jsonData = new JsonData();
        List<UserInfo> userInfo = userInfoService.selectUserInfo();

        jsonData.setCode(0);
        jsonData.setResult(userInfo);


        return jsonData;
    }

    @RequestMapping("/state")
    @RequiresPermissions("Permissisons:state")//权限管理;
    public JsonData state(UserInfo userInfo){
        jsonData = new JsonData();
        System.out.println(userInfo);
        int id = userInfoService.updateState(userInfo);

        if (id>0){
            jsonData.setCode(0);
        }else{
            jsonData.setCode(-1);
        }
        jsonData.setResult(id);
        return jsonData;
    }

    @RequestMapping("/menu")
    public JsonData menu(UserInfo userInfo){
        System.out.println(userInfo.getUid());
        jsonData = new JsonData();
        List<SysPermission> list = sysPermissionService.selectByPermission();

        jsonData.setCode(0);
        jsonData.setResult(list);
        return jsonData;
    }

    @RequestMapping("/listmenu")
    public JsonData listmenu(UserInfo userInfo){
        JsonData jsonData = new JsonData();
        List<SysPermission> list = sysPermissionService.listPermissionsByUserName(userInfo);

        jsonData.setCode(0);
        jsonData.setResult(list);
        return jsonData;
    }

    @RequestMapping("/SelectRole")
    public JsonData SelectRole(UserInfo userInfo){
        JsonData jsonData = new JsonData();
        List<SysRole> list =sysRoleMapperService .selectByRole(userInfo);

        jsonData.setResult(list);
        return jsonData;
    }


    @RequestMapping("/Updata")
    public JsonData uppermission(String ac,Integer id,String li){
        jsonData=new JsonData();
        String sa = li.replace("[","");
        String sb = sa.replace("]","");
        String[] splits = sb.split(",");


        String aa = ac.replace("[","");
        String bb = aa.replace("]","");
        String[] split = bb.split(",");

        for (String s:splits ) {
            if(bb.contains(s)){
            }else{
                System.out.println("不包含"+s);
                SysRolePermission rolePermission=new SysRolePermission();
                rolePermission.setPermissionId(Integer.parseInt(s));
                rolePermission.setRoleId(id);
                rolePermission.setParentId(0);
                sysRolePermissionService.delPermission(rolePermission);
                jsonData.setCode(-1);
                jsonData.setMessage("修改！");
            }
        }
        for (String s:split ) {
            if(sb.contains(s)){
            }else{
                System.out.println("增加");
                SysRolePermission rolePermission=new SysRolePermission();
                rolePermission.setPermissionId(Integer.parseInt(s));
                rolePermission.setRoleId(id);
                rolePermission.setParentId(0);
                sysRolePermissionService.insert(rolePermission);
                jsonData.setCode(1);
                jsonData.setMessage("修改！");
            }
        }
        return  jsonData;
    }

}
