package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.Library;
import com.nit.service.LibraryService;
import com.nit.service.LibraryServiceImpl;

@SpringBootApplication
public class LibraryManagmentSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LibraryManagmentSystemApplication.class, args);
		
		LibraryServiceImpl service =(LibraryServiceImpl) context.getBean(LibraryService.class);
		
		Library l=new Library();
		l.setName("C");
		l.setAuthor("Danise");
		l.setCategory("programming");
		/*
		 * Library l2=new Library(); l.setName("java"); l.setAuthor("games");
		 * l.setCategory("programming");
		 */
		//System.out.println(service.saveBook(l));
		
		//System.out.println(service.getBook("programming"));
		
	}

}
