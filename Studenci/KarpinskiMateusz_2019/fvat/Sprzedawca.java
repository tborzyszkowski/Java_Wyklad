package fvat;

public class Sprzedawca extends Klient {
    private String nrKonta;

    public Sprzedawca(String nazwa, String adres, String nip, String nrKonta){
        super(nazwa, adres, nip);
        this.nrKonta = nrKonta;
    }

    public String getNrKonta() { return nrKonta; }

    @Override
    public String toString(){
        return super.toString() + "Numer konta: " + nrKonta + '\n';
    }
}
