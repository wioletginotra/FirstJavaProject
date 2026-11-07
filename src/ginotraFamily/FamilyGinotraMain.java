package ginotraFamily;

import java.util.Scanner;

public class FamilyGinotraMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FamilyGinotra father = new FamilyGinotra();
		FamilyGinotra mother = new FamilyGinotra();
		FamilyGinotra elderSon = new FamilyGinotra();
		FamilyGinotra youngerSon = new FamilyGinotra();

		System.out.println("Enter the details of family member 1");

		father.getDetails(sc);

		System.out.println("Enter the details of family member 2");

		mother.getDetails(sc);

		System.out.println("Enter the details of family member 3");

		elderSon.getDetails(sc);

		System.out.println("Enter the details of family member 4");

		youngerSon.getDetails(sc);

		father.displayDetails();
		mother.displayDetails();
		elderSon.displayDetails();
		youngerSon.displayDetails();

		sc.close();
	}

}
