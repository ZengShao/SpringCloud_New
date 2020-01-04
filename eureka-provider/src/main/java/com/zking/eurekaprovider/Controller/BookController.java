package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.model.Book;
import com.zking.eurekaprovider.server.BookServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.vo.model.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @Autowired
    private BookServer bookServer;

@RequestMapping("/book")
    public JsonData Book( Book book){
    System.out.println(123);
    JsonData jsonData=new JsonData();
    book.setBookId(5);
    Book load = bookServer.load(book);
    jsonData.setCode(0);
    jsonData.setResult(load);
return  jsonData;
}
//    public JsonData  Book(@RequestBody Book book){
//        JsonData jsonData=new JsonData();
//        jsonData.setResult(book);
//    System.out.println("你访问了book,name="+ book.getName()+"id="+book.getId());
//        return  jsonData;
//    }



//    @RequestMapping("/bookVo")
//    public JsonData  bookVo(@RequestBody BookVo book){
//        JsonData jsonData=new JsonData();
//        jsonData.setResult(book);
//        System.out.println("你访问了bookVo,name="+ book.getName()+"id="+book.getId());
//        return  jsonData;
//    }
}
