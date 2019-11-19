package fvat;

public class PozycjaFaktury {

	private String nazwaProduktu;
	private int iloscZamowionegoTowaru;
	private double cenaJednostkowaNetto;
	private int podatekVAT;
	private double cenaNettoPozycji;
	private double cenaBruttoPozycji;
	
	
	public PozycjaFaktury(String nazwaProduktu, int iloscZamowionegoTowaru, double cenaJednostkowaNetto, int podatekVAT)
	{
		setPozycjaFaktury(nazwaProduktu, iloscZamowionegoTowaru, cenaJednostkowaNetto, podatekVAT);
	}
	
	
	public String getNazwaProduktu()
	{
		return this.nazwaProduktu;
	}
	
	public void setNazwaProduktu(String nazwaProduktu)
	{
		this.nazwaProduktu = nazwaProduktu;
	}
	
	public int getIloscZamowionegoTowaru()
	{
		return this.iloscZamowionegoTowaru;
	}
	
	public void setIloscZamowionegoTowaru(int iloscZamowionegoTowaru)
	{
		this.iloscZamowionegoTowaru = iloscZamowionegoTowaru;
	}
	
	public double getCenaJednostkowaNetto()
	{
		return this.cenaJednostkowaNetto;
	}
	
	public void setCenaJednostkowaNetto(double cenaJednostkowaNetto)
	{
		this.cenaJednostkowaNetto = cenaJednostkowaNetto;
	}
	
	public int getPodatekVAT()
	{
		return this.podatekVAT;
	}
	
	public void setPodatekVAT(int podatekVAT)
	{
		this.podatekVAT = podatekVAT;
	}
	
	public double getCenaNettoPozycji()
	{
		return this.cenaNettoPozycji;
	}
	
	public void setCenaNettoPozycji(int iloscZamowionegoTowaru, double cenaJednostkowaNetto)
	{
		this.cenaNettoPozycji = iloscZamowionegoTowaru * cenaJednostkowaNetto;
	}
	
	public double getCenaBruttoPozycji()
	{
		return this.cenaBruttoPozycji;
	}
	
	public void setCenaBruttoPozycji(double cenaNettoPozycji, int podatekVAT)
	{
		this.cenaBruttoPozycji = cenaNettoPozycji + cenaNettoPozycji * podatekVAT / 100.00;
	}
	
	public void setPozycjaFaktury(String nazwaProduktu, int iloscZamowionegoTowaru, double cenaJednostkowaNetto, int podatekVAT)
	{
		setNazwaProduktu(nazwaProduktu);
		setIloscZamowionegoTowaru(iloscZamowionegoTowaru);
		setCenaJednostkowaNetto(cenaJednostkowaNetto);
		setPodatekVAT(podatekVAT);
		setCenaNettoPozycji(getIloscZamowionegoTowaru(), getCenaJednostkowaNetto());
		setCenaBruttoPozycji(getCenaNettoPozycji(), getPodatekVAT());
	}
	
	@Override
	public String toString()
	{
		return "\n\t" + getNazwaProduktu() + ": " + getIloscZamowionegoTowaru() + " * " +
				getCenaJednostkowaNetto() + " = " + getCenaNettoPozycji() + 
				" || + " + getPodatekVAT() + "% = " + String.format("%.2f", getCenaBruttoPozycji());
				
	}
}
