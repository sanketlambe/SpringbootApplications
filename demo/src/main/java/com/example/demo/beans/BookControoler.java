package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookControoler {

    @Autowired
    private BookService bookService;


    public void print(){
        System.out.println(bookService.getAllData());
    }



}
