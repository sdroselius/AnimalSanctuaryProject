package com.skilldistillery.sanctuary;

public class Giraffe extends Animal {
	
	private static String noise = "I sure am tall!";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("These " + amount + " leaves are yummy.");
	}
	
	

}
