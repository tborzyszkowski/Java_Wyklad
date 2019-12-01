package bank;

public class KontoBankowe {
	
	private double srodki;
	private String numerKonta;
	private String imie;
	private String nazwisko;
	private String adres;
	private String pesel;
	
	
	public KontoBankowe(double srodki, String numerKonta, String imie,
				String nazwisko, String adres, String pesel)
	{
		setKonto(srodki, numerKonta, imie, nazwisko, adres, pesel);
	}
	
	public KontoBankowe(KontoBankowe konto)
	{
		this(konto.getSrodki(), konto.getNumerKonta(), konto.getImie(),
			 konto.getNazwisko(), konto.getAdres(), konto.getPesel());
	}
	
	
	public double getSrodki()
	{
		return this.srodki;
	}
	
	public void setSrodki(double srodki)
	{
		this.srodki = srodki;
	}
	
	public String getNumerKonta()
	{
		return this.numerKonta;
	}
	
	public void setNumerKonta(String numerKonta)
	{
		this.numerKonta = numerKonta;
	}
	
	public String getImie()
	{
		return this.imie;
	}
	
	public void setImie(String imie)
	{
		this.imie = imie;
	}
	
	public String getNazwisko()
	{
		return this.nazwisko;
	}
	
	public void setNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}
	
	public String getAdres()
	{
		return this.adres;
	}
	
	public void setAdres(String adres)
	{
		this.adres = adres;
	}
	
	public String getPesel()
	{
		return this.pesel;
	}
	
	public void setPesel(String pesel)
	{
		this.pesel = pesel;
	}
	
	public void setKonto(double srodki, String... strings)
	{
		setSrodki(srodki);
		setNumerKonta(strings[0]);
		setImie(strings[1]);
		setNazwisko(strings[2]);
		setAdres(strings[3]);
		setPesel(strings[4]);
	}
	
	@Override
	public String toString()
	{
		return "\n\tRachunek otwarto na " + getImie() + " " + getNazwisko() + 
			"\n\tZamieszkala/y: " + getAdres() + "\n\tnr konta: " + getNumerKonta() +
			"\n\twolne srodki: " + getSrodki();
	}
}
