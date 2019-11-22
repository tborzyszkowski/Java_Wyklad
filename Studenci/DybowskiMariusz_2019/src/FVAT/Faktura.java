package FVAT;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Faktura {
    static private int licznikFaktur = 0;
    private int numerFaktury;
    private Klient nabywca;
    private List<Pozycja> pozycje = new LinkedList<Pozycja>();
    private double wartosc = 0.0;
    private LocalDate dataWystawienia;
    private LocalDate dataSprzedazy;
    private LocalDate dataZaplaty;


    Faktura(Klient klient) {
        this.nabywca = klient;
        this.numerFaktury = ++licznikFaktur;
        this.dataWystawienia = LocalDate.now();
        this.dataSprzedazy = LocalDate.now();
        this.dataZaplaty = LocalDate.now().plusDays(14);
    }

    public void addPozycje(Pozycja poz) {
        this.pozycje.add(poz);
        this.setWartosc(this.getWartosc() + poz.getBrutto());

    }

    public int dlugosc() {
        //zwraca ilosc pozycji faktury
        return pozycje.size();
    }

    public Pozycja getPozycja(int i) {
        return pozycje.get(i);
    }

    public static int getLicznikFaktur() {
        return licznikFaktur;
    }

    public Klient getNabywca() {
        return nabywca;
    }

    public double getWartosc() {
        return this.wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public int getNumerFaktury() {
        return numerFaktury;
    }

    public LocalDate getDataWystawienia() {
        return this.dataWystawienia;
    }

    public LocalDate getDataSprzedazy() {
        return dataSprzedazy;
    }

    public void setDataSprzedazy(LocalDate dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public LocalDate getDataZaplaty() {
        return dataZaplaty;
    }

    public void setDataZaplaty(LocalDate dataZaplaty) {
        this.dataZaplaty = dataZaplaty;
    }

    public void drukujFakture(){

        System.out.println("Numer faktury: " + this.getNumerFaktury());
        System.out.println("Data wystawienia: " + this.getDataWystawienia().toString());
        System.out.println("Data sprzedazy: " + this.getDataSprzedazy().toString());
        System.out.println("\nNabywca:");
        this.getNabywca().wypiszKlienta();

        for (int i = 0; i < this.dlugosc(); i++){
            System.out.print((i + 1) + " | ");
            pozycje.get(i).wypiszPozycje();
        }

        System.out.println("Do zapłaty: " + String.format("%.2f", this.getWartosc()) + "zł");
        System.out.println("Termin płatności: " + this.getDataZaplaty());
        System.out.println(new String(new char[60]).replace("\0", "-"));

        }

}
