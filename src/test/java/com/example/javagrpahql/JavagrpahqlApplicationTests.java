package com.example.javagrpahql;

import com.example.javagrpahql.entities.Author;
import com.example.javagrpahql.entities.Book;
import com.example.javagrpahql.repositories.AuthorRepository;
import com.example.javagrpahql.repositories.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavagrpahqlApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findAllBooks() {
        Iterable<Book> books = bookRepository.findAll();
        for (Book book: books) {
            System.out.println(book);
        }
    }

    @Test
    public void createBook() {
        Book book = new Book();
        book.setTitle("This is a test");
        book.setId(2l);
        book.setIsbn("123456789");
        book.setPagecount(999);
        book.setAuthor(new Author(1l));

        bookRepository.save(book);
    }
}
