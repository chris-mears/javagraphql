package com.example.javagrpahql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.javagrpahql.entities.Author;
import com.example.javagrpahql.entities.Book;
import com.example.javagrpahql.repositories.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
