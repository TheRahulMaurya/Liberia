package com.example.liberia.liberia.controller;

import com.example.liberia.liberia.repository.BookRepository;
import com.example.liberia.liberia.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepo;

    @RequestMapping("/addBook")
    public String addBook()
    {
        String[] author = {"abcc","def"};
        BookModel book = new BookModel("c++", 1234, "Nice book", "1st", "Computer Science", "English", author , 124.00f, 100.00f, 345, 10,2);
        bookRepo.save(book);
        return "home.jsp";
    }





































}
