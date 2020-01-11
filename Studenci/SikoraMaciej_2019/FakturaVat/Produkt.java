public class Produkt {
    String nazwa;
    double cena;

    public Produkt(){}

    public Produkt(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Produkt(Produkt prod){
        nazwa = prod.nazwa;
        cena = prod.cena;
    }

    double podajCene(){
        return(cena);
    }


}
