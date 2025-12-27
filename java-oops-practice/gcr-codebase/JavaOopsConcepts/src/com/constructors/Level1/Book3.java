package com.constructors.Level1;

public class Book3 {
    public String ISBN;
    protected String title;
    private String author; // private, accessed using methods

    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // setter and getter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
