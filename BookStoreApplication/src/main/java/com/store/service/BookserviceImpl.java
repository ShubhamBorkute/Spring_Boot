package com.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Book;
import com.store.repository.BookRepository;

@Service
public class BookserviceImpl  implements BookService{
   @Autowired
	private BookRepository bookrepo;
	
	@Override
	public Integer saveBook(Book b) {
		return bookrepo.save(b).getBook_Id();
	}

	@Override
	public Book getBookById(Integer id) {
		return bookrepo.getById(id);
	}

	@Override
	public List<Book> getAllBook() {
		return bookrepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		return bookrepo.findById(id)+" Book "+id+" Deleted Succesfully.";
	}

	@Override
	public String deleteAllBook() {
		bookrepo.deleteAll();
		return "All Book Deleted ";
	}

	@Override
	public Long getTotalBookCount() {
		return bookrepo.count();
	}
	
	

}
