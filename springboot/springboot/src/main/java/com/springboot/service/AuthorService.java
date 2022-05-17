package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Author;

/*
 * Author service interface 
 */

@Service
public interface AuthorService {
	
	public List<Author> getAuthor();
}
