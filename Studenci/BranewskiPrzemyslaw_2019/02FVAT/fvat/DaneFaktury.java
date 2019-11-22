package fvat;

public class DaneFaktury {

	private static final String KONTO = "37 1240 1169 0000 2117 6900 1001";
	
	private String nazwaFirmy;
	private String adresFirmy;
	private String numerNIP;
	
	
	public DaneFaktury(String nazwaFirmy, String adresFirmy, String numerNIP)
	{
		setDaneFaktury(nazwaFirmy, adresFirmy, numerNIP);
	}
	
	public DaneFaktury()
	{
		this("Elektroniker S.A.", "ul. Sikorskiego 73, 61-001 Poznan", "692-06-03-926");
	}
	
	public DaneFaktury(DaneFaktury firma)
	{
		this(firma.nazwaFirmy, firma.adresFirmy, firma.numerNIP);
	}

	
	public String getNazwaFirmy()
	{
		return this.nazwaFirmy;
	}
	
	public void setNazwaFirmy(String nazwaFirmy)
	{
		this.nazwaFirmy = nazwaFirmy;
	}
	
	public String getAdresFirmy()
	{
		return this.adresFirmy;
	}
	
	public void setAdresFirmy(String adresFirmy)
	{
		this.adresFirmy = adresFirmy;
	}
	
	public String getNumerNIP()
	{
		return this.numerNIP;
	}
	
	public void setNumerNIP(String numerNIP)
	{
		this.numerNIP = numerNIP;
	}
	
	public String getKONTO()
	{
		return KONTO;
	}
	
	public void setDaneFaktury(String nazwaFirmy, String adresFirmy, String numerNIP)
	{
		setNazwaFirmy(nazwaFirmy);
		setAdresFirmy(adresFirmy);
		setNumerNIP(numerNIP);
	}
	
	@Override
	public String toString()
	{
		return "\n\t" + getNazwaFirmy() + "\t" + getAdresFirmy() + "\tNIP: " + getNumerNIP();
	}
}