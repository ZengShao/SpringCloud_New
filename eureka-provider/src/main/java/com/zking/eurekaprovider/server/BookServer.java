package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookServer {

Book  load(Book book);



}
