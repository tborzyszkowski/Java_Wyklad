package Personnel_System;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker();
		Worker worker2 = new Worker("Janusz", "Kowalski", 1980);
		
		BodyWorker bodyWorker = new BodyWorker("Piotr", "Nowak", 1990, 12.5, 16, 168);
		BodyWorker bodyWorker2 = new BodyWorker("Bebek", "Bebski", 1997, 18.6, 42, 160);
		
		System.out.println(worker);
		System.out.println(worker2);
		
		System.out.println(bodyWorker);
		System.out.println(bodyWorker2);
		//bodyWorker2.abilitiesAdd("test2");
		//System.out.println(bodyWorker2.abilitiesAdd("test2"));
		//System.out.println(bodyWorker2.abilitiesAdd("test22"));
		
		Apprentice apprentice = new Apprentice("Sebastian", "Koziol", 1410, false);
		Apprentice apprentice2 = new Apprentice("Koziol", "Sebastian", 2017, true);
		Apprentice apprentice3 = new Apprentice("Stonka", "Biedronka", 2016, true);
		System.out.println(apprentice);
		System.out.println(apprentice2);
		System.out.println(apprentice3);
		

	}

}
