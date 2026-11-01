package assignmentTwo;

import java.util.Scanner;

public class WeeklyPayAndSavings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hoursWorked;
		double hourlyRate;
		boolean perfectAttendance;

		double regularPay;
		double overTime;
		double attendanceBonus;
		double grossPay;
		double savings;
		double takeHomePay;

		System.out.println("Enter hours worked");

		hoursWorked = sc.nextInt();

		System.out.println("Enter hourly rate");

		hourlyRate = sc.nextDouble();

		System.out.println("Enter attendance in true or false");

		perfectAttendance = sc.nextBoolean();

		// Calculate regular pay and overtime pay
		if (hoursWorked <= 40) {
			regularPay = hoursWorked * hourlyRate;
			overTime = 0;
		} else {
			regularPay = 40 * hourlyRate;
			overTime = (hoursWorked - 40) * hourlyRate + 1.5;

		}

		// Attendance bonus

		if (perfectAttendance == true) {
			if (hoursWorked >= 40) {

				attendanceBonus = 50;

			} else {
				attendanceBonus = 20;
			}

		} else {
			attendanceBonus = 0;
		}

		// calculate gross pay

		grossPay = regularPay + overTime + attendanceBonus;

		// Transfer 5% of gross pay into savings
		savings = grossPay * 0.05;

		// Calculate remaining take-home pay
		takeHomePay = grossPay - savings;

	}

}
