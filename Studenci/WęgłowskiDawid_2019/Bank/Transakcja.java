import java.time.*;

public class Transakcja
{
	private Konto nadawca;
	private Konto odbiorca;
	private double ilosc;
	private int nrTransakcji;
	private static int nrTransakcjiGlobal = 0;
	private LocalDate dataTransakcji;

	public Transakcja(Konto nadawca, Konto odbiorca, double ilosc)
	{
		this.nadawca = nadawca;
		this.odbiorca = odbiorca;
		this.ilosc = ilosc;
		this.dataTransakcji = LocalDate.now();
		nrTransakcjiGlobal++;
		this.nrTransakcji = nrTransakcjiGlobal;
		nadawca.addTransakcja(this);
		odbiorca.addTransakcja(this);
	}

	public Konto getNadawca()
	{
		return nadawca;
	}

	public Konto getOdbiorca()
	{
		return odbiorca;
	}

	public double getIlosc()
	{
		return ilosc;
	}

	public int getNrTransakcji()
	{
		return nrTransakcji;
	}

	public LocalDate getDataTransakcji()
	{
		return dataTransakcji;
	}

	public void setDataTransakcji(LocalDate dataTransakcji)
	{
		this.dataTransakcji = dataTransakcji;
	}
}