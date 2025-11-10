package com.example.demo.model;

import java.util.List;

public class Shelf {
    private List<Book> books;

    public Shelf(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() { return books; }

    @Override
    public String toString() {
        return "Shelf: " + books;
    }
}
