package edu.mu.library;

import edu.mu.library.info.Book;

public class Library {

    // Attributes
    private Book[] books;
    private int count;

    /**
     * Constructor which makes an empty Library
     */
    public Library() {
        books = new Book[5]; // Fixed size of 5
        count = 0; // No books initially
    }

    /**
     * Method to add a book to the library
     * @param book This argument is the Book
     * to be added to the Library
     * @return Returns true if the Book
     * was successfully added or false if there
     * was no room in the Library
     */
    public boolean addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            return true;
        } else {
            return false; // No space to add book
        }
    }

    /**
     * Method to remove a book from the library
     * @param book This argument is the Book to
     * be removed from the Library
     * @return Returns true if the Book is removed
     * or false if the Book is not found in the 
     * Library
     */
    public boolean removeBook(Book book) {
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {
                // Shift books after removal
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; // Clear the last element
                count--;
                return true;
            }
        }
        return false; // Book not found
    }

    /**
     * Method to search for a book by ISBN
     * @param ISBN This argument is the ISBN
     * that will be searched for in the Library
     * @return The Book with the received ISBN
     * if it is in the Library or null if it is
     * not
     */
    public Book searchByISBN(String ISBN) {
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    /**
     * Method to display all books in the library
     */
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
        } else {
            System.out.println("All books in the library:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + books[i].toString());
            }
        }
    }
}