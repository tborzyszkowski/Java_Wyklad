public class Konto {
    String imie;
    String nazwisko;
    String nr;
    double stan;


    public Konto (){
        imie = "Banku";
        nazwisko = "Mbank";
        nr = "Numer bankomatu";
        stan = 1000000;
    }

    public Konto (String imie, String nazwisko, String nr, double stan){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr = nr;
        this.stan = stan;
    }
}
