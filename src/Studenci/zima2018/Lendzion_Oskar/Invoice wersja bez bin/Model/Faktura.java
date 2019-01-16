package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class Faktura {

	private double wartoscBrutto;
	private static int numer = 0000000;
	private int nrFaktury;
	private Dane mojaFirma = new Dane();
	private Dane kontrahent;
	private DateFormat dataWysFaktury = new SimpleDateFormat("dd MMMM yyyy");
	private java.util.Date date = new java.util.Date();
	
	
	List<Pozycja> Pozycje = new ArrayList<>();
	
	
	
	public Faktura() {
		numer += 1;
		this.nrFaktury = numer;
	}
	

	


	public Dane getKontrahent() {
		return kontrahent;
	}



	public void setKontrahent(Dane kontrahent) {
		this.kontrahent = kontrahent;
	}





	public Faktura dodajPozycje(Pozycja p) {
		Pozycje.add(p);
		wartoscBrutto += p.getSumbrutto();
		return this;
	}
	
	
	public Faktura usunPozycje(Pozycja p) {
		Pozycje.remove(p);
		wartoscBrutto -= p.getSumbrutto();
		return this;
	}
	



	public int getNrFaktury() {
		return nrFaktury;
	}


	public List<Pozycja> ilosc(String nazwa, int ilosc) {
		for (int i = 0; i< Pozycje.size() ; i++)
		{
			if (Pozycje.get(i).getNazwa() == nazwa)
			{
				Pozycje.get(i).setSzt(ilosc);
			}
		}
		return Pozycje;
	}


	public double getWartoscBrutto() {
		return wartoscBrutto;
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pozycje == null) ? 0 : Pozycje.hashCode());
		result = prime * result + nrFaktury;
		long temp;
		temp = Double.doubleToLongBits(wartoscBrutto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faktura other = (Faktura) obj;
		if (Pozycje == null) {
			if (other.Pozycje != null)
				return false;
		} else if (!Pozycje.equals(other.Pozycje))
			return false;
		if (nrFaktury != other.nrFaktury)
			return false;
		if (Double.doubleToLongBits(wartoscBrutto) != Double.doubleToLongBits(other.wartoscBrutto))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return  "Faktura nr: " + nrFaktury + "\n" + "Data wystawienia faktury: " + dataWysFaktury.format(date) + "\n" + "Sprzedawca: " + mojaFirma + "\n" + "Kupujacy: " + kontrahent + "\n" + Pozycje + "\nWartosc brutto: " + wartoscBrutto + "\n";
	}


	





	


}
