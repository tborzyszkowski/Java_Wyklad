package kadry;

public class fizyczny extends pracownik {
	double stawkagodzinowa,wyplata;
	int lpg,lng;
	String umiejetnosci;
	void printdanefiz() { 
		printdane();
		wyplata = (stawkagodzinowa * lpg + stawkagodzinowa * 1.5 * lng);
		System.out.println("umiejêtnoœci: " + umiejetnosci);
		System.out.println("liczba przepracowanych godzin: " + lpg);
		System.out.println("liczba nadgodzin: " + lng);
		System.out.println("stawka godzinowa: " + stawkagodzinowa);
		System.out.println("wypÅ‚ata: " + wyplata);
	}
	}