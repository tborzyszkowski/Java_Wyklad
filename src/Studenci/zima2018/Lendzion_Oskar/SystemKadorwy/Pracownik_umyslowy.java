
public class Pracownik_umyslowy extends pracownik{
	
	private double premia;
	private String telefon;
	private String pokoj;
	private Kierownik kierownik;
	
	
	public Pracownik_umyslowy() {
		super();
	}
	
	
	
	
	public Pracownik_umyslowy(String imie, String nazwisko, int rok_urodzenia, double pensja, double d, Kierownik kierownik, String telefon, String pokoj) {
		super(imie, nazwisko, rok_urodzenia);
		this.premia = d;
		this.kierownik = kierownik;
		this.telefon = telefon;
		this.pokoj = pokoj;
		this.pensja = pensja * (1 + d);
	}




	public double getPremia() {
		return premia;
	}




	public void setPremia(double premia) {
		this.premia = premia;
	}




	public String getTelefon() {
		return telefon;
	}




	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}




	public String getPokoj() {
		return pokoj;
	}




	public void setPokoj(String pokoj) {
		this.pokoj = pokoj;
	}




	public Kierownik getKierownik() {
		return kierownik;
	}




	public void setKierownik(Kierownik kierownik) {
		this.kierownik = kierownik;
	}




	@Override
	public String toString() {
		return "Pracownik umys³owy, Imie: " + imie + ", Nazwisko: " + nazwisko + ", Rok urodzenia: " + rok_urodzenia + ", telefon: " + telefon + ", Pokoj: " + pokoj;
	}
	
	

}
