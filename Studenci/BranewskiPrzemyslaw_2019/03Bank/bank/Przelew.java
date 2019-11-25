package bank;

import java.time.*;

public class Przelew {
	
	private LocalDate dataOperacji;
	private KontoBankowe nadawca;
	private KontoBankowe odbiorca;
	private Wyplata obciazenieNadawcy;
	private Wplata zaplataOdbiorcy;
	private double kwotaOperacji;
	private boolean powodzenieOperacji;
	
	
	public Przelew(LocalDate dataOperacji, KontoBankowe nadawca, KontoBankowe odbiorca, double kwotaOperacji)
	{
		setPrzelew(dataOperacji, nadawca, odbiorca, kwotaOperacji);
	}
	
	
	public LocalDate getDataOperacji()
	{
		return this.dataOperacji;
	}
	
	public void setDataOperacji(LocalDate dataOperacji)
	{
		this.dataOperacji = dataOperacji;
	}
	
	public KontoBankowe getNadawca()
	{
		return this.nadawca;
	}
	
	public void setNadawca(KontoBankowe nadawca)
	{
		this.nadawca = nadawca;
	}
	
	public KontoBankowe getOdbiorca()
	{
		return this.odbiorca;
	}
	
	public void setOdbiorca(KontoBankowe odbiorca)
	{
		this.odbiorca = odbiorca;
	}
	
	public Wyplata getObciazenieNadawcy()
	{
		return this.obciazenieNadawcy;
	}
	
	public void setObciazenieNadawcy(KontoBankowe nadawca, LocalDate dataOperacji, double kwotaOperacji)
	{
		this.obciazenieNadawcy = new Wyplata(nadawca, dataOperacji, kwotaOperacji);
	}
	
	public Wplata getZaplataOdbiorcy()
	{
		return this.zaplataOdbiorcy;
	}
	
	public void setZaplataOdbiorcy(KontoBankowe odbiorca, LocalDate dataOperacji, double kwotaOperacji)
	{
		this.zaplataOdbiorcy = new Wplata(odbiorca, dataOperacji, kwotaOperacji);
	}
	
	public double getKwotaOperacji()
	{
		return this.kwotaOperacji;
	}
	
	public void setKwotaOperacji(double kwotaOperacji)
	{
		this.kwotaOperacji = kwotaOperacji;
	}
	
	public boolean getPowodzenieOperacji()
	{
		return this.powodzenieOperacji;
	}
	
	public void setPowodzenieOperacji(boolean powodzenieOperacji)
	{
		this.powodzenieOperacji = powodzenieOperacji;
	}
	
	public void setPrzelew(LocalDate dataOperacji, KontoBankowe nadawca, KontoBankowe odbiorca, double kwotaOperacji)
	{
		setDataOperacji(dataOperacji);
		setKwotaOperacji(kwotaOperacji);
		setNadawca(nadawca);
		setOdbiorca(odbiorca);
		setObciazenieNadawcy(nadawca, dataOperacji, kwotaOperacji);
		if(this.getObciazenieNadawcy().getPowodzenieWyplaty())
		{
			setZaplataOdbiorcy(odbiorca, dataOperacji, kwotaOperacji);
			setPowodzenieOperacji(true);
		}
		else
		{
			setPowodzenieOperacji(false);
		}
	}
	
	public String toString()
	{
		if(getPowodzenieOperacji())
			return "\n\t------------\n\tNadawca:\n\n\t" + getNadawca().getNumerKonta() +
				   "\n\n\tOdbiorca:\n\n\t" + getOdbiorca().getNumerKonta() +
				   "\n\n\tData operacji: " + getDataOperacji() + ", kwota " 
				   + getKwotaOperacji() + " PLN";
		else
			return "\n\tOperacja sie nie powiodla";
	}
}