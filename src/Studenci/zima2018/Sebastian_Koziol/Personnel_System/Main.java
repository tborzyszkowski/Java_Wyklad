package Personnel_System;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker();
		Worker worker2 = new Worker("Janusz", "Kowalski", 1980);
		System.out.println(worker);
		System.out.println(worker2);
		
		Apprentice apprentice = new Apprentice("Sebastian", "Koziol", 1410, false);
		Apprentice apprentice2 = new Apprentice("Koziol", "Sebastian", 1997, true);
		Apprentice apprentice3 = new Apprentice("Stonka", "Biedronka", 2016, true);
		System.out.println(apprentice);
		System.out.println(apprentice2);
		System.out.println(apprentice3);
		
		BoardMember prezes = new BoardMember("Prezes", "Prezesowski", 1950, 7500, apprentice.assistant(), 8);
		System.out.println(prezes);
		
		MentalWorker manager = new Manager("Robert", "Nowak", 1983, 3800, 22, 500500500, 580001313, 12, "Assitance");
		MentalWorker manager2 = new Manager("Katarzyna", "Jakubowska", 1987, 4000, 8, 900900900, 581231232, 14, "Medical");
		System.out.println(manager);
		System.out.println(manager2);
		
		BodyWorker bodyWorker = new BodyWorker("Piotr", "Nowak", 1990, 12.5, 16, 168, manager.boss(), new String[] {"Everything"});
		BodyWorker bodyWorker2 = new BodyWorker("Bebek", "Bebski", 1997, 18.6, 42, 160, manager2.boss(), new String[] {"Driving", "can fly"});

		System.out.println(bodyWorker);
		System.out.println(bodyWorker2);
		
		MentalWorker mentaWorkerl = new MentalWorker("Andrzej", "Nowakowski", 1974, 3200, 15, manager2.boss(), 123123123, 123);
		MentalWorker mentalWorker2 = new MentalWorker("Krystian", "Piotrowski", 1965, 3500, 12, manager.boss(), 112142234, 124);
		System.out.println(mentaWorkerl);
		System.out.println(mentalWorker2);
	}
}
