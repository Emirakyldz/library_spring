package com.example.demo.model;

public class Book {
    private String title;
    private String author;
    private User user;

    public Book(String title, String author, User user) {
        this.title = title;
        this.author = author;
        this.user = user;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public User getUser() { return user; }

    @Override
    public String toString() {
        return title + " by " + author + " - Borrowed by: " + user;
    }
}
