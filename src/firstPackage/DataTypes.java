package firstPackage;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// question 1
		int count = 12;

		// question 2
		double price = 19.95;

		// question 3
		boolean t = true;

		// question 4

		String city = "Brampton";

		// question 5
		char grade = 'A';

		// question 6 valid variable declared as totalMarks

		// question 7

		int score = 4;
		score = 9;
		System.out.println(score);

		// question 8
		int age = 18;
		boolean isAdult = age >= 18;
		System.out.println(isAdult);

		// question 9
		String firstName = "Asha";
		int age1 = 20;
		double height = 1.65;
		boolean isStudent = true;
		char grade1 = 'B';

		// question 10
		int points = 10;
		points = 15;
		points = 13;
		System.out.println(points);

		// question 11
		double price1 = 12.50;
		int quality = 4;
		double total = (price1 * quality);
		System.out.println(total);

		// question12
		int age2 = 17;
		boolean canVote = age2 >= 18;
		System.out.println(canVote);

		// question 13

		String firstName1 = "Ashaa";
		String lastName = "Singh";
		String fullName = firstName1 + " " + lastName;
		System.out.println(fullName);

		// question 14

		String item = "Notebook";
		int quantity = 3;
		double pricee = 4.5;
		boolean available = true;

		// question 15

		int a = 10;
		int b = 20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

		// question 16

		int count1 = 6;
		double countAsDouble = count1;
		System.out.println(count1);
		System.out.println(countAsDouble);

		// question 17 after assigning y to x than we changed the value of x thats why y
		// remains
		// changed and x has new value

		int x = 10;
		int y = x;
		x = 20;
		System.out.println(x);
		System.out.println(y);

		// question 18 the first output is concatenation 2 numbers and 2nd output is
		// doing the addition operation inside the bracket and than displaying results

		System.out.println("Total:" + 2 + 3);
		System.out.println("Total:" + (2 + 3));

		// question 19 the actual output is 3.0 its diving 7 by below is the approx
		// calculation to bring the number to 3.5

		double answer = 7.01 / 2;
		System.out.println(answer);

		// question 20 the first condition is false when we reassign and new age and
		// again repeat
		// the condition is new answer the true as the age match

		int age3 = 17;
		boolean isAdultt = age3 >= 18;
		age3 = 18;
		isAdultt = age3 >= 18;
		System.out.println(isAdultt);

		// question 21 i am main and score is not initialized thats why is it giving
		// compilation error
		// i have initialized it with 0 so that it prints 0;

		int score1 = 0;
		System.out.println(score1);

		// question 22 these are 2 different data types and changing the data type is
		// not allowed in java
		// i have have stored the word in String data type

		int value = 10;
		String word = "ten";

		// question 23 String data type can preserve 0 before the number
		// int data type can hold value without 0 in the beginning

		String lockerCode = "007";
		int lockerNumber = 7;

		// question 24 totall and Totall are 2 diff variable because java is case
		// sensitive

		int totall = 5;
		int Totall = 8;
		totall = totall + 1;
		System.out.println(totall);
		System.out.println(Totall);

	}

}
