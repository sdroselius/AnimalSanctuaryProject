package com.skilldistillery.sanctuary;

public class Lion extends Animal {
	private static String noise = "RAWWRR!!";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("Im tearing into " + amount + " meats!");
	}
	
}
