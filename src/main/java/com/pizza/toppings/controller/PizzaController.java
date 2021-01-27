package com.pizza.toppings.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.toppings.domain.Toppings;
import com.pizza.toppings.repository.PizzaToppingsRepository;

@RestController
public class PizzaController {
	private final AtomicLong counter = new AtomicLong();
	@Autowired
	PizzaToppingsRepository pizzaToppingsRepo;

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@GetMapping("/getToppings")
	public ResponseEntity<List<Toppings>> getAllToppings(){
		try {
			List<Toppings> toppings = new ArrayList<Toppings>();
			pizzaToppingsRepo.findAll().forEach(toppings::add);
			if (toppings.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(toppings, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@PostMapping("/addToppings")
	public ResponseEntity<Toppings> createToppings(@RequestBody Toppings topping) {
		try {
			Toppings _topping = pizzaToppingsRepo
					.save(new Toppings(topping.getName(),topping.getDescription()));
			return new ResponseEntity<>(_topping, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/topping/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		try {
			pizzaToppingsRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}