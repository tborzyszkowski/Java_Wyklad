public class Przelew {

    private Konto konto1;
    private Konto konto2;
    private int kwota;

    public Przelew(Konto konto1, Konto konto2, int kwota) {
        this.konto1 = konto1;
        this.konto2 = konto2;
        this.kwota = kwota;
        wykonajPrzelew();
    }

    public void wykonajPrzelew() {
        konto1.wykonajPrzelewWychodzący(kwota, konto2.getNumerKonta());
        konto2.wykonajPrzelewPrzychodzący(kwota, konto1.getNumerKonta());
    }
}
