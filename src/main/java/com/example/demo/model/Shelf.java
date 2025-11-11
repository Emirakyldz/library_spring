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
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append("- ").append(book.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
