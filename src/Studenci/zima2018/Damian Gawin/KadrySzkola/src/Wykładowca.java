public class Wykładowca extends Osoba
{
    private String Tytuł;

    public Wykładowca(String imię, String nazwisko, int rok, String płeć, String tytuł)
    {
        super(imię, nazwisko, rok, płeć);
        this.Tytuł = tytuł;
    }

    public String getTytuł()
    {
        return Tytuł;
    }

    public void setTytuł(String tytuł)
    {
        this.Tytuł = tytuł;
    }

    @Override
    public String toString()
    {
        return "Wykładowca: " +
                "Tytuł= " + Tytuł + ',' +
                super.toString();
    }
}
