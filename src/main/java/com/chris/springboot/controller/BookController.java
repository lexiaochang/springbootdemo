package com.chris.springboot.controller;

import com.chris.springboot.entity.BookEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Chris on 2017/11/30.
 */

@Controller
@RequestMapping("/bookview")
public class BookController {

    @Autowired
    private BookEntity mBookEntity;

    @ResponseBody
    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String book() {
        return "Hello Spring Boot! The BookName is "+mBookEntity.getName()+";and Book Author is "+mBookEntity.getAuthor()+";";
    }


}
