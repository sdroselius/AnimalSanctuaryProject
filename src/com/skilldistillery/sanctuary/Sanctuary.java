package com.skilldistillery.sanctuary;

public class Sanctuary {

	private Animal[] animals;
	
	private Attendant attendant;
	
	public void listAnimals() {
		for (Animal animal : animals) {
			System.out.println(animal.getName() + " is a " + animal.getClass().getSimpleName());
		}
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void addAnimal(Animal newAnimal) {
		boolean added = false;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				animals[i] = newAnimal;
				added = true;
				break;
			}
		}
		if (! added) {
			System.out.println("Sorry, the sanctuary is full.");
		}
	}
	
	public void startAttendantRounds() {
		if (attendant != null) {
			attendant.makeRounds(animals);
		}
	}
}
