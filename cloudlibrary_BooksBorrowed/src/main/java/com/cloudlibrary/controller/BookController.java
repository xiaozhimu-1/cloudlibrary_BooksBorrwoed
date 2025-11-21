package com.cloudlibrary.controller;

import com.cloudlibrary.Book;
import com.cloudlibrary.User;
import com.cloudlibrary.dao.BookMapper;
import com.cloudlibrary.service.BookService;

/**该类是controller类 实现前后端交互
 * @author 303
 * @date 2025.11.20
 */
public class BookController {


    /**
     *定义BookService
     */
    private BookService bookService;

    /**查找已借阅的书
     * @param book 要找的书
     * @param user 操作的用户
     * @param pageNum 当前要查询的页码
     * @param pageSize 每页显示的记录条数
     */
    void searchBorrowed(Book book, User user, Integer pageNum, Integer pageSize) {

    }

    /**退还书籍请求
     * @param id 书的id
     * @param user 操作的用户
     */
    void returnBook(String id, User user) {

    }

    /**退回确认 实现数据更新
     * @param id 书的id
     */
    void returnConfirm(String id){

    }
}
