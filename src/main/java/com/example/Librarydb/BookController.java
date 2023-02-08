package com.example.Librarydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public void addBook(@RequestBody() Book book){
        try { //In Controller layer : we are handling with try catch
            bookService.creatBook(book);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/getBook")
    public Book getBook(@RequestParam("id") Integer id){
        try{
            Book book = bookService.getBookById(id);
            return book;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    @PutMapping("/updatePages")
    public void updatePages(@RequestBody() UpdateBookPages updateBookPages){
        bookService.updateBookPages(updateBookPages);
    }
    @GetMapping("/bookNameAndAuthors")
    public List<ResponceObject> getBookNameAndAuthors(){
        return bookService.getBookNameAndAuthors();
    }

}
