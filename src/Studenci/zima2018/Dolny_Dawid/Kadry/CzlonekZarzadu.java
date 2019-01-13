public class CzlonekZarzadu extends Person {
    private double pensja;
    private int licznikSpotkan;
    private Praktykant asystent=new Praktykant();

    public CzlonekZarzadu(){}

    public CzlonekZarzadu(String imie, String nazwisko, String rokUrodzenia, double pensja, int licznikSpotkan, Praktykant asystent) {
        super(imie, nazwisko, rokUrodzenia);
        this.pensja = pensja;
        this.licznikSpotkan = licznikSpotkan;
        this.asystent = asystent;
    }

    void wyplata(){
        double wyp=pensja+(licznikSpotkan*500);
        System.out.println("Pracownik zarabia "+wyp+" zł.");
    }

    @Override
    public String toString() {
        return  getImie() +" "+ getNazwisko() + '\'' +
                ", rokUrodzenia='" + getRokUrodzenia() + '\'' +
                ", pensja=" + pensja +
                ", licznikSpotkan=" + licznikSpotkan +
                ", asystent=" + asystent.getImie()+" "+asystent.getNazwisko() +
                '}';
    }
}
