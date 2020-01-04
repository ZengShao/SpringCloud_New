package com.zking.eurekaprovider.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@Value("${server.port}")
private  String na;



//    @Value("${hello}")
//private  String hello;

    @Value("${username}")
private  String ds_username;

//    @Value("${password}")
//private  String ds_password;




//    @Value("${spring.redis.password}")
//    private  String redis_password;
//@RequestMapping("hello")
//public  String hello(){
//    return  "生产者编号为您服务【"+na+"】"+"username"+ds_username+"redispassword"+redis_password;
//}
}
