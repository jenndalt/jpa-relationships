package com.example.jparelationships.service;

import com.example.jparelationships.publishing.Author;
import com.example.jparelationships.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }
}
