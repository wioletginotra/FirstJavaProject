package loopsAssignment;

import java.util.Scanner;

public class LoopsAssignment {

	Scanner sc = new Scanner(System.in);
	int i;

	// question 1 : What are the three components of a loop
	// Answer : Initialization , Condition , Condition

	// question 2: What is the use of break statement
	// Answer : Break statement breaks the loop and moves the control to the next
	// statement

	// question 4: Write a program that prompts the user to input a positive integer
	// It should then output a message indicating whether the number is a prime
	// number or not

	void primeNumber() {
		System.out.println("Enter a Positive Number");
		int num = sc.nextInt();
		for (i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (num > 1 && i == num) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

	// question 5: write a program that will keep adding 5 chocolates to a box which
	// already has 27
	// chocolates and add a mechanism that number of chocolates should never go
	// above 63

	void chocolates() {

		int chocolates = 27;
		while (true) {
			if (chocolates + 5 > 63) {
				break;
			}
			chocolates = chocolates + 5;
			System.out.println(chocolates);
		}
		System.out.println("Final count:" + chocolates);
	}

	// question 6 : userName and Password

	void checkUserNameAndPassword() {

		String userName = "pivotAdmin";
		String password = "Admin123";

		for (i = 0; i <= 2; i++) {
			System.out.println("Enter UserName");
			String enteredUserName = sc.next();
			System.out.println("Enter password");
			String enteredPassword = sc.next();
			if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
				System.out.println("You are logged into the application");
				break;
			} else {
				System.out.println("Incorrect User id or password.Try again");
			}
			if (i == 2) {
				System.out.println("Account Locked");
			}
		}
	}

	// question 7: calculator a. Square of a number b. Cube of a number c. print
	// "Invalid operation"
	// if anything else entered

	void calculator() {

		System.out.println("Welcome to online calculator");
		System.out.println("please select from below choice: \n1.Square of a number\n2.Cube of a number \n");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the number");
			int numOne = sc.nextInt();
			System.out.println("The Square of num:" + (numOne * numOne));
			break;
		case 2:
			System.out.println("Enter the number");
			int numTwo = sc.nextInt();
			System.out.println("The cube of num:" + (numTwo * numTwo * numTwo));
			break;

		default:
			System.out.println("Invalid Operation");
		}
	}
}
