import java.util.*;

public class Faktura
{
	List<Produkt> lista = new ArrayList<>();
    private int nrFaktury;
	static int prevNrFaktury = 0;
	private String dataWystawienia, dataSprzedazy, dataZaplaty;
    private double cena;
    private Osoba klient, sprzedajacy;

	public Faktura(Osoba kup, Osoba sprz, String dWys, String dSprz, String dZap)
	{
		this.nrFaktury = ++prevNrFaktury;
		this.sprzedajacy = sprz;
		this.klient = kup;
		this.dataWystawienia = dWys;
		this.dataSprzedazy = dSprz;
		this.dataZaplaty = dZap;
	}

	public int getNrFaktury()
	{
		return this.nrFaktury;
	}

	public String getDW()
	{
	    return this.dataWystawienia;
	}

	public String getDS()
	{
	    return this.dataSprzedazy;
	}

	public String getDZ()
	{
	    return this.dataZaplaty;
	}

	public double getCena()
	{
	    return this.cena;
	}

	public Osoba getSprzedajacy()
	{
	    return this.sprzedajacy;
	}

	public Osoba getKlient()
	{
	    return klient;
	}

	public void addProdukt(Produkt produkt)
	{
		lista.add(produkt);
		this.cena += produkt.getSumaBrutto();
	}

    public String printFaktura()
	{

        return "Nr. Faktury: " + nrFaktury + "\nSprzedajacy: " + sprzedajacy.getNazwa() + "\nKlient: " + klient.getNazwa() + "\nData sprzedazy: " + dataSprzedazy + "\nData zaplaty: " + dataZaplaty + "\nData wystawienia: " + dataWystawienia + listFakturaNazwy();
    }

	public String listFakturaNazwy()
	{
		String list = new String();
		for (int i=0; i < lista.size(); i++) {
			list += "\n" + lista.get(i).getNazwaProd();
		}
		return list;
	}
}
