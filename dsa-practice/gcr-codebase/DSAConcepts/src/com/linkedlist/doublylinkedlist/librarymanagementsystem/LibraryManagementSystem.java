package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "The Courage to be Disliked", "Raju Pandey", "Selfhelp", true);
        library.addAtBeginning(102, "The Interview prep java", "John Grey", "Software", true);
        library.addAtEnd(103, "How to think like flowing water", "Mark Allen", "CS", false);
        library.addAtPosition(2, 104, "Algorithms", "CLRS", "CS", true);

        library.displayForward();
        library.displayReverse();

        System.out.println("\n--- Search by Author ---");
        library.searchByAuthor("CLRS");

        System.out.println("\n--- Update Availability ---");
        library.updateAvailability(103, true);
        library.displayForward();

        System.out.println("\n--- Remove Book ---");
        library.removeByBookId(102);
        library.displayForward();

        System.out.println("\n--- Count Books ---");
        library.countBooks();
    }
}