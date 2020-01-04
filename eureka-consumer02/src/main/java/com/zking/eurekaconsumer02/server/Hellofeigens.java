package com.zking.eurekaconsumer02.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("eureka-provider")
public interface Hellofeigens {
    @RequestMapping("/hello/{name}")
    String  helloa(@PathVariable("name") String name);
    @RequestMapping("/duoge")
    String  duoge(@RequestParam("name") String name);
    @RequestMapping("/duoges")
    String  duoges(@RequestParam("name") String name,@RequestParam("sex") String sex);
}
