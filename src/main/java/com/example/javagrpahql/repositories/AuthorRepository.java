package com.example.javagrpahql.repositories;

import com.example.javagrpahql.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }
