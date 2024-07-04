package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Book;
import com.nt.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		BookRepository bookrepo=ctxt.getBean(BookRepository.class);
		System.out.println(bookrepo.getClass().getName());
		
		
		Book b=new Book();
		b.setBookId(1002);
		b.setBookName("C++");
		b.setBookPrice(1000.0);
		
		
		bookrepo.save(b);
	
	}

}
