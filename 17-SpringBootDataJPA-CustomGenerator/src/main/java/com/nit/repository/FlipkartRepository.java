package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.FlipkartOrder;

public interface FlipkartRepository extends JpaRepository<FlipkartOrder, Serializable>  {

}
