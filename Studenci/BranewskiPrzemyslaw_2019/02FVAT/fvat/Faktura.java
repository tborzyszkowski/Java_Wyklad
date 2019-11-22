package fvat;

import java.util.*;

public class Faktura {

	private Singleton licznikFaktur = Singleton.IncrementAndGetInstance();
	private static final DaneFaktury SPRZEDAJACY = new DaneFaktury();
	
	private ArrayList<PozycjaFaktury> pozycjeFaktury = new ArrayList<>();
	private double wartCalkowitaFaktury;
	private DaneFaktury kupujacy;
	private int numerFaktury;
	private String dataWystawieniaDokumentu;
	private String dataSprzedazy;
	private String dataZaplaty;
	
	
	public Faktura(DaneFaktury kupujacy, String dataWystawieniaDokumentu, String dataSprzedazy, String dataZaplaty)
	{
		setFaktura(kupujacy, dataWystawieniaDokumentu, dataSprzedazy, dataZaplaty);
	}
	
	
	public DaneFaktury getSprzedajacy()
	{
		return SPRZEDAJACY;
	}
	
	public String wszystkiePozycjeFaktury()
	{
		String wynik = "";
		for(int i = 0; i < this.pozycjeFaktury.size(); i++)
			wynik += this.pozycjeFaktury.get(i).toString();
		return wynik;
	}
	
	public void dodajPozycjeFaktury(PozycjaFaktury pozycjaFaktury)
	{
		this.pozycjeFaktury.add(pozycjaFaktury);
		setWartoscCalkowitaFaktury();
	}
	
	public double getWartoscCalkowitaFaktury()
	{
		return this.wartCalkowitaFaktury;
	}
	
	public void setWartoscCalkowitaFaktury()
	{
		double suma = 0.00;
		for(int i = 0; i < this.pozycjeFaktury.size(); i++)
			suma += this.pozycjeFaktury.get(i).getCenaBruttoPozycji();
		this.wartCalkowitaFaktury = suma;
	}
	
	public DaneFaktury getKupujacy()
	{
		return this.kupujacy;
	}
	
	public void setKupujacy(DaneFaktury kupujacy)
	{
		this.kupujacy = new DaneFaktury(kupujacy);
	}
	
	public int getNumerFaktury()
	{
		return this.numerFaktury;
	}
	
	public void setNumerFaktury(int numerFaktury)
	{
		this.numerFaktury = numerFaktury;
	}
	
	public String getDataWystawieniaDokumentu()
	{
		return this.dataWystawieniaDokumentu;
	}
	
	public void setDataWystawieniaDokumentu(String dataWystawieniaDokumentu)
	{
		this.dataWystawieniaDokumentu = dataWystawieniaDokumentu;
	}
	
	public String getDataSprzedazy()
	{
		return this.dataSprzedazy;
	}
	
	public void setDataSprzedazy(String dataSprzedazy)
	{
		this.dataSprzedazy = dataSprzedazy;
	}
	
	public String getDataZaplaty()
	{
		return this.dataZaplaty;
	}
	
	public void setDataZaplaty(String dataZaplaty)
	{
		this.dataZaplaty = dataZaplaty;
	}
	
	public void setFaktura(DaneFaktury kupujacy, String dataWystawieniaDokumentu, String dataSprzedazy, String dataZaplaty)
	{
		setKupujacy(kupujacy);
		setNumerFaktury(licznikFaktur.getLicznikFaktur());
		setDataWystawieniaDokumentu(dataWystawieniaDokumentu);
		setDataSprzedazy(dataSprzedazy);
		setDataZaplaty(dataZaplaty);
	}
}
