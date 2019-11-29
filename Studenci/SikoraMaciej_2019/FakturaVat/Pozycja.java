public class Pozycja {
    Produkt prod;
    int ilosc;
    double netto;
    double vat;
    double brutto;

    public Pozycja(){}

    public Pozycja(Produkt prod, int ilosc){
        this.prod = prod;
        this.ilosc = ilosc;
        netto = ilosc * prod.cena;
        vat = 0.23;
        brutto = netto + netto * vat;
    }

    public Pozycja(Pozycja fak){
        this(fak.prod, fak.ilosc);

    }

    void ustawVat(double a){
        vat = a;
    }

    double podajNetto(){
        return netto;
    }

    double podajBrutto(){
        return brutto;
    }

}
