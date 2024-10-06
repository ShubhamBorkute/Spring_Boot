package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Library;
import com.nit.repository.LibraryRepository;
@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
	private LibraryRepository repo;
	@Override
	public List<Library> getBook() {
		
		return repo.findAll();
	}

	@Override
	public List<Library> getBook(String category) {
		
		return repo.findByCategory(category);
	}

	@Override
	public Integer saveBook(Library l) {
		
		return repo.save(l).getId();
	}

}
