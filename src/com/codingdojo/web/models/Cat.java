package com.codingdojo.web.models;

public class Cat extends Animal{
	Pet pet;
	Cat (){
		
	}
	public Cat (String name, String breed, int weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		pet = new GazzingAffection();
	}
	public String showingAffection() {
		return "Your "  + this.breed  + " " +  this.name + " , " + pet.showAffection();
	}
	
	public String returnType() {  
		return this.breed;
	}
}
