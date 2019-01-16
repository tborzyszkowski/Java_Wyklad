import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Manager m1 = new Manager("CCC", "XXX", LocalDate.of(1900, 11, 11), "22222", "1");
		System.out.println(m1.toString());

		ManualEmployee me1 = new ManualEmployee("AAA", "ZZZ", LocalDate.of(1900, 11, 11), null);
		me1.setHourlyRate(30);
		me1.setHoursWorked(160);
		me1.setOvertime(5);
		System.out.println(me1.toString());

		OfficeEmployee oe1 = new OfficeEmployee("Bbb", "WWW", LocalDate.of(1900, 11, 11), m1, "1111111", "11");
		oe1.setSalary(5000);
		oe1.setPercentageOfBonus(0.1);
		System.out.println(oe1.toString());

		BoardMember bm1 = new BoardMember("Vvv", "ZZZ", LocalDate.of(1900, 11, 11));
		System.out.println(bm1.toString());

		Trainee t1 = new Trainee("QQQ", "XXX", LocalDate.of(1999, 11, 11));
		t1.setScholarship(true);
		t1.setScholarship(1000);
		t1.setGuardian(oe1);
		System.out.println(t1.toString());

	}

}