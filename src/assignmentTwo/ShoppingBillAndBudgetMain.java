package assignmentTwo;

import java.util.Scanner;

public class ShoppingBillAndBudgetMain {

	public static void main(String[] args) {

		// Instantiated the class by creating object

		ShoppingBillAndBudget shop = new ShoppingBillAndBudget();

		// Used scanner class to take user input

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price per item");

		shop.pricePerItem = sc.nextDouble();

		System.out.println("Enter the quantity");

		shop.quantity = sc.nextInt();

		System.out.println("Are you a member?Enter true or false");

		shop.isMember = sc.nextBoolean();

		System.out.println("What is your budget");

		shop.budget = sc.nextDouble();

		// Calling the methods from the class

		shop.calculateSubtotal();
		shop.membershipDiscount();
		shop.calculateFinalBill();
		shop.compareBudget();

		sc.close();

	}

}
