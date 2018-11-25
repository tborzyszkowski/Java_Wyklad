public class Stypendysta extends Student
{
    private int Stypendium;

    public Stypendysta(String imię, String nazwisko, int rok, String płeć, int Indeks, int stypendium)
    {
        super(imię, nazwisko, rok, płeć, Indeks);
        this.Stypendium = stypendium;
    }

    public int getStypendium()
    {
        return Stypendium;
    }

    public void setStypendium(int stypendium)
    {
        this.Stypendium = stypendium;
    }

    @Override
    public String toString()
    {
        return "Stypendysta " +
                super.toString() +
                "Stypendium= " + Stypendium;
    }
}
