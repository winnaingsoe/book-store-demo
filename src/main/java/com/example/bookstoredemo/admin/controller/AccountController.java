package com.example.bookstoredemo.admin.controller;

import com.example.bookstoredemo.dao.BookDao;
import com.example.bookstoredemo.ds.BookDto;
import com.example.bookstoredemo.entity.Book;
import com.example.bookstoredemo.entity.Customer;
import com.example.bookstoredemo.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
public class AccountController {
    @Autowired
    private BookDao bookDao;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    @ModelAttribute("books")
    public List<Book> listBooks() {
        return bookDao.findAll();
    }

}
