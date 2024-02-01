package com.example.vebinar_spring_boot.controller;

import com.example.vebinar_spring_boot.model.Book;
import com.example.vebinar_spring_boot.repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class IndexController {

    private  BookRepo bookRepo ;
    @GetMapping("/")
    public String indexPage(){
        return "index.html";

    }

}
