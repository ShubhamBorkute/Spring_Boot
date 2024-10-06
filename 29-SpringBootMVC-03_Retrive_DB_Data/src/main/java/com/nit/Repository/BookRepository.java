package com.nit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
