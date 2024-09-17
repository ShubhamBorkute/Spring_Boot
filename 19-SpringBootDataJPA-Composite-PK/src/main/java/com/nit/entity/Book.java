package com.nit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="book_info_tab")
public class Book {

	private String author;
	
	private Double price;
	
	@EmbeddedId
	private BookPK bookpk;

	public Book() {
		super();
	}

	public Book(String author, Double price, BookPK bookpk) {
		super();
		this.author = author;
		this.price = price;
		this.bookpk = bookpk;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public BookPK getBookpk() {
		return bookpk;
	}

	public void setBookpk(BookPK bookpk) {
		this.bookpk = bookpk;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", bookpk=" + bookpk + "]";
	}
	
	
	
}
