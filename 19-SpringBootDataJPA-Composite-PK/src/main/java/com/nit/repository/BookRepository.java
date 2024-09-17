 package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Book;
import com.nit.entity.BookPK;

public interface BookRepository extends JpaRepository<Book, BookPK> {

}
