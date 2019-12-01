import java.time.LocalDate;
import java.util.ArrayList;

public class Zamowienie {

    private ArrayList<Pozycja> listaZakupow;
    private LocalDate dataZamowienia;

    public Zamowienie() {
        this.listaZakupow = new ArrayList<>();
        this.dataZamowienia = LocalDate.now();
    }

    public ArrayList<Pozycja> getListaZakupow() {
        return listaZakupow;
    }

    public LocalDate getDataZamowienia() {
        return dataZamowienia;
    }

    public void dodajPozycje(Produkt produkt, int ilosc) {
        Pozycja pozycja = new Pozycja(produkt, ilosc);
        listaZakupow.add(pozycja);
    }

    public double sumujBrutto() {

        double sumaBrutto = 0;
        for (Pozycja i : this.listaZakupow) {
            sumaBrutto += i.countCenaPozycjiBrutto();
        }
        return sumaBrutto;
    }

    public double sumujNetto() {

        double sumaNetto = 0;
        for (Pozycja i : this.listaZakupow) {
            sumaNetto += i.countCenaPozycjiNetto();
        }
        return sumaNetto;
    }

    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder("Zamówienie: \n");
        lista.append("Nazwa | cena netto/szt. [zł] | VAT | " +
                "Sztuk | cena netto [zł] | cena brutto [zł]\n");
        for (Pozycja i : listaZakupow) {
            lista.append(i.toString() + "\n");
        }
        lista.append("\nRazem (netto): " + String.format("%.2f", sumujNetto()) +
                " zł\nRazem (brutto): " + String.format("%.2f", sumujBrutto()) + " zł\n");
        return lista.toString();
    }
}
