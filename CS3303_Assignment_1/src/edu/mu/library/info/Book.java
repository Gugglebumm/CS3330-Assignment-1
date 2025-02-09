package edu.mu.library.info;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This constructor receives no parameters
	 * thus creating an empty Book by setting
	 * the title, author, and ISBN to 'Unkown'
	 * and the price to 0.0
	 */
	public Book() {
		this.title = "Unkown";
		this.author = "Unkown";
		this.ISBN = "Unkown";
		this.price = 0.0;
	}//end EmptyBook
	
	/**
	 * This is a parameterized constructor which
	 * allows you to create a Book object with a
	 * title, author, ISBN, and price
	 * @param title This argument is the title of
	 * the Book
	 * @param author This argument is the author
	 * of the Book
	 * @param ISBN This argument is the author of
	 * the Book
	 * @param price This argument is the price of
	 * the Book
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}//end Book
	
	/**
	 * This is a parameterized constructor that
	 * receives a Book object which is to have
	 * its data, title, author, ISBN, and price,
	 * copied into a new Book object
	 * @param copy This argument is the Book to
	 * be copied into a new Book
	 */
	public Book(Book copy) {
		this.title = copy.getTitle();
		this.author = copy.getAuthor();
		this.ISBN = copy.getISBN();
		this.price = copy.getPrice();
	}//end CopyBook

	/**
	 * Retrieves the title of a Book
	 * @return Returns the title
	 */
	public String getTitle() {
		return title;
	}//end getTitle
	
	/**
	 * Sets the title of a Book
	 * @param title This argument is the
	 * title to be assigned to the Book
	 */
	public void setTitle(String title) {
		this.title = title;
	}//end setTitle
	
	/**
	 * Retrieves the author of the Book
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}//end getAuthor
	
	/**
	 * Sets the author of a Book
	 * @param author This argument is the
	 * author to be assigned to the Book
	 */
	public void setAuthor(String author) {
		this.author = author;
	}//end setAuthor
	
	/**
	 * Retrieves the ISBN of the Book
	 * @return the ISBN
	 */
	public String getISBN() {
		return ISBN;
	}//end getISBN
	
	/**
	 * Sets the ISBN of a Book
	 * @param ISBN This argument is the
	 * ISBN to be assigned to the Book
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}//set ISBN
	
	/**
	 * Retrieves the price of the Book
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}//end getPrice
	
	/**
	 * Sets the price of a Book
	 * @param price This argument is the
	 * price to be assigned to the Book
	 */
	public void setPrice(double price) {
		this.price = price;
	}//end setPrice

	/**
	 * This prints out all the information
	 * of a Book in a string
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}//end toString
	
	/*
	@Override
	public boolean equals(Book other) {
		if(this.ISBN.equals(other.getISBN())) {
			return true;
		}//end if
		return false;
	}//end equals
	*/
	
}//end Book
