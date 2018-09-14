package model;

public class Book {
	
	private String bookTitle;
	private String bookSummary;
	private int bookYear;
	private String bookISBN;
	private String bookDate;
	
	public Book(String title, String summary, int year, String isbn, String date) {
		super();
		this.bookTitle = title;
		this.bookSummary = summary;
		this.bookYear = year;
		this.bookISBN = isbn;
		this.bookDate = date;
	}
	
	public String getTitle() {
		return this.bookTitle;
	}
	public String setTitle(String newTitle) {
		return this.bookTitle = newTitle;
	}
	
	public String getSummary() {
		return this.bookSummary;
	}
	public String setSummary(String newSummary) {
		return this.bookSummary = newSummary;
	}
	
	public int getYear() {
		return this.bookYear;
	}
	public int setYear(int newYear) {
		return this.bookYear = newYear;
	}
	
	public String getISBN() {
		return this.bookISBN;
	}
	public String setISBN(String newISBN) {
		return this.bookISBN = newISBN;
	}
	
	public String getDate() {
		return this.bookDate;
	}
	public String setDate(String newDate) {
		return this.bookDate = newDate;
	}
	
	@Override
	public String toString() {
		return this.bookTitle;
		
	}
}
