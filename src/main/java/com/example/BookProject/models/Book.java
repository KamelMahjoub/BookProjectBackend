package com.example.BookProject.models;

import java.util.List;

public class Book {

    private String id;
    private String title;
    private String authors;
    private String edition;
    private String genres;
    private String publisher;
    private String description;

    public Book(String title, String authors, String edition, String genres, String publisher, String description) {
        this.title = title;
        this.authors = authors;
        this.edition = edition;
        this.genres = genres;
        this.publisher = publisher;
        this.description = description;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


