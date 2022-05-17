package com.springboot.dao;



import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Book;

/*
 * Repository class to perform CRUD operations on Book class
 */

public interface BookRepository extends CrudRepository<Book, Integer>{

}
