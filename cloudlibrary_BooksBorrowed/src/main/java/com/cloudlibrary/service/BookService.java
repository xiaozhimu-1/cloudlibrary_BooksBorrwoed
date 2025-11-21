package com.cloudlibrary.service;

import com.cloudlibrary.Book;
import com.cloudlibrary.User;
import com.cloudlibrary.dao.BookMapper;

/**该接口用于实现查找书籍 退回书籍与退回确认功能
 * @author xzm
 * @date 2025.11.20
 */
public interface BookService {


    /**实现查找借阅书籍 并识别用户 同时显示
     * @param book 要找的书
     * @param user 发出请求的用户
     * @param pageNum 当前要查询的页码
     * @param pageSize 每页显示的记录条数
     * 实现查找借阅书籍 并识别用户 同时显示
     */
    void searchBorrowed(Book book, User user, Integer pageNum, Integer pageSize);

    /**退还书籍请求
     * @param id 书的id
     * @param user 用户
     */
    void returnBook(String id, User user);

    /**退回确认 实现数据更新
     * @param id 书的id
     */
    void returnConfirm(String id);
}
