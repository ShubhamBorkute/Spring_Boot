package com.nit.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final  String path="D:\\Spring_Boot\\Cold_Email_Project devemail\\src\\main\\resources\\static\\resume";


	   public boolean uploadFile(MultipartFile file) {
		
		   boolean status =false;
		   
		   try {
			
				/*
				 * InputStream stream = file.getInputStream(); byte data[]=new
				 * byte[stream.available()];
				 * 
				 * stream.read(data);
				 * 
				 * FileOutputStream fos=new
				 * FileOutputStream(path+"\\"+file.getOriginalFilename()); fos.write(data);
				 * fos.flush(); fos.close();
				 */
			   
			   Files.copy(file.getInputStream(),Paths.get(path+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			   status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
		   return status;
	}






}
