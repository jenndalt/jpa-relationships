package com.example.jparelationships.publishing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @GeneratedValue
    UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("books")
    Author author;
    String title;

    public Book(){}

    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
