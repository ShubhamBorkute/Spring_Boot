package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	
	
}
