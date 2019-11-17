package Zamówienie;
import Osoba.Klient;
import Osoba.Sprzedajacy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transakcja {

    private Sprzedajacy sprzedajacy;
    private Klient klient;
    private Faktura faktura;
    private Date dataZapłaty;
    private Date dataSprzedaży;

    public Transakcja(Sprzedajacy sprzedajacy, Klient klient, Faktura faktura, Date dataZapłaty, Date dataSprzedaży) {
        this.sprzedajacy = sprzedajacy;
        this.klient =  klient;
        this.faktura = faktura;
        this.dataZapłaty = dataZapłaty;
        this.dataSprzedaży = dataSprzedaży;
    }

    public void wypiszDaneTransakcji() {
        sprzedajacy.wypiszDaneSprzedającego();
        klient.wypiszDaneKlienta();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm");
        System.out.println("Data zapłaty: ");
        System.out.println(formatter.format(dataZapłaty));
        System.out.println("Data sprzedaży: ");
        System.out.println(formatter.format(dataSprzedaży) + "\n");
        faktura.wypiszDaneFaktury();
    }
}
