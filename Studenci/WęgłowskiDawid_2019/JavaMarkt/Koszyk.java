import java.util.*;

public class Koszyk
{
    private ArrayList<Produkt> listaProduktow;
    private double suma;
    private double promoSuma;
    private Produkt kubekFirmowy = new Produkt("000000","Kubek Firmowy",0.00);
    public Koszyk()
    {
        this.listaProduktow = new ArrayList<>();
        this.suma=0;
        this.promoSuma=0;
    }
    public double getSuma()
    {
        return suma;
    }
    public double getPromoSuma()
    {
        return promoSuma;
    }
    public ArrayList<Produkt> getListaProduktow()
    {
        return listaProduktow;
    }
    public void sort()
    {
        this.listaProduktow.sort(Comparator.comparing(Produkt::getNazwa));
        Collections.reverse(listaProduktow);
        this.listaProduktow.sort(Comparator.comparing(Produkt::getCena));
        Collections.reverse(listaProduktow);
    }
    public Produkt getCenaMax()
    {
        sort();
        return this.listaProduktow.get(0);
    }
    public Produkt getCenaMin()
    {
        sort();
        return this.listaProduktow.get(listaProduktow.size()-1);
    }
    public ArrayList<Produkt> getCenaMax(int n)
    {
        sort();
        listaProduktow = getListaProduktow();
        ArrayList<Produkt> listaMax = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            listaMax.add(listaProduktow.get(i));
        }
        return listaMax;
    }
    public ArrayList<Produkt> getCenaMin(int n)
    {
        sort();
        listaProduktow = getListaProduktow();
        ArrayList<Produkt> listaMin = new ArrayList<>();
        for (int i=listaProduktow.size()-1; i>=listaProduktow.size()-n; i--)
        {
            listaMin.add(listaProduktow.get(i));
        }
        return listaMin;
    }
    public void addProdukt(Produkt produkt)
    {
        this.listaProduktow.add(produkt);
    }
    public void sumCena()
    {
        listaProduktow = getListaProduktow();
        for (Produkt produkt : listaProduktow)
        {
            suma += produkt.getCena();
        }
    }
    public void sumPromoCena()
    {
        listaProduktow = getListaProduktow();
        for (Produkt produkt : listaProduktow)
            promoSuma += produkt.getPromoCena();
    }
    public void koniec(Produkt promoProdukt)
    {
        koniecPrep();
        for (Produkt produkt : listaProduktow)
        {
            if (produkt.getNazwa().equals(promoProdukt.getNazwa()))
            {
                produkt.setPromoCena(produkt.getPromoCena()*0.70);
            }
        }
    }
    public void koniec()
    {
        koniecPrep();
    }

    private void koniecPrep() {
        if (suma>300)
        {
            for (Produkt produkt : listaProduktow)
            {
                produkt.setPromoCena(produkt.getCena()*0.95);
            }
        }
        if (listaProduktow.size()>=3)
        {
            listaProduktow.get(listaProduktow.size()-1).setPromoCena(0.00);
        }
        if (suma>200)
        {
            listaProduktow.add(kubekFirmowy);
        }
    }
}