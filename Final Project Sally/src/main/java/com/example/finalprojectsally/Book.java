package com.example.finalprojectsally;

public class Book {
    String author;
    String title;
    Boolean available;
    Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
