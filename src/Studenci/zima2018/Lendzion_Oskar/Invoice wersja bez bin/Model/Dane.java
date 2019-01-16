package Model;

public class Dane {
	
	private String nazwa;
	private Adres adres;
	private String nip;
	private String bank;
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public Dane(String nazwa, Adres adres, String nip) {
		super();
		this.nazwa = nazwa;
		this.adres = adres;
		this.nip = nip;
	}
	
	public Dane() {
		super();
		this.nazwa = "Moja firma";
		this.adres = new Adres();
		this.nip = "957-055-93-70";
		this.bank = "42 1456 3256 0000 0002 4342 4562";
	}
	@Override
	public String toString() {
		return "Dane [nazwa=" + nazwa + ", adres=" + adres + ", nip=" + nip + ", bank=" + bank + "]";
	}
	
	
	
	

}
