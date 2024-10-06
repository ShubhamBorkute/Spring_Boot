package com.nit.service;

import java.util.List;

import com.nit.entity.Library;

public interface LibraryService {

	public Integer saveBook(Library l);
	public List<Library> getBook();
	
	public List<Library> getBook(String category);
}
