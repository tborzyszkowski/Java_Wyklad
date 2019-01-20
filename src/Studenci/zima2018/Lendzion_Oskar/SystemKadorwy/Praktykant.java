
public class Praktykant extends pracownik{
	
	private Pracownik_fizyczny opiekun;
	private boolean stypendium;
	
	
	public Praktykant() {
		super();
	}
	
	
	public Praktykant(String imie, String nazwisko, int rok_urodzenia, Pracownik_fizyczny opiekun, boolean stypendium) {
		super(imie, nazwisko, rok_urodzenia);
		this.opiekun = opiekun;
		if (stypendium)
			this.pensja = 1200;
	}


	public Pracownik_fizyczny getOpiekun() {
		return opiekun;
	}


	public void setOpiekun(Pracownik_fizyczny opiekun) {
		this.opiekun = opiekun;
	}


	public boolean isStypendium() {
		return stypendium;
	}


	public void setStypendium(boolean stypendium) {
		this.stypendium = stypendium;
	}


	@Override
	public String toString() {
		return "Praktykant, Imie: " + imie + ", Nazwisko: " + nazwisko + ", Rok urodzenia: " + rok_urodzenia + ", opiekun: [" + opiekun + "]";
	}
	

	
	
}
