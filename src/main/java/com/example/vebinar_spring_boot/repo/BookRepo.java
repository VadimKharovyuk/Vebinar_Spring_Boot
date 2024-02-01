package com.example.vebinar_spring_boot.repo;

import com.example.vebinar_spring_boot.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo  extends CrudRepository<Book,Long> {
}
