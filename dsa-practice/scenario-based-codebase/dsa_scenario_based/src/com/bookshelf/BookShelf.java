package com.bookshelf;

import java.util.*;

public class BookShelf {

    // genre -> list of books
    static HashMap<String, LinkedList<String>> library = new HashMap<>();

    // to avoid duplicate books
    static HashSet<String> uniqueBooks = new HashSet<>();

    // add book
    static void addBook(String genre, String bookName, String author) {

        String fullBookName = bookName + " by " + author;

        if (uniqueBooks.contains(fullBookName)) {
            System.out.println("Book already exists.");
            return;
        }

        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(fullBookName);

        uniqueBooks.add(fullBookName);
        System.out.println("Book added successfully.");
    }

    // borrow book
    static void borrowBook(String genre, String bookName, String author) {

        String fullBookName = bookName + " by " + author;

        if (!library.containsKey(genre) ||
            !library.get(genre).remove(fullBookName)) {

            System.out.println("Book not available.");
            return;
        }

        uniqueBooks.remove(fullBookName);
        System.out.println("Book borrowed successfully.");
    }

    // display all books
    static void showBooks() {

        if (library.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : library.keySet()) {
            System.out.println("\nGenre: " + genre);
            System.out.println(library.get(genre));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to our Library!!!!");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Show Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 4) {
                System.out.println(" Exiting Library System....");
                break;
            }

            if (choice == 1) {
                System.out.print("Enter Genre: ");
                String genre = sc.nextLine();

                System.out.print("Enter Book Name: ");
                String bookName = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                addBook(genre, bookName, author);
            }

            else if (choice == 2) {
                System.out.print("Enter Genre: ");
                String genre = sc.nextLine();

                System.out.print("Enter Book Name: ");
                String bookName = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                borrowBook(genre, bookName, author);
            }

            else if (choice == 3) {
                showBooks();
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
