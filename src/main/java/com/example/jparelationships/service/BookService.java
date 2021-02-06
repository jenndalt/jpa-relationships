package com.example.jparelationships.service;

import com.example.jparelationships.publishing.Author;
import com.example.jparelationships.publishing.Book;
import com.example.jparelationships.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.addBooksToRepository();
    }

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public void addBooksToRepository() {
        Book book = new Book(new Author("JK Rowling"), "Harry Potter");
        this.bookRepository.save(book);
        book =  new Book(new Author("God"), "The Bible");
        this.bookRepository.save(book);
    }
}
