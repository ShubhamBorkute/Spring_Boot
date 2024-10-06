package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Library;
import com.nit.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	public LibraryService ser;
	
	@GetMapping("/book")
	public ResponseEntity<List<Library>> getBook(){
		List<Library> libraries = ser.getBook();
		
		 if (libraries == null || libraries.isEmpty()) {
		      
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		    }
		
		return ResponseEntity.ok(libraries);
	}
	
	@GetMapping("/book/{category}")
	public ResponseEntity<List<Library>> getBook(@PathVariable("category") String category) {
	    List<Library> libraries = ser.getBook(category);  // Assuming ser.getBook(category) returns List<Library>
	    
	    if (libraries == null || libraries.isEmpty()) {
	        // Return 404 Not Found if the list is null or empty
	        return ResponseEntity.notFound().build();
	    }

	    // Return 200 OK with the list of libraries
	    return ResponseEntity.ok(libraries);
	}

}
