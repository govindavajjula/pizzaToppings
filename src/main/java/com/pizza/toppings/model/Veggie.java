package com.pizza.toppings.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Veggie {

	private String tomotoes;
	private String onions;
	private String mushroom;
	private String pepper;
	private String pineapple;
	public String getTomotoes() {
		return tomotoes;
	}
	public void setTomotoes(String tomotoes) {
		this.tomotoes = tomotoes;
	}
	public String getOnions() {
		return onions;
	}
	public void setOnions(String onions) {
		this.onions = onions;
	}
	public String getMushroom() {
		return mushroom;
	}
	public void setMushroom(String mushroom) {
		this.mushroom = mushroom;
	}
	public String getPepper() {
		return pepper;
	}
	public void setPepper(String pepper) {
		this.pepper = pepper;
	}
	public String getPineapple() {
		return pineapple;
	}
	public void setPineapple(String pineapple) {
		this.pineapple = pineapple;
	}
}
