package com.nit.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nit.helper.FileUploadHelper;

import jakarta.mail.Multipart;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploadHelper fileHelper;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		
		/*
		 * System.out.println(file.getSize());
		 * System.out.println(file.getOriginalFilename());
		 */
		try {
			if(file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must Upload File");
			}
		if(fileHelper.uploadFile(file)) {
			return ResponseEntity.ok("File Upload Successfully");
		}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
	}
	

}
