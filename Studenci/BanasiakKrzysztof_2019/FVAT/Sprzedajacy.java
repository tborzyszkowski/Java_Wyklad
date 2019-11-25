package faktura;


public class Sprzedajacy extends Kupujacy {
    private String nr_konta;

    public Sprzedajacy(String imie, String nazwisko,String nazwa_firmy, String adres, String nip, String nr_konta){
        super(imie,nazwisko,nazwa_firmy,adres,nip);
        this.nr_konta = nr_konta;
    }

    public String getNr_konta() {
        return nr_konta;
    }
    void setNr_konta(String nrkonta) {
        this.nr_konta = nrkonta;
    }
    public String toString(){
        return super.toString() + "numer konta: " + nr_konta + "\n";
    }
}
