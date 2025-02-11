package edu.mu.library;

import edu.mu.library.info.Book;

public class Main {

    public static void main(String[] args) {

        // Your partner's original tests
        Book emptyBook = new Book();
        Book coolBook = new Book("Cool Stuff", "Tobias Witherspoon", "12345", 100);
        Book coolBookCopy = new Book(coolBook);

        System.out.println("Empty Book: " + emptyBook);
        System.out.println("Cool Book: " + coolBook);
        System.out.println("Cool Book Copy: " + coolBookCopy);

        if(coolBook.equals(coolBookCopy)) {
            System.out.println("Same Book");
        } else {
            System.out.println("Different Books");
        }

        if(coolBook.equals(emptyBook)) {
            System.out.println("Same Book");
        } else {
            System.out.println("Different Books");
        }

        // --------------------------------------------

        // New Library tests
        Library myLibrary = new Library();

        // Add books to the library
        Book anotherBook = new Book("Amazing Adventures", "Jane Doe", "67890", 20);
        Book thirdBook = new Book("Java Programming", "John Smith", "11223", 50);

        System.out.println("\nAdding books...");
        myLibrary.addBook(coolBook);
        myLibrary.addBook(anotherBook);
        myLibrary.addBook(thirdBook);

        // Search for a book by ISBN
        String searchISBN = "12345";  // Example ISBN to search for
        System.out.println("\nSearching for book with ISBN: " + searchISBN);
        Book foundBook = myLibrary.searchByISBN(searchISBN);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book that exists
        System.out.println("\nRemoving book: " + coolBook);
        myLibrary.removeBook(coolBook);

        // Try removing a book that doesn't exist
        Book nonExistingBook = new Book("Non Existent", "No Author", "00000", 0);
        System.out.println("\nRemoving non-existing book: " + nonExistingBook);
        myLibrary.removeBook(nonExistingBook);

        // Display all books
        System.out.println("\nAll books in the library:");
        myLibrary.displayBooks();
    }

}
