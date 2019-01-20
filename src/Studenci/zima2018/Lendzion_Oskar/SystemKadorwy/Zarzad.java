public class Zarzad extends pracownik{

	
	private Pracownik_umyslowy asystent;
	private int ilosc_spotkan;
	
	
	public Zarzad() {
		super();
	}
	
	
	public Zarzad(String imie, String nazwisko, int rok_urodzenia, double pensja, Pracownik_umyslowy asystent, int ilosc_spotkan) {
		super(imie, nazwisko, rok_urodzenia);
		this.asystent = asystent;
		this.pensja = pensja + ilosc_spotkan * 100;
	}


	public Pracownik_umyslowy getAsystent() {
		return asystent;
	}


	public void setAsystent(Pracownik_umyslowy asystent) {
		this.asystent = asystent;
	}


	public int getIlosc_spotkan() {
		return ilosc_spotkan;
	}


	public void setIlosc_spotkan(int ilosc_spotkan) {
		this.ilosc_spotkan = ilosc_spotkan;
	}


	@Override
	public String toString() {
		return "Cz³onek zarz¹du, Imie: " + imie + ", Nazwisko: " + nazwisko + ", Rok urodzenia: " + rok_urodzenia + ", asystent: [" + asystent + "]";
	}
	
	
	
	
	

}