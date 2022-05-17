package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.AuthorRepository;
import com.springboot.entity.Author;
import com.springboot.service.AuthorService;


@Component
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;
	
	public List<Author> getAuthor() {
		return (List<Author>) authorRepository.findAll();
	}

}
