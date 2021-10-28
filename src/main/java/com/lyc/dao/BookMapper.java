package com.lyc.dao;

import com.lyc.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
        //增加一本书
        int addBook(Books books);
        //删除一本书
        int deleteBookById(@Param("bookId") int id);
        //修改一本书
        int updateBook(Books books);
        //查询特定书籍或者所有书籍
        Books queryBookById(@Param("bookId")int id);
        List<Books> queryAllBook();

}
