
public class pracownik {
	
	protected String imie;
	protected String nazwisko;
	protected int rok_urodzenia;
	public double pensja;
	
	
	public pracownik() {
		imie = "";
		nazwisko = "sukces";
		rok_urodzenia = 0;
				
				
				
	}
	
	
	public pracownik(String imie, String nazwisko, int rok_urodzenia) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok_urodzenia = rok_urodzenia;
	}
	
	
	public double getPensja() {
		return pensja;
	}


	public void setPensja(double pensja) {
		this.pensja = pensja;
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
	public int getRok_urodzenia() {
		return rok_urodzenia;
	}
	public void setRok_urodzenia(int rok_urodzenia) {
		this.rok_urodzenia = rok_urodzenia;
	}
	
	public String pensja() {
		return imie + " " + nazwisko + " zarabia " + pensja + " miesiêcznie.";
	}


	/*@Override
	public String toString() {
		return "pracownik [imie=" + imie + ", nazwisko=" + nazwisko + ", rok_urodzenia=" + rok_urodzenia + ", pensja="
				+ pensja + "]";
	}
	
	*/
	
	
	
	

}
