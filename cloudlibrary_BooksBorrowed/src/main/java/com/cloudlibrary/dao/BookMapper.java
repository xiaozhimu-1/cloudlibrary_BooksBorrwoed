package com.cloudlibrary.dao;


import com.cloudlibrary.Book;


/**该dao接口用于连接服务层与dao层，搜寻已借阅的书
 * @author xzm
 * @date 2025.11.20
 */

public interface BookMapper {
    /**查找我已借阅的书
     * @param book 要查的书
     * @javadoc 书的表
     */
    void selectMyBorrowed(Book book);

    /**查找已借阅的书
     * @param book 要查的书
     * @javadoc 书的表
     */
    void selectBorrowed(Book book);

}
