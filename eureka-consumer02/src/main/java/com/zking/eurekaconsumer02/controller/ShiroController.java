package com.zking.eurekaconsumer02.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.zking.eurekaconsumer02.model.Bookvo;
import com.zking.eurekaconsumer02.server.Bookfeigen;
import com.zking.eurekaconsumer02.server.ShiroFeigen;
import model.book1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ShiroController {

    @Autowired
    private ShiroFeigen shiroFeigen;

    @RequestMapping("/shiro")
    public  String  shiro(String userName,String password){

        String helloa = shiroFeigen.login(userName,password);
        return helloa;
    }

    @RequestMapping("tree")
    public  String  tree(){
        String helloa = shiroFeigen.tree();
        return helloa;
    }

    @RequestMapping("List")
    public  String  List(){

        String helloa = shiroFeigen.List();
        return helloa;
    }
}
