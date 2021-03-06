package com.phuongvo95.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="book_category_id")
	private BookCategory bookCategory;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	public Book(String name, BookCategory bookCategory) {
		super();
		this.name = name;
		this.bookCategory = bookCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
}
