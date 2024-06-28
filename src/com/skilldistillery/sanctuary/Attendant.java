package com.skilldistillery.sanctuary;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		System.out.println("Starting my rounds");
		for (Animal animal : animals) {
			if (animal == null ) {
				System.out.println("This enclosure is empty, on to the next one.");
			}
			else {
				int foodAmount = (int)(Math.random() * 40)+1;
				System.out.println("I'm feeding " + animal.getName() + " the "
						+ animal.getClass().getSimpleName()
						+ " " + foodAmount + " foods.") ;
				animal.eat(foodAmount);
			}
		}
		System.out.println("Animals fed, it's quittin' time!");
		
	}

}
