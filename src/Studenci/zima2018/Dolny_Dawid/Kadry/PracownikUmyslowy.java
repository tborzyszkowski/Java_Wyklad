public class PracownikUmyslowy extends Kierownik{
    private final double PROCENT=0.15;
    private Kierownik przelozony = new Kierownik();


    public PracownikUmyslowy(){}

    public PracownikUmyslowy(String imie, String nazwisko, String rokUrodzenia, double pensja, String numerTel, String numerPokoj, Kierownik przelozony) {
        super(imie, nazwisko, rokUrodzenia, pensja, numerTel, numerPokoj);
        this.przelozony = przelozony;
    }

    void wyplata(){
        double wyp = getPensja()+(PROCENT*getPensja());
        System.out.println("Pracownik zarabia "+wyp+" zł.");
    }

    @Override
    public String toString() {
        return getImie()+" "+getNazwisko()+" "+", urodzony w "+getRokUrodzenia()+" roku. " +
                "pensja=" + getPensja() +
                ", PREMIA=" + PROCENT +
                ", przelozony=" + przelozony.getImie()+" "+przelozony.getNazwisko() +
                ", numerTel='" + getNumerTel() + '\'' +
                ", numerPokoj='" + getNumerPokoj() + '\'' +
                '}';
    }
}
