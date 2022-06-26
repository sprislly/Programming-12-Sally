package com.example.finalprojectsally;

public class Book {
    String bookName;
    String author;
    Boolean available;
    Book(String bookName, String author, Boolean available){
        this.bookName = bookName;
        this.author = author;
        this.available = available;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }
}
