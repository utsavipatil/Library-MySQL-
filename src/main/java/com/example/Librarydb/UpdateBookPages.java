package com.example.Librarydb;

public class UpdateBookPages {
    private Integer id, pages;

    public UpdateBookPages(Integer id, Integer pages) {
        this.id = id;
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
