package FVAT;

public class Klient {
    private String nazwaFirmy;
    private String email;
    private String kodPocztowy;
    private String miasto;
    private String ulica;
    private String numer;
    private int nip;
    private String numerKonta;

    Klient(String nazwa, String email, String kodPocztowy, String miasto, String ulica, String numer, int nip, String numerKonta){
        this.nazwaFirmy = nazwa;
        this.email = email;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numer = numer;
        this.nip = nip;
        this.numerKonta = numerKonta;
    }

    public int getNip() {
        return nip;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public String getNumer() {
        return numer;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public String getUlica() {
        return ulica;
    }

    public String getEmail(){
        return this.email;
    }

    public void wypiszKlienta(){
        System.out.println(this.getNazwaFirmy() + "\n" +
                this.getUlica() + " " + this.getNumer() + "\n" +
                this.getKodPocztowy() + " " + this.getMiasto() + "\n" +
                "NIP: " + this.getNip() + "\n" +
                "Numer konta: " + this.getNumerKonta());
    }

}
