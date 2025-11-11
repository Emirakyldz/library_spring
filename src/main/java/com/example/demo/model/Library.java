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
        StringBuilder sb = new StringBuilder("Library contains:\n");
        int shelfNumber = 1;
        for (Shelf shelf : shelves) {
            sb.append("  Shelf ").append(shelfNumber++).append(":\n");
            for (String line : shelf.toString().split("\n")) {
                sb.append("    ").append(line).append("\n");
            }
        }
        return sb.toString();
    }
}
