package com.shopping;

import org.springframework.stereotype.Component;

@Component
public class Book {
	int bookId=100;
	String bookName="Harry Potter";
	int price=1000;
	String authorName="J.K.Rowling";

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", authorName=" + authorName
				+ "]";
	}

	

	

}
