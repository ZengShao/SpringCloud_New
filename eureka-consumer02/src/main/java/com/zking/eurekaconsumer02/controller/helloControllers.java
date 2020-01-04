package com.zking.eurekaconsumer02.controller;

import com.zking.eurekaconsumer02.server.Hellofeigens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControllers {

@Autowired
private Hellofeigens hellofeigens;


@RequestMapping("/helloa")
public String hello(String name){
    System.out.println("消费者2你调用了helloa的单参数,name="+name);
    String helloa = hellofeigens.helloa(name);
    System.out.println("name="+name);
    return  helloa;
}
    @RequestMapping("/duoge")
public  String  duoge( String name){
        System.out.println("消费者2你调用了 douge方法 的单参数 RequestParam ，name=   "+name);
        String duoge = hellofeigens.duoge(name);

        return  duoge;
}

    @RequestMapping("/duoges")
    public  String  duoges(String name,String sex){
        System.out.println("消费者2你调用了 duoges 的多参数 RequestParam ，name=   "+name+"sex+"+sex);
        String duoges = hellofeigens.duoges(name, sex);

        return  duoges;
    }

}
