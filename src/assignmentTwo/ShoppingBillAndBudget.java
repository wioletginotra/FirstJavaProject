package assignmentTwo;

import java.util.Scanner;

public class ShoppingBillAndBudget {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pricePerItem;
		int quantity;
		boolean isMember;
		double budget;
		double subTotal;
		double discount;
		double finalBill;

		System.out.println("Enter price per item");

		pricePerItem = sc.nextDouble();

		System.out.println("Enter the quatity");

		quantity = sc.nextInt();

		System.out.println("Are you a member enter true or false ");

		isMember = sc.nextBoolean();

		System.out.println("Enter your Budget");

		budget = sc.nextDouble();

		// calculate sub total
		subTotal = pricePerItem * quantity;

		// calculate discount

		discount = 0;

		if (isMember) {
			if (subTotal >= 100) {
				discount = subTotal * 0.10;
			} else {
				discount = subTotal * 0.05;
			}
		}

		// final bill

		finalBill = subTotal - discount;
		System.out.println("Your discount is CAD" + " " + discount);
		System.out.println("Your subtotal  is CAD" + " " + subTotal);
		System.out.println("Your final bill is CAD" + " " + finalBill);

		// Budget

		if (budget >= finalBill) {
			System.out.println("You are within budget");
		} else {
			System.out.println("You are over budget");
		}

	}

}
