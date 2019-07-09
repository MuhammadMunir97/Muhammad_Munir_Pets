package com.codingdojo.web.models;

public interface Pet {
	public String showAffection();
}

class GazzingAffection implements Pet{

	@Override
	public String showAffection() {
		return "looked at you with some affection. You think.";
	}
	
}

class HuggingAffection implements Pet{

	@Override
	public String showAffection() {
		return "hopped into your lap, and cuddled you.";
	}
	
	
}

class SittingAffection implements Pet{

	@Override
	public String showAffection() {
		return "Sat right next to you, and cuddled you.";
	}
	
	
}

