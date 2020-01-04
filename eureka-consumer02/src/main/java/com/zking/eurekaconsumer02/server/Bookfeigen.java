package com.zking.eurekaconsumer02.server;

import com.zking.eurekaconsumer02.model.Bookvo;
import model.book1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("eureka-provider")
public interface Bookfeigen {
    @RequestMapping("/book")
    String  book(book1 book1);

    @RequestMapping("/bookVo")
    String  book2(Bookvo book1);

}
