package bank;

import java.time.*;

public class Wplata {
	
	private KontoBankowe kontoWplaty;
	private LocalDate dataWplaty;
	private double kwotaWplaty;
	
	
	public Wplata(KontoBankowe kontoWplaty, LocalDate dataWplaty, double kwotaWplaty)
	{
		setAndApplyWplata(kontoWplaty, dataWplaty, kwotaWplaty);
		
	}
	
	public Wplata(Wplata wplata)
	{
		this(wplata.getKontoWplaty(), wplata.getDataWplaty(), wplata.getKwotaWplaty());
	}
	
	
	public KontoBankowe getKontoWplaty()
	{
		return this.kontoWplaty;
	}
	
	public void setKontoWplaty(KontoBankowe kontoWplaty)
	{
		this.kontoWplaty = kontoWplaty;
	}
	
	public LocalDate getDataWplaty()
	{
		return this.dataWplaty;
	}
	
	public void setDataWplaty(LocalDate dataWplaty)
	{
		this.dataWplaty = dataWplaty;
	}
	
	public double getKwotaWplaty()
	{
		return this.kwotaWplaty;
	}
	
	public void setKwotaWplaty(double kwotaWplaty)
	{
		this.kwotaWplaty = kwotaWplaty;
	}
	
	public void setPowiekszKontoOKwote()
	{
		this.kontoWplaty.setSrodki(this.kontoWplaty.getSrodki() + getKwotaWplaty());
	}
	
	public void setAndApplyWplata(KontoBankowe kontoWplaty, LocalDate dataWplaty, double kwotaWplaty)
	{
		setKontoWplaty(kontoWplaty);
		setDataWplaty(dataWplaty);
		setKwotaWplaty(kwotaWplaty);
		setPowiekszKontoOKwote();
	}
	
	@Override
	public String toString()
	{
		return "\n\t-----------------\n\tData wplaty: " +
				getDataWplaty() + ", kwota wplaty: " + getKwotaWplaty() + " PLN";
	}
}
