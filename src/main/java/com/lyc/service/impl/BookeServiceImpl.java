package com.lyc.service.impl;

import com.lyc.dao.BookMapper;
import com.lyc.domain.Books;
import com.lyc.service.BookeService;

import java.util.List;

public class BookeServiceImpl implements BookeService {
    //service层调dao层
    //声明dao接口，此处用set方法方便spring注入对象
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return  bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return  bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return  bookMapper.queryAllBook();
    }

}
