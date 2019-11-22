public class Osoba
{
    private String nazwa, adres, konto, NIP;

    public Osoba(String nazwa, String adres, String NIP, String konto)
	{
        this.nazwa = nazwa;
        this.adres = adres;
        this.NIP = NIP;
        this.konto = konto;
    }

	public String getAdres()
	{
        return this.adres;
	}

	public String getNIP()
	{
		return this.NIP;
	}

	public String getNazwa()
	{
        return this.nazwa;
	}

	public String getKonto()
	{
		return this.konto;
	}
}
