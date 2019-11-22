package fvat;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class faktura {
    private klient klientF;
    private sprzedajacy sprzedajacyF;
    private double suma_brutto=0;
    private String data_wystawienia;
    private String data_sprzedazy;
    private String data_zaplaty;
    private static int licznik=0;
    private int nr_faktury;
    List<pozycja> pozycje = new ArrayList<>();

    public faktura(klient klientF,sprzedajacy sprzedajacyF, String data_wystawienia, String data_sprzedazy, String data_zaplaty) {
        this.klientF = klientF;
        this.sprzedajacyF = sprzedajacyF;
        this.data_wystawienia = data_wystawienia;
        this.data_sprzedazy = data_sprzedazy;
        this.data_zaplaty = data_zaplaty;
        licznik++;
        this.nr_faktury = licznik;
    }

    public faktura(klient klientF,sprzedajacy sprzedajacyF) {
        this.klientF = klientF;
        this.sprzedajacyF = sprzedajacyF;
        this.data_wystawienia = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        this.data_sprzedazy = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        this.data_zaplaty = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        licznik++;
        this.nr_faktury = licznik;
    }

    public faktura() {
        this.klientF = new klient();
        this.sprzedajacyF = new sprzedajacy();
        this.data_wystawienia = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        this.data_sprzedazy = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        this.data_zaplaty = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        licznik++;
        this.nr_faktury = licznik;
    }

    public String getNazwa_firmy_S() {
        return sprzedajacyF.getNazwa_firmy();
    }

    public String getAdres_S() {
        return sprzedajacyF.getAdres();
    }

    public String getNIP_S() {
        return sprzedajacyF.getNIP();
    }

    public String getNr_konta() {
        return sprzedajacyF.getNr_konta();
    }

    public String getNazwa_firmy_K() {
        return klientF.getNazwa_firmy();
    }

    public String getAdres_K() { return klientF.getAdres(); }

    public String getNIP_K() {
        return klientF.getNIP();
    }

    public String getData_wystawienia() { return data_wystawienia; }

    public String getData_sprzedazy() {
        return data_sprzedazy;
    }

    public String getData_zaplaty() {
        return data_zaplaty;
    }

    public int getNr_faktury() { return nr_faktury; }

    public double getBrutto() { return suma_brutto; }

    public void setKlient(klient klientF) {
        this.klientF = klientF;
    }

    public void setSprzedajacy(sprzedajacy sprzedajacyF) {
        this.sprzedajacyF = sprzedajacyF;
    }

    public void setData_wystawienia(String data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public void setData_sprzedazy(String data_sprzedazy) {
        this.data_sprzedazy = data_sprzedazy;
    }

    public void setData_zaplaty(String data_zaplaty) {
        this.data_zaplaty = data_zaplaty;
    }


    public void add_brutto(double brut) {
        this.suma_brutto += brut;
    }

    public void dodaj_pozycje(pozycja poz){
        this.pozycje.add(poz);
        add_brutto(poz.get_brutto());
    }

    public void dodaj_liste(List<pozycja> l_poz){
        this.pozycje.addAll(l_poz);
        this.suma_brutto=0;
        for (pozycja x : l_poz)
            add_brutto(x.get_brutto());
    }

    public void wypisz_fakture(){
        System.out.println("Nr_faktury : " + nr_faktury );
        System.out.println("Nazwa firmy sprzedawcy : " + getNazwa_firmy_S() );
        System.out.println("Adres sprzedawcy : " + getAdres_S() );
        System.out.println("NIP sprzedawcy : " + getNIP_S() );
        System.out.println("Nr_konta : " + getNr_konta() );
        System.out.println("Nazwa firmy klienta : " + getNazwa_firmy_K() );
        System.out.println("Adres klienta : " + getAdres_K() );
        System.out.println("NIP klienta : " + getNIP_K() );
        System.out.println("Data_wystawienia : " + data_wystawienia );
        System.out.println("Data_sprzedazy : " + data_sprzedazy );
        System.out.println("Data_zaplaty : " + data_zaplaty );
        System.out.println();
        System.out.println("Pozycje (brutto) : ");
        for (pozycja x : pozycje)
            System.out.println(x.get_Nazwa() + " " + x.get_ilosc() + " x " + (BigDecimal.valueOf(x.get_brutto()/x.get_ilosc()).setScale(2, RoundingMode.FLOOR)) );
        System.out.println();
        System.out.println("Suma_brutto : " + BigDecimal.valueOf(suma_brutto).setScale(2, RoundingMode.FLOOR) );
    }
}
