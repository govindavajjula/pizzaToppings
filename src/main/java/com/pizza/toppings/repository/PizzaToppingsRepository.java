package com.pizza.toppings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pizza.toppings.domain.Toppings;
@Repository
public interface PizzaToppingsRepository extends JpaRepository<Toppings, Long>{
	
	//List<PizzaToppings> findById(id); */
	//  List<PizzaToppings> findAll();
	  
	/*
	 * @Query(value="select * from pizzatoppings" ,nativeQuery = true)
	 * List<PizzaToppings> getAllToppings();
	 */
	}

