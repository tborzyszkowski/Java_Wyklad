package kadry;

public class praktykant extends pracownik{
	boolean stypendium;
	void printdanepra() {
		printdane();
		if (stypendium==true) {
			System.out.println("Stypendium: 500" );
		}
		else {
			System.out.println("Stypendium: brak" );
		}
	}
	
	}
