package systemKadrowy;

public class CzlonekZarzadu extends Pracownik {
	
	private double pensja;
	PracownikUmyslowy asystent;
	private int iloscPosiedzen;
	
	public CzlonekZarzadu(String imie, String nazwisko, int rokUrodzenia, double pensja, PracownikUmyslowy asystent,
			int iloscPosiedzen) {
		super(imie, nazwisko, rokUrodzenia);
		this.pensja = pensja;
		this.asystent = asystent;
		this.iloscPosiedzen = iloscPosiedzen;
	}

	public double obliczPensje() {
		return pensja + iloscPosiedzen * 150;
	}
	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	public PracownikUmyslowy getAsystent() {
		return asystent;
	}

	public void setAsystent(PracownikUmyslowy asystent) {
		this.asystent = asystent;
	}

	public int getIloscPosiedzen() {
		return iloscPosiedzen;
	}

	public void setIloscPosiedzen(int iloscPosiedzen) {
		this.iloscPosiedzen = iloscPosiedzen;
	}

	@Override
	public String toString() {
		return "Czlonek zarzadu ["+ super.toString() + ", pensja=" + pensja + ", asystent= " + asystent.getImie() + " " + asystent.getNazwisko() + ", iloscPosiedzen=" + iloscPosiedzen
				+ ", pensja calkowita= " + obliczPensje() + "]";
	}
	
	

}
