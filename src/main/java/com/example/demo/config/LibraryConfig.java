package com.example.demo.config;

import com.example.demo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LibraryConfig {

    @Bean
    public User thomasSmith() {
        return new User(502, "Thomas", "Smith");
    }
    @Bean
    public User notBorrowed() {
        return new User(0, "Available", "Book");
    }

    @Bean
    public Book book1() { return new Book("Book1", "AuthorA", thomasSmith()); }
    @Bean
    public Book book2() { return new Book("Book2", "AuthorB", thomasSmith()); }
    @Bean
    public Book book3() { return new Book("Book3", "AuthorC", notBorrowed()); }
    @Bean
    public Book book4() { return new Book("Book4", "AuthorD", notBorrowed()); }
    @Bean
    public Book book5() { return new Book("Book5", "AuthorE", notBorrowed()); }
    @Bean
    public Book book6() { return new Book("Book6", "AuthorF", notBorrowed()); }


    //2 Shelfves that both contains 3 books
    @Bean
    public Shelf shelf1() {
        return new Shelf(List.of(book1(), book2(), book3()));
    }

    @Bean
    public Shelf shelf2() {
        return new Shelf(List.of(book4(), book5(), book6()));
    }


    //1 Library contains 2 shelves
    @Bean
    public Library library() {
        return new Library(List.of(shelf1(), shelf2()));
    }
}
