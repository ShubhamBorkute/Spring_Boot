package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {

}
