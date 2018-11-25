public class Student extends Osoba
{
    private int Indeks;

    public Student(String imię, String nazwisko, int rok, String płeć, int Indeks)
    {
        super(imię, nazwisko, rok, płeć);
        this.Indeks = Indeks;
    }

    public int getIndeks()
    {
        return Indeks;
    }

    public void setIndeks(int indeks)
    {
        Indeks = indeks;
    }

    @Override
    public String toString()
    {
        return "Student:" +
                super.toString() +
                "Indeks= " + Indeks;
    }
}