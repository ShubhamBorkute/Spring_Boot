package com.nit.service;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nit.Repository.BookRepository;
import com.nit.entity.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository repo;
	
	@Override
	public Integer saveBook() throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Book Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Book Author");
		String author=sc.nextLine();
		
		System.out.println("Enter Book Category");
		String category=sc.nextLine();
		
		System.out.println("Enter Book Price");
		Double price=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Description");
		String description=sc.nextLine();
		
		System.out.println("Enter Image Path");
		String filePath=sc.nextLine();
		
		//String base64Image=encodeImageBase64(filePath);
		
		Book book = new Book();
        book.setBookName(name);
        book.setBookAuthor(author);
        book.setCategory(category);
        book.setPrice(price);
        book.setDescription(description);
        //byte[] imageBytes = Files.readAllBytes(Paths.get(filePath));
      //  byte[] imageBytes = Files.readAllBytes(Paths.get(filePath));
        
        // Compress the image
		/*
		 * byte[] compressedImage = ImageUtils.compressImage(imageBytes, 0.5f); //
		 * Assuming compressImage accepts byte array book.setImage(compressedImage);
		 */

        //book.setImage(base64Image);
		
		
		return repo.save(book).getId();
		
	}

	/*
	 * private String encodeImageBase64(String filePath) { Path
	 * path=Paths.get(filePath); byte[] fileContent=null;; try { fileContent =
	 * Files.readAllBytes(path); } catch (IOException e) {
	 * 
	 * e.printStackTrace(); } return Base64.encodeBase64String(fileContent); }
	 */
	
	
}
