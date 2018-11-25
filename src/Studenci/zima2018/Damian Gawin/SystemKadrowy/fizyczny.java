package SystemKadrowy;

public class fizyczny extends pracownik {
    private int stawka;
    private int liczbagodzin;
    private int liczbanadgodz;
    private String kierownik;
    private String skills;

    fizyczny(String imie, String nazwisko, int dataur, int stawka, int liczbagodzin, int liczbanadgodz, String kierownik, String skills)
    {
        super(imie, nazwisko, dataur);
        this.stawka = stawka;
        this.liczbagodzin = liczbagodzin;
        this.liczbanadgodz = liczbanadgodz;
        this.kierownik = kierownik;
        this.skills = skills;
    }

    public int getStawka() {
        return stawka;
    }

    public void setStawka(int stawka) {
        this.stawka = stawka;
    }

    public int getLiczbagodzin() {
        return liczbagodzin;
    }

    public void setLiczbagodzin(int liczbagodzin) {
        this.liczbagodzin = liczbagodzin;
    }

    public int getLiczbanadgodz() {
        return liczbanadgodz;
    }

    public void setLiczbanadgodz(int liczbanadgodz) {
        this.liczbanadgodz = liczbanadgodz;
    }

    public String getKierownik() {
        return kierownik;
    }

    public void setKierownik(String kierownik) {
        this.kierownik = kierownik;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    String opis()
    {
        return  super.nazwa() +
                "\n"+"\t"+"Pracownik Fizyczny: " +
                "stawka= " + stawka +
                ", liczbagodzin= " + liczbagodzin +
                ", liczbanadgodz= " + liczbanadgodz +
                ", kierownik= '" + kierownik + '\'' +
                ", skills= '" + skills + '\'' +
                ".\n";
    }

    public double wynagrodzenie()
    {
        return (stawka * liczbagodzin) + (1.5 * stawka * liczbanadgodz);
    }
}
