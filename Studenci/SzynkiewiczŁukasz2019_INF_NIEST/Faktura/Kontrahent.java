public class Kontrahent {

    private String nazwa;
    private String adres;
    private String nip;
    private String numerKonta;

    public Kontrahent(String nazwa, String adres, String nip, String numerKonta) {
        this(nazwa, adres, nip);
        this.numerKonta = numerKonta;
    }

    public Kontrahent(String nazwa, String adres, String nip) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.nip = nip;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    @Override
    public String
    toString() {
        if (this.numerKonta != null) {
            String s = "Imię i nazwisko/nazwa firmy: " + nazwa + "\n" +
                    "Adres: " + adres + "\n" +
                    "NIP: " + nip + "\n" +
                    "numer konta: " + numerKonta + "\n";
            return s;
        } else {
            String s = "Imię i nazwisko/nazwa firmy: " + nazwa + "\n" +
                    "Adres: " + adres + "\n" +
                    "NIP: " + nip + "\n";
            return s;
        }
    }
}
