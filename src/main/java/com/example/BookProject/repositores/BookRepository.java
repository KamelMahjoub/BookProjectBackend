package com.example.BookProject.repositores;

import com.example.BookProject.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book,Long> {

    List<Book> findBookByTitle(String title);
    Book findBookById(String id);
    String deleteBookById(String id);

}
