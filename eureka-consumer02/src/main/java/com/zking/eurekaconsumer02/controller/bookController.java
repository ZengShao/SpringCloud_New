package com.zking.eurekaconsumer02.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.zking.eurekaconsumer02.model.Bookvo;
import com.zking.eurekaconsumer02.server.Bookfeigen;
import model.book1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {
@Autowired
private Bookfeigen bookfeigen;
@RequestMapping("/book")
public   String  book(book1 book1){
    return bookfeigen.book(book1);
}
    @RequestMapping("/baas")
    public   String  book2(Bookvo book1){
        System.out.println("你访问了BookVo,bookvoname="+book1.getName());
        return bookfeigen.book2(book1);
    }
    @RequestMapping("/book1")
    public   String  book1(Bookvo book1){
        book1 book11=new book1();
        BeanUtil.copyProperties(book1,book11, CopyOptions.create().setIgnoreNullValue(true));
        System.out.println("你访问了BookVoBeanUtil,bookvoname="+book1.getName());
        return bookfeigen.book(book11);
    }

}
