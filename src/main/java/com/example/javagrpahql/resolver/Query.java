package com.example.javagrpahql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.javagrpahql.entities.Author;
import com.example.javagrpahql.entities.Book;
import com.example.javagrpahql.repositories.AuthorRepository;
import com.example.javagrpahql.repositories.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
