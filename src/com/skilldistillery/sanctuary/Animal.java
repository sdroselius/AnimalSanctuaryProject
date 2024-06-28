package com.skilldistillery.sanctuary;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("???");
	}
	
	public void eat(int amount) {
		System.out.println("I am eating " + amount + " foods.");
		
	}

}
