public class Produkt
{
    private String nazwa;
    private double cenaNetto,sumaNetto,VAT,sumaBrutto;
    private int ilosc;

    public Produkt(String nazwa, int ilosc, double cenaNetto, double VAT)
    {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cenaNetto = cenaNetto;
        this.sumaNetto = ilosc * cenaNetto;
        this.VAT = VAT;
        this.sumaBrutto = sumaNetto * (1.0+VAT);
    }

    String getNazwaProd()
    {
        return this.nazwa;
    }

    int getIlosc()
    {
        return this.ilosc;
    }

    double getCenaNetto()
    {
        return this.cenaNetto;
    }

    double getSumaNetto()
    {
        return this.sumaNetto;
    }

    double getVAT()
    {
        return VAT;
    }

    double getSumaBrutto()
    {
        return sumaBrutto;
    }

	public String printProdukt()
    {
        return nazwa + " szt. " + ilosc + " " + String.format("%.2f", sumaBrutto) + "\n";
    }
}
