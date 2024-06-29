package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	private Sanctuary sanctuary;
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		printMainMenu();
		boolean keepGoing = true;

		do {
			printMainMenu();
			int choice = kb.nextInt();
			kb.nextLine();
			switch (choice) {
				case 1:
					if (sanctuary != null) {
						sanctuary.listAnimals();
					}
					break;
				case 2:
					addAnimalToSanctuary();
					break;
				case 3:
					if (sanctuary != null) {
						sanctuary.startAttendantRounds();
					}
					break;
				case 4: 
					keepGoing = false;
					break;
				default:
					System.out.println("Invalid choice: " + choice);
					break;
			}
		} while (keepGoing);

		kb.close();
	}

	private void addAnimalToSanctuary() {
		// TODO Auto-generated method stub
		
	}

	private void printMainMenu() {
		System.out.println("** Welcome to the Animal Sanctuary **");
		System.out.println("1) List animals");
		System.out.println("2) Add new animal");
		System.out.println("3) Start attendant rounds");
		System.out.println("4) Exit");
	}
}
