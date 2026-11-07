package ginotraFamily;

public class GinotraFamilyMain {

	public static void main(String[] args) {

		GinotraFamily jitin = new GinotraFamily();

		jitin.name = "Jitin";
		jitin.isEarning = true;
		jitin.isStudent = false;

		GinotraFamily wiolet = new GinotraFamily();

		wiolet.name = "Wiolet";
		wiolet.isEarning = true;
		wiolet.isStudent = false;

		GinotraFamily gaitik = new GinotraFamily();

		gaitik.name = "Gaitik";
		gaitik.isEarning = false;
		gaitik.isStudent = true;

		GinotraFamily druvik = new GinotraFamily();

		druvik.name = "Druvik";
		druvik.isEarning = false;
		druvik.isStudent = true;

		jitin.displayDetails();
		wiolet.displayDetails();
		gaitik.displayDetails();
		druvik.displayDetails();

	}

}
