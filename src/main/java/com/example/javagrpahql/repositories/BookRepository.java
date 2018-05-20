package com.example.javagrpahql.repositories;

import com.example.javagrpahql.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }
