package systemKadrowy;

public class PracownikUmyslowy extends Pracownik {
	
	private double pensja;
	private double procentPremii;
	Kierownik kierownik;
	private String numerTelefonu;
	private int numerPokoju;
	
	
	public PracownikUmyslowy() {
		super();
	}


	public PracownikUmyslowy(String imie, String nazwisko, int rokUrodzenia, double pensja, double procentPremii,
			Kierownik kierownik, String numerTelefonu, int numerPokoju) {
		super(imie, nazwisko, rokUrodzenia);
		this.pensja = pensja;
		this.procentPremii = procentPremii;
		this.kierownik = kierownik;
		this.numerTelefonu = numerTelefonu;
		this.numerPokoju = numerPokoju;
	}

	public double obliczPensje() {
		return pensja + procentPremii * pensja;
	}

	public double getPensja() {
		return pensja;
	}


	public void setPensja(double pensja) {
		this.pensja = pensja;
	}


	public double getProcentPremii() {
		return procentPremii;
	}


	public void setProcentPremii(double procentPremii) {
		this.procentPremii = procentPremii;
	}


	public Kierownik getKierownik() {
		return kierownik;
	}


	public void setKierownik(Kierownik kierownik) {
		this.kierownik = kierownik;
	}


	public String getNumerTelefonu() {
		return numerTelefonu;
	}


	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}


	public int getNumerPokoju() {
		return numerPokoju;
	}


	public void setNumerPokoju(int numerPokoju) {
		this.numerPokoju = numerPokoju;
	}


	@Override
	public String toString() {
		return "Pracownik Umyslowy [" + super.toString() + ", pensja= " + pensja + ", procentPremii= " + procentPremii + ", kierownik= " + kierownik.getImie() + " " + kierownik.getNazwisko() +
				", numerTelefonu= " + numerTelefonu + ", numerPokoju= " + numerPokoju + ", pensja calkowita= " + obliczPensje() + "]";
	}


}
