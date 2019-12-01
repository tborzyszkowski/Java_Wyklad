public class Przelew {

    private Konto konto1;
    private Konto konto2;
    private int kwota;

    public Przelew(Konto konto1, Konto konto2, int kwota) throws InterruptedException {
        this.konto1 = konto1;
        this.konto2 = konto2;
        this.kwota = kwota;
        wykonajPrzelew();
    }

    public Konto getKonto1() {
        return konto1;
    }

    public Konto getKonto2() {
        return konto2;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKonto1(Konto konto1) {
        this.konto1 = konto1;
    }

    public void setKonto2(Konto konto2) {
        this.konto2 = konto2;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public void wykonajPrzelew() throws InterruptedException {
        konto1.wykonajPrzelewWychodzący(kwota, konto2.getNumerKonta());
        konto2.wykonajPrzelewPrzychodzący(kwota, konto1.getNumerKonta());
    }
}
