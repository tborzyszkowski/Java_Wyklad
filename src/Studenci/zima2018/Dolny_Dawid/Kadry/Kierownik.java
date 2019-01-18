public class Kierownik extends Person{
    private double pensja;
    private final double PROCENT= 0.25;
    private final double DODATEK=300;
    private String numerTel;
    private String numerKom;
    private String numerPokoj;
    private String dzial;

    public Kierownik(){}

    public Kierownik(String imie, String nazwisko, String rokUrodzenia, double pensja, String numerTel, String numerPokoj) {
        super(imie, nazwisko, rokUrodzenia);
        this.pensja = pensja;
        this.numerTel = numerTel;
        this.numerPokoj = numerPokoj;
    }

    public Kierownik(String imie, String nazwisko, String rokUrodzenia, double pensja, String numerTel, String numerKom, String numerPokoj, String dzial) {
        super(imie, nazwisko, rokUrodzenia);
        this.pensja = pensja;
        this.numerTel = numerTel;
        this.numerKom = numerKom;
        this.numerPokoj = numerPokoj;
        this.dzial = dzial;
    }

    public double getPensja() {
        return pensja;
    }

    public String getNumerTel() {
        return numerTel;
    }

    public String getNumerPokoj() {
        return numerPokoj;
    }

    void wyplata(){
        double wyp=getPensja()+(PROCENT*getPensja())+DODATEK;
        System.out.println("Pracownik zarabia "+wyp+" zł.");
    }

    @Override
    public String toString() {
        return getImie()+" "+getNazwisko()+", urodzony w "+getRokUrodzenia()+" "+
                "pensja=" + getPensja() +
                ", PROCENT=" + PROCENT +
                ", DODATEK=" + DODATEK +
                ", numerTel='" + numerTel + '\'' +
                ", numerKom='" + numerKom + '\'' +
                ", numerPokoj='" + numerPokoj + '\'' +
                ", dzial='" + dzial + '\'' +
                '}';
    }
}
