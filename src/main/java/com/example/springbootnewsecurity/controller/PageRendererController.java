package com.example.springbootnewsecurity.controller;

import com.example.springbootnewsecurity.book.Book;
import com.example.springbootnewsecurity.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageRendererController {
    @GetMapping("/books/add/expose")
    public String addBooks(Model model){
        model.addAttribute("books", new Book());
        return "addBooks";
    }

    @GetMapping("/users/add/expose")
    public String addUsers(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
}
