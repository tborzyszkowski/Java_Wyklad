package Zamówienie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Faktura {

    private int numerFaktury;
    private static List<Integer> generatorNumerów = new ArrayList<>();
    private String dataWystawieniaFaktury;
    private Produkt produkt;
    private List<Produkt> zamowienie;

    public Faktura(List<Produkt> zamowienie) {
        // Wygenerowany numer faktury
        this.numerFaktury = nadajNumerFaktury();
        this.dataWystawieniaFaktury = utworzDatęWystawieniaFaktury();
        this.zamowienie = zamowienie;
    }

    private int nadajNumerFaktury() {
        generatorNumerów.add(generatorNumerów.size()+1);
        return generatorNumerów.size();
    }

    private String utworzDatęWystawieniaFaktury() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm");
        Date date = new Date(System.currentTimeMillis());
        return dataWystawieniaFaktury = formatter.format(date);
    }

    public int getNumerFaktury() {
        return numerFaktury;
    }

    public String getDataWystawieniaFaktury() {
        return dataWystawieniaFaktury;
    }

    public double zsumujCenęBruttoZeWszystkichPozycji() {
        double tmp = 0;
        for (Produkt pozycja: zamowienie) {
            tmp += pozycja.getBruttoPosition();
        }
        return tmp;
    }

    public void wypiszDaneFaktury() {
        System.out.println("Dane faktury: ");
        System.out.printf("Numer faktury: ");
        System.out.println(numerFaktury);
        System.out.printf("Data wystawienia faktury: ");
        System.out.println(dataWystawieniaFaktury);
        System.out.printf("Wartość całkowita faktury (suma cen brutto ze wszystkich pozycji): ");
        System.out.println(zsumujCenęBruttoZeWszystkichPozycji() + " zł" + "\n");
    }
}
