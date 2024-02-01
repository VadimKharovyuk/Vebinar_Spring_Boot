package com.example.vebinar_spring_boot.repo;

import com.example.vebinar_spring_boot.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepository extends CrudRepository<Author, Long> {

}
