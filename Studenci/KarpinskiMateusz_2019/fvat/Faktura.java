package fvat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Faktura {
    private List<PozycjaFaktury> listaPozycji;
    private Klient klient;
    private Sprzedawca sprzedawca;
    private Date dataSprzedazy;
    private Date dataZaplaty;
    private static int generatorNumerowFaktury = 0;
    private int numerFaktury;


    public Faktura(List<PozycjaFaktury> listaPozycji, Klient klient, Sprzedawca sprzedawca, Date dataSprzedazy, Date dataZaplaty){
        this.listaPozycji = listaPozycji;
        this.klient = klient;
        this.sprzedawca = sprzedawca;
        this.dataSprzedazy = dataSprzedazy;
        this.dataZaplaty = dataZaplaty;
        numerFaktury = ++generatorNumerowFaktury;
    }

    public double wartoscCalkowita(){
        return listaPozycji.stream().mapToDouble(PozycjaFaktury::cenaBrutto).sum();
    }

    private String dataWystawienia(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String dataSprzedazy(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(dataSprzedazy);
    }

    private String dataZaplaty(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(dataZaplaty);
    }

    public int getNumerFaktury() {
        return numerFaktury;
    }

    public Klient getKlient(){ return klient; }

    public Sprzedawca getSprzedawca() { return sprzedawca; }

    public List<PozycjaFaktury> getListaPozycji() {return listaPozycji; }

    private String listaPozycjiToString() {
        String wynik = "";
        for (PozycjaFaktury pozycja : listaPozycji) {
            wynik += pozycja.toString();
        }
        return wynik;
    }

    @Override
    public String toString() {
        return "Faktura nr : " + numerFaktury + '\n' +
                "Lista pozycji: \n" + listaPozycjiToString() +
                "Wartosc calkowita: " + wartoscCalkowita() + '\n' +
                "Dane sprzedajacego: \n" + sprzedawca.toString() +
                "Dane klienta: \n" + klient.toString() +
                "Data wystawienia dokumentu: " + dataWystawienia() + '\n' +
                "Data sprzedazy: " + dataSprzedazy() + '\n' +
                "Data zaplaty: " + dataZaplaty();
    }

    public void wypiszDaneFaktury() {
        System.out.println(toString());
    }
}
