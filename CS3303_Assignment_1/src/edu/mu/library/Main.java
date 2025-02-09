package edu.mu.library;

import edu.mu.library.info.Book;

public class Main {

	public static void main(String[] args) {
		
		Book emptyBook = new Book();
		Book coolBook = new Book("Cool Stuff", "Tobias Witherspoon", "12345", 100);
		Book coolBookCopy = new Book(coolBook);
		
		System.out.println("Empty Book: " + emptyBook);
		System.out.println("Cool Book: " + coolBook);
		System.out.println("Cool Book Copy: " + coolBookCopy);

	}//end main

}//end Main
