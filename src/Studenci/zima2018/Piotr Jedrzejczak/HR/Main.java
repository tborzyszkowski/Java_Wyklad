package lab4.HR;

public class Main {

	public static void main(String[] args) {
		Manager Janusz = new Manager("Janusz", "Giwera", "£opatologia", 1942, 10000, 2000, 888999444, 13, 444333222, 0.07);
		Intern Pioter = new Intern("Pioter", "Nosacz", 1995, Janusz);
		Worker Sebastian = new Worker(Janusz, "Sebastian", "Kasztan", 1986, 220, 20, 11.90);
		IntelectualEmployee Adam = new IntelectualEmployee("Adam", "Kornik", 1988, 3000, 15, 333444222, 0.05, Janusz);
		BoardMember Winicjusz = new BoardMember("Winicjusz", "Petroniusz", 1975, 15000, 4, Adam);
		
		
		System.out.print("\n**************************************************\n");
		System.out.print(Janusz);
		System.out.print("\nWyp³ata: " +Janusz.calculateSalary());
		System.out.print("\n**************************************************\n");
		System.out.print(Pioter);
		System.out.print("\nWyp³ata: " +Pioter.calculateSalary());
		System.out.print("\n**************************************************\n");
		System.out.print(Sebastian);
		System.out.print("\nWyp³ata: " + Sebastian.calculateSalary());
		System.out.print("\n**************************************************\n");
		System.out.print(Adam);
		System.out.print("\nWyp³ata: " +Adam.calculateSalary());
		System.out.print("\n**************************************************\n");
		System.out.print(Winicjusz);
		System.out.print("\nWyp³ata: " +Winicjusz.calculateSalary());
		System.out.print("\n**************************************************\n");
		Pioter.grantScholarship();
		System.out.print(Pioter);
		System.out.print("\nWyp³ata: " +Pioter.calculateSalary());
		System.out.print("\n**************************************************\n");
		Sebastian.addSkill("Zaawansowana obs³uga taczki");
		System.out.print(Sebastian);
		System.out.print("\n**************************************************\n");
		
	}

}
