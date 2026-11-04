package assignmentTwo;

public class WeeklyPayAndSavings {

	int hoursWorked;
	double hourlyRate;
	boolean perfectAttendance;

	double regularPay;
	double overtimePay;
	double attendanceBonus;
	double grossPay;
	double savings;
	double takeHomePay;

	// calculate regular pay overtime used if else
	void calculateRegulatPayAndOverTime() {
		if (hoursWorked <= 40) {
			regularPay = hoursWorked * hourlyRate;
			overtimePay = 0;
			System.err.println("Your regulay pay is:$" + " " + regularPay);
		} else {
			regularPay = 40 * hourlyRate;
			overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
			System.out.println("Your regulay pay is:$" + " " + regularPay);
			System.out.println("Your overtimr is:$" + " " + overtimePay);
		}
	}

	// calculate attendance bonus used nested if

	void calculateAttendanceBonus() {
		if (perfectAttendance == true) {
			if (hoursWorked > 40) {
				attendanceBonus = 50;
				System.out.println("Your attendance Bonus is:$" + " " + attendanceBonus);
			} else {
				attendanceBonus = 20;
				System.out.println("Your attendance Bonus is:$" + " " + attendanceBonus);
			}
		} else {
			attendanceBonus = 0;
		}
	}

	// calculate gross pay

	void calculateGrossPay() {
		grossPay = regularPay + overtimePay + attendanceBonus;
		System.out.println("Your gross pay is:$" + " " + grossPay);
		savings = grossPay * 0.05;
		System.out.println("You savings are:$" + " " + savings);
		takeHomePay = grossPay - savings;
		System.out.println("Your take home is:$" + " " + takeHomePay);

	}

}
