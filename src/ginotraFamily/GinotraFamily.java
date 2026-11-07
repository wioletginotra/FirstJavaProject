package ginotraFamily;

public class GinotraFamily {

	String name;
	boolean isEarning;
	boolean isStudent;

	void displayDetails() {

		System.out.println("Name:" + name);

		if (isEarning) {
			System.out.println("Status : is the earning member");
		} else if (isStudent) {
			System.out.println("Status: is the student");
		} else {
			System.out.println("Status: neither earning non student ");
		}

	}

}
