package com.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.store.entity.Book;

@Service
public interface BookService {


    public Integer saveBook(Book b) ;
    
    public Book getBookById(Integer id);
    
    public List<Book> getAllBook();
    
    public String deleteById(Integer id);
    
    public String deleteAllBook();
    
    public Long getTotalBookCount();

    
}
