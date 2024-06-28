package com.skilldistillery.sanctuary;

public class Emu extends Animal {
	
	private static String noise = "Grunt grunt";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("I'm getting in your face and eating " + amount + " seeds");
	}
	
	

}
