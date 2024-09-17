package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Book;
import com.nit.entity.BookPK;
import com.nit.repository.BookRepository;

@Service
public class BookService {
    @Autowired
	private BookRepository repo;
	
	public void savedata() {
		BookPK pk=new BookPK(101, "C");
		
		Book entity=new Book("Dennie", 1200.0, pk);
		
		repo.save(entity);
		System.out.println("Entity Saved");
	}
	
	
 	 public void getData(){
 		BookPK pk=new BookPK(101, "C");
 		 Optional<Book> byOptional = repo.findById(pk);
 		if (byOptional.isPresent()) {
 			System.out.println(byOptional.get());
 		}else {
 			System.out.println("Data Not There");
 		}
 		 
	}
	
}
