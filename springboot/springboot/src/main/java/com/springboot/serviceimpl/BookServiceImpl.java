package com.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.BookRepository;
import com.springboot.dto.BookDto;
import com.springboot.entity.Book;
import com.springboot.service.AuthorService;
import com.springboot.service.BookService;

@Component
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorService authorService;
	
	public List<BookDto> getAllData() {
		List<Book> booksFound = (List<Book>) bookRepository.findAll();

		List<BookDto> booksDataList = new ArrayList<BookDto>();
		for (Book bookEntity : booksFound) {
			BookDto bookDto = new BookDto();
			bookDto.setAuthorName(bookEntity.getAuthorName());
			bookDto.setBookCode(bookEntity.getBookCode());
			bookDto.setBookName(bookEntity.getBookName());
			bookDto.setDate(bookEntity.getDate());
			booksDataList.add(bookDto);
		}
		return booksDataList;
	}

	public void delete(int id) throws Exception {

		Optional<Book> book = bookRepository.findById(id);

		if (book == null || !book.isPresent()) {
			throw new Exception("Book not found with id " + id);
		}

		bookRepository.deleteById(id);
	}

	public void update(Book book, int id) throws Exception  {
		Optional<Book> temp = bookRepository.findById(id);

		if (temp == null || !temp.isPresent()) {
			throw new Exception("Book not found with id " + id);
		}

		book.setBookCode(id);
		bookRepository.save(book);
	}

	public void insertBook(Book book) {
		bookRepository.save(book);
	}

}
