public class Produkt
{
    private String kod;
    private String nazwa;
    private double cena;
    private double promoCena;

    public Produkt(String kod,String nazwa,double cena)
    {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.promoCena = cena;
    }

    public String getKod()
    {
        return kod;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    public double getCena()
    {
        return cena;
    }

    public double getPromoCena()
    {
        return promoCena;
    }

    public void setKod(String kod)
    {
        this.kod = kod;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public void setCena(double cena)
    {
        this.cena = cena;
    }

    public void setPromoCena(double promoCena)
    {
        this.promoCena = promoCena;
    }

    @Override
    public String toString()
    {
        return String.format(getNazwa() + " " + getPromoCena() + "zl");
    }
}