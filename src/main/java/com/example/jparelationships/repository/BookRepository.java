package com.example.jparelationships.repository;

import com.example.jparelationships.publishing.Author;
import com.example.jparelationships.publishing.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
}
