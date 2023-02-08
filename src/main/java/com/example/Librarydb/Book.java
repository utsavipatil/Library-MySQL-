package com.example.Librarydb;

import jakarta.persistence.*;

@Entity //Take this parameter as entities of table
@Table(name = "book_table") //Add table name
public class Book {
    @Id //Primary Key of table
//    @GeneratedValue (strategy = GenerationType.IDENTITY) //To make Primary key secure(from user) + auto increment
    private int id;
    private int pages;
    @Column(name = "book_name", nullable = false) //Column name in MySQL table & table can't be null
    private String name;
    private String author;
    public Book(int pages, String author, String name) {
        this.pages = pages;
        this.author = author;
        this.name = name;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
