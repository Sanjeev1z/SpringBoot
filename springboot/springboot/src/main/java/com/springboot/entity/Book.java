package com.springboot.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@Column(name = "bookid")
	private int bookId;

	@Column(name = "bookname")
	private String bookName;

	private String authorName;


	@Column(name = "modifieddate")
	private String currentDate;

	public int getBookCode() {
		return bookId;
	}

	public void setBookCode(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDate() {
		return currentDate;
	}

	public void setDate(String currentDate) { 
		this.currentDate=currentDate;
	}
}
