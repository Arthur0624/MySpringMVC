package com.lyc.service;

import com.lyc.domain.Books;

import java.util.List;

public interface BookeService {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询特定书籍或者所有书籍
    Books queryBookById(int id);
    List<Books> queryAllBook();
}
