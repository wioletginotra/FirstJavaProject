package ginotraFamily;

import java.util.Scanner;

public class FamilyGinotra {

	String name;
	boolean isEarning;
	boolean isStudent;

	void getDetails(Scanner sc) {

		System.out.println("Enter name of the family member");

		name = sc.nextLine();

		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Invalid name! Enter letters only:");
			name = sc.nextLine();
		}

		// name = sc.nextLine();

		System.out.println("Are you earning enter (true/false)");

		while (!sc.hasNextBoolean()) {
			System.out.println("Invalid input! Enter true or false)");
			sc.next();
		}

		isEarning = sc.nextBoolean();

		System.out.println("Are you student enter (true/false)");

		while (!sc.hasNextBoolean()) {
			System.out.println("Invalid input! Enter true or false)");
			sc.next();
		}

		isStudent = sc.nextBoolean();

		sc.nextLine();

	}

	void displayDetails() {

		if (isEarning) {
			System.out.println(name + ":is the earner");
		}
		if (isStudent) {
			System.out.println(name + ":is Student");
		}
		if (isEarning && isStudent) {
			System.out.println(name + ":is both an earner and a student");
		}
		if (!isEarning && !isStudent) {
			System.out.println(name + ":is neither an earner nor a student");

		}
	}
}
