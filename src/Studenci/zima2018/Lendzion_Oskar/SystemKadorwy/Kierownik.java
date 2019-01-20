
public class Kierownik  extends pracownik{

	private double premia;
	private double dodatek;
	private String telefon;
	private String pokoj;
	private String dzial;
	
	
	public Kierownik() {
		super();
	}
	
	
	
	
	public Kierownik(String imie, String nazwisko, int rok_urodzenia, double pensja, double d, double e, String telefon, String pokoj, String dzial) {
		super(imie, nazwisko, rok_urodzenia);
		this.premia = d;
		this.dodatek = e;
		this.telefon = telefon;
		this.pokoj = pokoj;
		this.dzial = dzial;
		this.pensja = pensja * (1 + d) + e;
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


	
	public double getPremia() {
		return premia;
	}
	public void setPremia(float premia) {
		this.premia = premia;
	}
	public double getDodatek() {
		return dodatek;
	}
	public void setDodatek(float dodatek) {
		this.dodatek = dodatek;
	}
	public String getDzial() {
		return dzial;
	}
	public void setDzial(String dzial) {
		this.dzial = dzial;
	}


	
	public String wypisz() {
		return "Kierwonik " + dzial + ", Imie: " + imie + ", Nazwisko: " + nazwisko + ", Rok urodzenia: " + rok_urodzenia + ", telefon: " + telefon + ", Pokoj: " + pokoj;
	}

	@Override
	public String toString() {
		return "Kierownik [" + "imie=" + getImie() + ", nazwisko=" + getNazwisko() + "]";
	}
	
	
	
}
