package Bank;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konto {
    private String imie;
    private String nazwisko;
    private String numerKonta;
    private double srodki;
    private List<HistoriaKontaElementy> historiaKonta = new ArrayList<HistoriaKontaElementy>();

    public Konto(String imie, String nazwisko, String numerKonta, double srodki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKonta = numerKonta;
        this.srodki = srodki;
        historiaKonta.add(new HistoriaKontaElementy(LocalDate.now(), "Otwarcie konta", srodki));

    }

    public Konto(String imie, String nazwisko, String numerKonta) {
        this(imie, nazwisko, numerKonta, 0.0);
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getSrodki() {
        return srodki;
    }

    private void setSrodki(double srodki) {
        this.srodki = srodki;
    }

    public List<HistoriaKontaElementy> getHistoriaKonta() {
        return Collections.unmodifiableList(historiaKonta);
    }

    public void drukujHistoriaKonta(LocalDate dataPoczatkowa, LocalDate dataKoncowa){
        List<HistoriaKontaElementy> historiaKontaTemp = getHistoriaKonta();

        System.out.println("Historia transakcji dla konta: " + numerKonta
                + " od :" + dataPoczatkowa
                + " do: " + dataKoncowa);
        for(int i =0; i< historiaKontaTemp.size(); i++){
            if(dataPoczatkowa.compareTo(historiaKontaTemp.get(i).getDataTransakcji()) <=0
                    &&  dataKoncowa.compareTo(historiaKontaTemp.get(i).getDataTransakcji())>=0)
                System.out.println((i+1) + ": " + historiaKontaTemp.get(i).wypisz());
        }
    }


    public void drukujHistoriaKonta(){
        drukujHistoriaKonta(LocalDate.of(2012, Month.JANUARY, 1), LocalDate.now());
    }


    public void dodajTransakcje(LocalDate data, String cel, double wartoscTransakcji){
        this.historiaKonta.add(new HistoriaKontaElementy(data, cel, wartoscTransakcji));
    }

    public void dodajTransakcje(String cel, double wartoscTransakcji){
        this.dodajTransakcje(LocalDate.now(), cel, wartoscTransakcji);
    }

    public void wplataNaKonto(double wartoscTransakcji){
        this.setSrodki(this.getSrodki() + wartoscTransakcji);
        this.dodajTransakcje("Wplata", wartoscTransakcji);
    }

    public void wyplataZKonta(double wartoscTransakcji){
        if (this.getSrodki() < wartoscTransakcji)
            System.out.println("Brak srodkow na koncie!");
        else{
            this.setSrodki(getSrodki() - wartoscTransakcji);
            this.dodajTransakcje("Wyplata", wartoscTransakcji);
        }
    }

    public void przelewMiedzyKontami(Konto cel, double wartoscTransakcji){
        if (this.getSrodki() < wartoscTransakcji)
            System.out.println("Brak srodkow na koncie!");
        else {
            this.setSrodki(this.getSrodki() - wartoscTransakcji);
            cel.setSrodki(cel.getSrodki() + wartoscTransakcji);
            this.dodajTransakcje("Przelew do: " + cel.numerKonta, wartoscTransakcji);
            cel.dodajTransakcje("Wplata od: " + this.getNumerKonta(), wartoscTransakcji);
        }
    }
}

class HistoriaKontaElementy {
    private LocalDate dataTransakcji;
    private String celTransakcji;
    private double wartoscTransakcji;

    public HistoriaKontaElementy(LocalDate dataTransakcji, String celTransakcji, double wartoscTransakcji) {
        this.dataTransakcji = dataTransakcji;
        this.celTransakcji = celTransakcji;
        this.wartoscTransakcji = wartoscTransakcji;
    }

    public HistoriaKontaElementy() {
        this(LocalDate.now(), "Otwarcie konta", 0.0);
    }


    public LocalDate getDataTransakcji() {
        return dataTransakcji;
    }

    public String getCelTransakcji() {
        return celTransakcji;
    }

    public double getWartoscTransakcji() {
        return wartoscTransakcji;
    }

//    public void setDataTransakcji(LocalDate dataTransakcji) {
//        this.dataTransakcji = dataTransakcji;
//    }
//
//    public void setCelTransakcji(String celTransakcji) {
//        this.celTransakcji = celTransakcji;
//    }
//
//    public void setWartoscTransakcji(double wartoscTransakcji) {
//        this.wartoscTransakcji = wartoscTransakcji;
//    }

    public String wypisz() {
        return "Data: " + dataTransakcji +
                ", Cel: " + celTransakcji +
                ", Kwota: " + wartoscTransakcji;
    }
}