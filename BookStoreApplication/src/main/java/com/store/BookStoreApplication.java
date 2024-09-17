package com.store;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.store.service.BookService;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(BookStoreApplication.class, args);
		BookService bookService=context.getBean(BookService.class);

		/*
		 * Book b=new Book(); b.setBook_Name("Java"); b.setBook_Genre("Coding");
		 * b.setBook_Price(1200d);
		 * 
		 * Integer book = bookService.saveBook(b);
		 * 
		 * System.out.println("Book Inserted with ID "+book);
		 */
	}




}
