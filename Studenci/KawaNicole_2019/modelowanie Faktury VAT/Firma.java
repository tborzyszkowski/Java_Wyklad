@SuppressWarnings("Dostep")
public class Firma {
    private String nazwaFirmy;
    private Adres adres;
    private String nip;
    private String nrRachunkuBankowego;

    Firma() {
    }

    public Firma(String nazwaFirmy, String nip, String nrRachunkuBankowego) {
        this();
        this.nazwaFirmy = nazwaFirmy;
        this.nip = nip;
        this.nrRachunkuBankowego = nrRachunkuBankowego;
    }

    public Firma dodajAdres(Adres Adres) {
        this.Adres = adres;
        return this;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nazwaFirmy='" + nazwaFirmy + '\'' +
                ", \n\t\t\t\tadres=" + adres +
                ", \n\t\t\t\tnip='" + nip + '\'' +
                ", nrRachunkuBankowego='" + nrRachunkuBankowego + '\'' +
                '}';
    }
}
