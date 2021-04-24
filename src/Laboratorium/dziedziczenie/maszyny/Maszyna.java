package Laboratorium.dziedziczenie.maszyny;

public abstract class Maszyna {
	protected String marka;
	protected String nazwa;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public void wyswietl(){
		System.out.println("" + this);
	}
}
