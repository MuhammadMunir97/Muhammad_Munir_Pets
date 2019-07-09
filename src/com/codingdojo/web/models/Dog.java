package com.codingdojo.web.models;

public class Dog extends Animal{
	Pet pet;
	
	Dog (){
		
	}
	public Dog (String name, String breed, int weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		if (weight < 30) {
		pet = new HuggingAffection();
		}else {
			pet = new SittingAffection();
		}
	}
	public String showingAffection() {
		return "You created a "+ this.name  + "! ," + pet.showAffection();
		
	}
	
	public String returnType() {
		return this.breed;
	}
}
