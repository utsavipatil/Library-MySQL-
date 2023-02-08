package com.example.Librarydb;

public class ResponceObject {
    private String name, author;

    public ResponceObject(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public ResponceObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
