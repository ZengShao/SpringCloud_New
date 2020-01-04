package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.BookMapper;
import com.zking.eurekaprovider.model.Book;
import com.zking.eurekaprovider.server.BookServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServerImpl implements BookServer {

    @Autowired
    private BookMapper bookMappers;

    @Override
    public Book load(Book book) {
        System.out.println(book.getBookId());
        return bookMappers.selectByPrimaryKey(5);
    }
}
