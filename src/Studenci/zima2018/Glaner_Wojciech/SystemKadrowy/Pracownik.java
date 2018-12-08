package systemKadrowy;

public class Pracownik {
	
	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	
	
	
	public Pracownik() {


	}


	public Pracownik(String imie, String nazwisko, int rokUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	
	@Override
	public String toString() {
		return "imie=" + imie + ", nazwisko=" + nazwisko + ", rokUrodzenia=" + rokUrodzenia;
	}

	
}
