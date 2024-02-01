package com.example.vebinar_spring_boot;

import com.example.vebinar_spring_boot.model.Author;
import com.example.vebinar_spring_boot.model.Book;
import com.example.vebinar_spring_boot.repo.AutorRepository;
import com.example.vebinar_spring_boot.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class VebinarSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VebinarSpringBootApplication.class, args);
        // https://www.youtube.com/watch?v=R4tF8vVwdSM


    }
}
