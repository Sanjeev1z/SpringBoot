package com.springboot.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="authorname")
	private String authorName;
	
	public void setAuthorName(String authorName) {
		this.authorName=authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
}
