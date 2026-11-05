package assignmentTwo;

import java.util.Scanner;

public class WeeklyPayAndSavingsMain {

	public static void main(String[] args) {

		WeeklyPayAndSavings employee = new WeeklyPayAndSavings();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter hours worked");

		// handling the invalid input
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input !");
			sc.next();
			System.out.println("Enter the hours worked");

		}

		employee.hoursWorked = sc.nextInt();

		// handling negative input
		while (employee.hoursWorked <= 0) {
			System.out.println("Hours cannot be neagtive");
			System.out.println("Enter hours worked");

			while (!sc.hasNextInt()) {
				System.out.println("Invalid input");
				sc.next();
				System.out.println("Enter the hours worked");
			}

			employee.hoursWorked = sc.nextInt();
		}

		System.out.println("Enter your hourly rate");

		// handling invalid input
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid input!");
			sc.next();
			System.out.println("Enter hourly rate");
		}

		employee.hourlyRate = sc.nextDouble();

		// handling negative input

		while (employee.hourlyRate <= 0) {
			System.out.println("Hourly rate cannot be negative");
			System.out.println("Enter hourly rate");

			while (!sc.hasNextDouble()) {
				System.out.println("Invalid input!");
				sc.next();
				System.out.println("Enter hourly rate");
			}
			employee.hourlyRate = sc.nextDouble();

		}

		System.out.println("Enter your attendance in true or false");

		while (!sc.hasNextBoolean()) {
			System.out.println("Invalid input");
			sc.next();
			System.out.println("Enter attendance in true or false only");
		}

		employee.perfectAttendance = sc.nextBoolean();

		employee.calculateRegulatPayAndOverTime();
		employee.calculateAttendanceBonus();
		employee.calculateGrossPay();

		sc.close();
	}

}
