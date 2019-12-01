import java.time.*;

public class Wlasciciel
{
	private String imie;
	private String nazwisko;
	private LocalDate dataUrodzenia;

	public Wlasciciel(String imie, String nazwisko, LocalDate dataUrodzenia)
	{
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

	public String getImie()
	{
		return imie;
	}

	public String getNazwisko()
	{
		return nazwisko;
	}

	public LocalDate getDataUrodzenia()
	{
		return dataUrodzenia;
	}

	public void setImie(String imie)
	{
		this.imie = imie;
	}

	public void setNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia)
	{
		this.dataUrodzenia = dataUrodzenia;
	}
}