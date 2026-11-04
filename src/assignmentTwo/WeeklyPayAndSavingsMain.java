package assignmentTwo;

import java.util.Scanner;

public class WeeklyPayAndSavingsMain {

	public static void main(String[] args) {

		WeeklyPayAndSavings employee = new WeeklyPayAndSavings();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter hours worked");

		employee.hoursWorked = sc.nextInt();

		System.out.println("Enter your hourly rate");

		employee.hourlyRate = sc.nextDouble();

		System.out.println("Enter your attendance in true or false");

		employee.perfectAttendance = sc.nextBoolean();

		employee.calculateRegulatPayAndOverTime();
		employee.calculateAttendanceBonus();
		employee.calculateGrossPay();

	}

}
