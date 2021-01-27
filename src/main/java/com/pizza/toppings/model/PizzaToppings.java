package com.pizza.toppings.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PizzaToppings {

	private int id ;
	
	private List<Veggie> veggies = new ArrayList<>();
	private List<Meat> meat = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Veggie> getVeggies() {
		return veggies;
	}
	public void setVeggies(List<Veggie> veggies) {
		this.veggies = veggies;
	}
	public List<Meat> getMeat() {
		return meat;
	}
	public void setMeat(List<Meat> meat) {
		this.meat = meat;
	}
	
	
}
