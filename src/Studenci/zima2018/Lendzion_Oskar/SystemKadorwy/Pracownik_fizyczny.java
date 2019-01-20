
public class Pracownik_fizyczny extends pracownik{

	private float stawka_godzinowa;
	private float ilosc_godzin;
	private float ilosc_nadgodzin;
	private Kierownik kierownik;
	private String umiejetnosci;

	
	public Pracownik_fizyczny() {
		super();
		this.stawka_godzinowa = 0;
		this.ilosc_godzin = 0;
		this.ilosc_nadgodzin = 0;
		this.umiejetnosci = "brak";
		this.pensja = stawka_godzinowa * ilosc_godzin + 1.5 * stawka_godzinowa * ilosc_nadgodzin;
	}

	public Pracownik_fizyczny(String imie, String nazwisko, int rok_urodzenia, float stawka_godzinowa, float ilosc_godzin, float ilosc_nadgodzin, Kierownik kierownik,
			String umiejetnosci) {
		super(imie, nazwisko, rok_urodzenia);
		this.stawka_godzinowa = stawka_godzinowa;
		this.ilosc_godzin = ilosc_godzin;
		this.ilosc_nadgodzin = ilosc_nadgodzin;
		this.kierownik = kierownik;
		this.umiejetnosci = umiejetnosci;
		this.pensja = stawka_godzinowa * ilosc_godzin + 1.5 * stawka_godzinowa * ilosc_nadgodzin;
	}

	@Override
	public String toString() {
		return "Pracownik_fizyczny [imie=" + getImie() + ", nazwisko=" + getNazwisko() + ", rok urodzenia=" + getRok_urodzenia() + ", " + kierownik + ", umiejetnosci=" + umiejetnosci+ "]";
	}
	
	
	
	
	
	
	
}
