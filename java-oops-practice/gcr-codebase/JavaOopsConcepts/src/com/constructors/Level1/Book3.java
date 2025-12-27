package com.constructors.Level1;


public class Book3 {
    public String ISBN;
    protected String title;
    private String author;

    public Book3(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    //  main moved here
    public static void main(String[] args) {
        EBook e1 = new EBook("123-ABC", "Java Programming", "James");
        System.out.println(e1.getAuthor());
        e1.showDetails();
    }
}

class EBook extends Book3 {

    EBook(String i, String t, String a) {
        super(i, t, a);
    }

    void showDetails() {
        System.out.println(ISBN);
        System.out.println(title);
    }
}
