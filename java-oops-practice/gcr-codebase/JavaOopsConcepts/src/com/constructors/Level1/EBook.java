package com.constructors.Level1;

public class EBook extends Book3 {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void showDetails() {
        System.out.println("ISBN: " + ISBN);      // public access
        System.out.println("Title: " + title);    // protected access
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook e1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");

        e1.showDetails();
        e1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + e1.getAuthor());
    }
}
