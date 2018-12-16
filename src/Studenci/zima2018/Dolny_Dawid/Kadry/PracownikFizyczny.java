public class PracownikFizyczny extends Person {
    private double stawkaGodzinowa;
    private int liczbaGodzin;
    private int liczbaNadgodzin;
    private Kierownik przelozony = new Kierownik();
    private String umiejetnosci;


    public PracownikFizyczny(){}

    public PracownikFizyczny(String imie, String nazwisko, String rokUrodzenia, double stawkaGodzinowa, int liczbaGodzin, int liczbaNadgodzin, Kierownik przelozony, String umiejetnosci) {
        super(imie, nazwisko, rokUrodzenia);
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.liczbaGodzin = liczbaGodzin;
        this.liczbaNadgodzin = liczbaNadgodzin;
        this.przelozony = przelozony;
        this.umiejetnosci = umiejetnosci;
    }

    void wyplata(){
        double pensja =0;
        pensja = (stawkaGodzinowa*liczbaGodzin)+(1.5*stawkaGodzinowa*liczbaNadgodzin);
        System.out.println("Pracownik zarabia "+pensja+" zł.");
    }

    @Override
    public String toString() {
        return getImie()+" "+getNazwisko()+" "+", urodzony w "+getRokUrodzenia()+" roku. "+
                "stawkaGodzinowa=" + stawkaGodzinowa +
                ", liczbaGodzin=" + liczbaGodzin +
                ", liczbaNadgodzin=" + liczbaNadgodzin +
                ", przelozony=" + przelozony.getImie()+" "+przelozony.getNazwisko() +
                ", umiejetnosci='" + umiejetnosci + '\'' +
                '}';
    }
}
