package systemKadrowy;


import java.util.ArrayList;
import java.util.List;

public class PracownikFizyczny extends Pracownik {
	
	private double stawkaGodzinowa;
	private int liczbaGodzin;
	private int liczbaNadgodzin;
	Kierownik kierownik;
	List<Umiejetnosc> umiejetnosci = new ArrayList<Umiejetnosc>();
	
	
	public PracownikFizyczny(String imie, String nazwisko, int rokUrodzenia, double stawkaGodzinowa, int liczbaGodzin,
			int liczbaNadgodzin, Kierownik kierownik, List<Umiejetnosc> umiejetnosci) {
		super(imie, nazwisko, rokUrodzenia);
		this.stawkaGodzinowa = stawkaGodzinowa;
		this.liczbaGodzin = liczbaGodzin;
		this.liczbaNadgodzin = liczbaNadgodzin;
		this.kierownik = kierownik;
		this.umiejetnosci = umiejetnosci;
	}


	public double obliczPensje() {
		return stawkaGodzinowa*liczbaGodzin + 1.5 * stawkaGodzinowa * liczbaNadgodzin;
	}
	
	public double getStawkaGodzinowa() {
		return stawkaGodzinowa;
	}


	public void setStawkaGodzinowa(double stawkaGodzinowa) {
		this.stawkaGodzinowa = stawkaGodzinowa;
	}


	public int getLiczbaGodzin() {
		return liczbaGodzin;
	}


	public void setLiczbaGodzin(int liczbaGodzin) {
		this.liczbaGodzin = liczbaGodzin;
	}


	public int getLiczbaNadgodzin() {
		return liczbaNadgodzin;
	}


	public void setLiczbaNadgodzin(int liczbaNadgodzin) {
		this.liczbaNadgodzin = liczbaNadgodzin;
	}


	public Kierownik getKierownik() {
		return kierownik;
	}


	public void setKierownik(Kierownik kierownik) {
		this.kierownik = kierownik;
	}


	public List<Umiejetnosc> getUmiejetnosci() {
		return umiejetnosci;
	}


	public void setUmiejetnosci(List<Umiejetnosc> umiejetnosci) {
		this.umiejetnosci = umiejetnosci;
	}


	@Override
	public String toString() {
		String toString = "Pracownik Fizyczny [" + super.toString() +", stawka godzinowa=" + stawkaGodzinowa + ", liczba godzin=" + liczbaGodzin
				+ ", liczba nadgodzin=" + liczbaNadgodzin + ", [kierownik=" + kierownik.getImie() + " " + kierownik.getNazwisko() + "], umiejetnosci= ";
		for(Umiejetnosc um : umiejetnosci)
		{
			toString += um.getUmiejetnosc();
			toString += ", ";
		}
		toString += "]";
		return toString;
	}	
	
	
}
