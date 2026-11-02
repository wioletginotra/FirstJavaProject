package assignmentTwo;

public class ShoppingBillAndBudget {

	double pricePerItem;
	int quantity;
	boolean isMember;
	double budget;

	double subtotal;
	double discount = 0;
	double finalBill;
	double moneyLeft;
	double shortFall;

	// calculate sub total

	void calculateSubtotal() {
		subtotal = pricePerItem * quantity;
	}

	// calculate the membership discount with nested if condition

	void membershipDiscount() {

		if (isMember == true) {
			if (subtotal >= 100) {
				discount = subtotal * 0.10;
			} else {
				discount = subtotal * 0.05;
			}
		} else {
			discount = 0;
		}

		// calculate the final bill

	}

	// calculate the final bill
	void calculateFinalBill() {

		finalBill = subtotal - discount;
		System.out.println("Your Final bill is CAD:" + finalBill);
	}

	// compare final bill with budget and show money left

	void compareBudget() {

		if (finalBill <= budget) {
			System.out.println("You are within budget");
			moneyLeft = budget - finalBill;
			System.out.println("Your money left is:" + moneyLeft);
		} else {
			System.out.println("You are over budget");
			shortFall = finalBill - budget;
			System.out.println("ShortFall is:" + shortFall);

		}

	}

}
