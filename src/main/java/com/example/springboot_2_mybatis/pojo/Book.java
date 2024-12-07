package com.example.springboot_2_mybatis.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Classname Book
 * @Description TODO
 * @Date 2024/12/5 20:36
 * @Created by cxx
 */
//@TableName("tbl_book")
public class Book {
    private Integer id;
    private String type;
    private String bookname;
    private String cost;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", bookname='" + bookname + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
