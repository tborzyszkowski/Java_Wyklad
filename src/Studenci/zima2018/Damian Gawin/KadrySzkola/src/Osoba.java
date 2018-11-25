public class Osoba
{
    private String Imię;
    private String Nazwisko;
    private int rok;
    private String Płeć;

    public Osoba(String imię, String nazwisko, int rok, String płeć)
    {
        this.Imię = imię;
        this.Nazwisko = nazwisko;
        this.rok = rok;
        this.Płeć = płeć;
    }

    public String getImię()
    {
        return Imię;
    }

    public void setImię(String imię)
    {
        Imię = imię;
    }

    public String getNazwisko()
    {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        Nazwisko = nazwisko;
    }

    public int getRok()
    {
        return rok;
    }

    public void setRok(int rok)
    {
        this.rok = rok;
    }

    public String getPłeć()
    {
        return Płeć;
    }

    public void setPłeć(String płeć)
    {
        Płeć = płeć;
    }

    @Override
    public String toString()
    {
        return " Imię= " + Imię +
                ", Nazwisko= " + Nazwisko +
                ", rok= " + rok +
                ", Płeć= " + Płeć;
    }
}

