import java.util.*;
import java.time.*;
import org.apache.commons.lang3.*;

public class Konto
{
	private Wlasciciel wlasciciel;
	private String numer;
	private double balans;
	private ArrayList<Transakcja> listaTransakcji;

	public Wlasciciel getWlasciciel()
	{
		return wlasciciel;
	}

	public void setWlasciciel(Wlasciciel wlasciciel)
	{
		this.wlasciciel = wlasciciel;
	}

	public Konto(Wlasciciel wlasciciel, String numer)
	{
		this.wlasciciel = wlasciciel;
		this.numer = numer;
		this.balans = 0;
		if (StringUtils.isNumeric(numer) == false)
		{
			throw new IllegalArgumentException("Nie podano liczby");
		}
		if (String.valueOf(numer).length() != 26)
		{
			throw new IllegalArgumentException("Podano nieprawidlowy numer konta. Prawidlowy numer powinien miec 26 cyfr.");
		}
		this.listaTransakcji = new ArrayList<>();
	}

	public String getNumer()
	{
		return numer;
	}

	public double getBalans()
	{
		return balans;
	}

	public void modBalans(double ilosc)
	{
		this.balans += ilosc;
	}

	public void addTransakcja(Transakcja transakcja)
	{
		this.listaTransakcji.add(transakcja);
	}

	public ArrayList<Transakcja> getTransakcje()
	{
		return listaTransakcji;
	}

	public ArrayList<Transakcja> getTransakcje(LocalDate poczatek, LocalDate koniec)
	{
		ArrayList<Transakcja> lista = new ArrayList<>();
		for(Iterator<Transakcja> iterator = listaTransakcji.iterator(); iterator.hasNext();)
		{
			Transakcja a = iterator.next();
			if(a.getDataTransakcji().compareTo(poczatek)>0 && a.getDataTransakcji().compareTo(koniec)<0)
			{
				lista.add(a);
			}
		}
		return lista;
	}
}