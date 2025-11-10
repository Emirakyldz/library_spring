package com.example.demo.model;

import java.util.List;

public class Library {
    private List<Shelf> shelves;

    public Library(List<Shelf> shelves) {
        this.shelves = shelves;
    }

    public List<Shelf> getShelves() { return shelves; }

    @Override
    public String toString() {
        return "Library contains: " + shelves;
    }
}
