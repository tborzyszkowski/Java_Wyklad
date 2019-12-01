import java.time.LocalDate;

public class Faktura {

    private Zamowienie zamowienie;
    private Kontrahent sprzedajacy;
    private Kontrahent kupujacy;
    private LocalDate dataWystawienia;
    private LocalDate dataZaplaty;
    private String numerFaktury;
    private static int counter = 0;

    public Faktura(Zamowienie zamowienie, Kontrahent sprzedajacy, Kontrahent kupujacy) {
        this.zamowienie = zamowienie;
        this.numerFaktury = generujNumerFaktury();
        counter++;
        this.sprzedajacy = sprzedajacy;
        this.kupujacy = kupujacy;
        this.dataWystawienia = LocalDate.now();
        this.dataZaplaty = LocalDate.now().plusDays(30);
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public Kontrahent getSprzedajacy() {
        return sprzedajacy;
    }

    public Kontrahent getKupujacy() {
        return kupujacy;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public LocalDate getDataZaplaty() {
        return dataZaplaty;
    }

    public String getNumerFaktury() {
        return numerFaktury;
    }

    public String generujNumerFaktury() {
        this.numerFaktury = "F/" + LocalDate.now().getYear() + "/" + LocalDate.now().getMonthValue() + "/" + counter;
        return this.numerFaktury;
    }

    @Override
    public String toString() {
        StringBuilder tekstFaktury = new StringBuilder();
        tekstFaktury.append("Faktura nr " + generujNumerFaktury() + "\n" +
                "Data wystawienia: " + this.dataWystawienia + "\n\n" +
                "Sprzedający:\n" + this.sprzedajacy.toString() + "\n" +
                "Kupujący:\n" + this.kupujacy.toString() + "\n"
                + this.zamowienie.toString() + "\nData sprzedaży: " + zamowienie.getDataZamowienia() +
                "\nTermin zapłaty: " + this.dataZaplaty);
        return tekstFaktury.toString();

    }
}
