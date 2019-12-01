public class Produkty {
    private String nazwa_prod;
    private int ilosc;
    private float cena_netto;
    private float podatek;


    public Produkty(String nazwa_prod, float cena_netto, float podatek, int ilosc) {
        this.nazwa_prod = nazwa_prod;
        this.cena_netto = cena_netto;
        this.podatek = podatek;
        this.ilosc = ilosc;
    }

    public Produkty(String nazwa_prod, float cena_netto, float podatek) {
        this(nazwa_prod, cena_netto, podatek, 1);
    }

    public  Produkty() {}

    public Produkty(Produkty produkty) {
        this(produkty.nazwa_prod, produkty.cena_netto, produkty.podatek);
    }

    public int ilosc(int x) {
         this.ilosc = x;
         return this.ilosc;
    }

    public float cena_jedn_netto() {
        return this.cena_netto;
    }

    public float ceny_netto_pozycji() {
        return cena_jedn_netto()*ilosc(this.ilosc);
    }

    public float vat() {
        return this.podatek*this.cena_netto;
    }

    public float cena_brutto() {
        float cena_brutto = ceny_netto_pozycji()+ vat()*ilosc(this.ilosc);
        return cena_brutto;
    }

    public float calkowita_cena_brutto(Produkty...suma_produktow) {
        float suma = 0;

        for(Produkty produkty : suma_produktow) {
            suma += produkty.cena_brutto();
        }
        return suma;
    }



}

