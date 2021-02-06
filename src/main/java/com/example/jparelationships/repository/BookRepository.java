package com.example.jparelationships.repository;

import com.example.jparelationships.publishing.Author;
import com.example.jparelationships.publishing.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
