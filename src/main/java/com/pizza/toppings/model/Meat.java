package com.pizza.toppings.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meat {

	private String chicken;
	private String pepperoni;
	private String beef;
	private String steak;
	private String bacon;
	
	public String getChicken() {
		return chicken;
	}
	public void setChicken(String chicken) {
		this.chicken = chicken;
	}
	public String getPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(String pepperoni) {
		this.pepperoni = pepperoni;
	}
	public String getBeef() {
		return beef;
	}
	public void setBeef(String beef) {
		this.beef = beef;
	}
	public String getSteak() {
		return steak;
	}
	public void setSteak(String steak) {
		this.steak = steak;
	}
	public String getBacon() {
		return bacon;
	}
	public void setBacon(String bacon) {
		this.bacon = bacon;
	}
}
