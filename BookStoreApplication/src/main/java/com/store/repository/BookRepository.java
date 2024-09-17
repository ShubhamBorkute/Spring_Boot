package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
}


