package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.uitl.JsonData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControllers {



private  JsonData jsonData;
@RequestMapping("/helloa/{name}")
public JsonData hello( String name){
    jsonData=new JsonData();
    System.out.println("你调用了生产者helloa,name="+name);

    jsonData.setMessage("成功");
    return  jsonData;
}
    @RequestMapping("/duoge")
public  JsonData  duoge(String name){
        jsonData=new JsonData();
        System.out.println("生产者你调用了RequestParam,name="+name);
        jsonData.setMessage("成功");
        jsonData.setResult(name);
    return  jsonData;
}
    @RequestMapping("/duoges")
    public  JsonData  duoges(String name,String sex){
        jsonData=new JsonData();
        System.out.println("生产者你调用了RequestParam,name="+name+"sex="+sex);
        jsonData.setMessage("成功");
        jsonData.put("name",name);
        jsonData.put("sex",sex);
        return  jsonData;
    }

}
