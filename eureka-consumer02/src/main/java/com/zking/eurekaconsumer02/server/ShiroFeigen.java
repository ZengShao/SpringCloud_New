package com.zking.eurekaconsumer02.server;

import model.book1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
@FeignClient("shiro")
public interface ShiroFeigen {
    @RequestMapping("/login")
    String  login(@RequestParam("userName") String userName, @RequestParam("password") String password);

    @RequestMapping("/Permissisons/tree")
    String tree();

    @RequestMapping("/Permissisons/List")
    String List();
}
