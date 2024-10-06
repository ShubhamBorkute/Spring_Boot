package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

	@Query(value="select * from library where category=:category", nativeQuery = true)
	public List<Library> findByCategory(String category);
}
