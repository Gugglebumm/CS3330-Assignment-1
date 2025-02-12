package edu.mu.library;

import edu.mu.library.info.Book;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library lib = new Library();
		
		Book book1 = new Book("The Art Of War", "Sun Tzu", "12345", 40.0);
		Book book2 = new Book("Goosebumps", "R.L. Stine", "11112", 15.0);
		Book book3 = new Book("History", "Abraham Washington", "98765", 50.0);
		Book book4 = new Book("Book Title", "Book Author", "10101", 1000.0);
		
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		
		System.out.println("Find Book With ISBN 12345: " + lib.searchByISBN("12345") + "\n");
		
		if(lib.removeBook(book3)) {
			System.out.println("Successfully Removed: " + book3 + "\n");
		}//end if
		else {
			System.out.println("Book Does Not Exist\n");
		}//end else
		
		if(lib.removeBook(book4)) {
			System.out.println("Successfully Removed: " + book3 + "\n");
		}//end if
		else {
			System.out.println("Book Does Not Exist\n");
		}//end else
		
		lib.displayBooks();

	}//end main

}//end LibraryApp
