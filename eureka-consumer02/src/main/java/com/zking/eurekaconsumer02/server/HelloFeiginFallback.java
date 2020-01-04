package com.zking.eurekaconsumer02.server;

import org.springframework.stereotype.Component;

@Component
public class HelloFeiginFallback implements hellofeign {

    @Override
    public String hello() {
        return "系统忙，请稍后！！";
    }
}
