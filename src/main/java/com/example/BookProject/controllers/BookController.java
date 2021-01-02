package com.example.BookProject.controllers;

import com.example.BookProject.models.Book;
import com.example.BookProject.repositores.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    public BookRepository bookRepository;



    //Book list
    @GetMapping(value = "/BookList")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    //Book list by title
    @GetMapping(value = "/BookList/{title}")
    public List<Book> getAllBooksByGenre(@PathVariable("title") String booktitle)
    {
        return bookRepository.findBookByTitle(booktitle);
    }

    //Book list by id
    @GetMapping(value = "/BookList/{id}")
    public Book getBookById(@PathVariable("id") String bookid)
    {
        return bookRepository.findBookById(bookid);
    }

    //Delete book by id
    @DeleteMapping(value = "/DeleteBook/{id}")
    public String deleteBook(@PathVariable("id") String bookid) {
        bookRepository.deleteBookById(bookid);
        return " The book has been deleted succesfully!";
    }

    //Adding a new book
    @PostMapping(value = "/AddBook")
    public String addBook(@RequestBody Book myBook) {

        Book insertedBook = bookRepository.insert(myBook);
        return "The book has been added succesfully!";
    }

    //Update a book
    @PutMapping(value="/UpdateBook/{id}")
    public String updateBook(@RequestBody Book myBook, @PathVariable String id)
    {
        Book bookData = bookRepository.findBookById(id);
        if(bookData!=null)
        {
            bookData.setTitle(myBook.getTitle());
            bookData.setAuthors(myBook.getAuthors());
            bookData.setEdition(myBook.getEdition());
            bookData.setGenres(myBook.getGenres());
            bookData.setPublisher(myBook.getPublisher());
            bookData.setDescription(myBook.getDescription());
        }
        return "The book has been updates succesfully!";
    }



}
