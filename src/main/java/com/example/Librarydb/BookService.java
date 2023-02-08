package com.example.Librarydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService { //Logic written here
    @Autowired
    BookRepository bookRepository;

    public void creatBook(Book book) throws Exception{
        if(bookRepository.findById(book.getId()).get() != null){ //Validation part of duplicate part
            throw new Exception("Book is already present !!! ");
        }
        bookRepository.save(book);
    }

    public Book getBookById(Integer id){
        Book book = bookRepository.findById(id).get();
        return book;
    }

    public void updateBookPages(UpdateBookPages updateBookPages){
        //We need to convert our object (Entry DTO) into Entity Object
        int id = updateBookPages.getId();
        Book bookToBeUpdated = bookRepository.findById(id).get();
        bookToBeUpdated.setPages(updateBookPages.getPages());
        bookRepository.save(bookToBeUpdated);
    }

    public List<ResponceObject> getBookNameAndAuthors(){
        //From Repository class --> list of books
        List<Book> books = bookRepository.findAll(); //same as Select * from book_table

        //Convert this entity into responceObject
        List<ResponceObject> ansList = new ArrayList<>();
        for(Book book : books){
            ResponceObject obj = new ResponceObject();
            obj.setName(book.getName());
            obj.setAuthor(book.getAuthor());
            ansList.add(obj);
        }
        return ansList;
    }
}
