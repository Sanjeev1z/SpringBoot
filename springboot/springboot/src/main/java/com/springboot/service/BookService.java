package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.BookDto;
import com.springboot.entity.Book;

/*
 * Book service Interface
 */

@Service
public interface BookService {
	
	public List<BookDto> getAllData();
	public void delete(int id) throws Exception;
	public void update(Book book,int id) throws Exception;
	public void insertBook(Book book);
}
