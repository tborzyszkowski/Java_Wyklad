public class Praktykant extends Person{
    private PracownikUmyslowy opiekun = new PracownikUmyslowy();
    private double stypendium;

    public Praktykant() {
    }

    public Praktykant(String imie, String nazwisko, String rokUrodzenia, PracownikUmyslowy opiekun, double stypendium) {
        super(imie, nazwisko, rokUrodzenia);
        this.opiekun = opiekun;
        this.stypendium = stypendium;
    }

    public PracownikUmyslowy getOpiekun() {
       return opiekun;
    }

    void wyplata() {
        System.out.println("Pracownik otrzymuje " + stypendium + " zł wynagrodzenia.");
    }

    @Override
    public String toString() {
        return getImie() +" "+ getNazwisko() + '\'' +
                ", rokUrodzenia='" + getRokUrodzenia() + '\'' +
                ", opiekun=" + opiekun.getImie()+" "+opiekun.getNazwisko() +
                ", stypendium=" + stypendium +
                '}';
}
}
