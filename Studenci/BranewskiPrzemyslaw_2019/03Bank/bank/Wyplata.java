package bank;

import java.time.*;

public class Wyplata {

	private KontoBankowe kontoWyplaty;
	private LocalDate dataWyplaty;
	private double kwotaWyplaty;
	private boolean powodzenie;
	
	
	public Wyplata(KontoBankowe kontoWyplaty, LocalDate dataWyplaty, double kwotaWyplaty)
	{
		setAndApplyWyplata(kontoWyplaty, dataWyplaty, kwotaWyplaty);
	}
	
	public Wyplata(Wyplata wyplata)
	{
		this(wyplata.getKontoWyplaty(), wyplata.getDataWyplaty(), wyplata.getKwotaWyplaty());
	}
	
	
	public KontoBankowe getKontoWyplaty()
	{
		return this.kontoWyplaty;
	}
	
	public void setKontoWyplaty(KontoBankowe kontoWyplaty)
	{
		this.kontoWyplaty = kontoWyplaty;
	}
	
	public LocalDate getDataWyplaty()
	{
		return this.dataWyplaty;
	}
	
	public void setDataWyplaty(LocalDate dataWyplaty)
	{
		this.dataWyplaty = dataWyplaty;
	}
	
	public double getKwotaWyplaty()
	{
		return this.kwotaWyplaty;
	}
	
	public void setKwotaWyplaty(double kwotaWyplaty)
	{
		this.kwotaWyplaty = kwotaWyplaty;
	}
	
	public boolean getPowodzenieWyplaty()
	{
		return this.powodzenie;
	}
	
	public void setPowodzenieWyplaty(boolean powodzenie)
	{
		this.powodzenie = powodzenie;
	}
	
	public void setPomniejszKontoOKwote()
	{
		this.kontoWyplaty.setSrodki(this.kontoWyplaty.getSrodki() - getKwotaWyplaty());
	}
	
	public void setAndApplyWyplata(KontoBankowe kontoWyplaty, LocalDate dataWyplaty, double kwotaWyplaty)
	{
		setKontoWyplaty(kontoWyplaty);
		setDataWyplaty(dataWyplaty);
		setKwotaWyplaty(kwotaWyplaty);
		if(this.kontoWyplaty.getSrodki() >= getKwotaWyplaty())
		{
			setPomniejszKontoOKwote();
			setPowodzenieWyplaty(true);
		}
		else
			setPowodzenieWyplaty(false);
	}
	
	@Override
	public String toString()
	{
		if(getPowodzenieWyplaty())
			return "\n\t-----------------\n\tData wyplaty: " +
				getDataWyplaty() + ", kwota wyplaty: " + getKwotaWyplaty() + " PLN";
		else
			return "\n\tOperacja sie nie powiodla";
	}
}
