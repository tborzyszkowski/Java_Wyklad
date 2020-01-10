import java.time.LocalDate;

public class Przelew {
    String rodzaj;
    Konto wlasciciel;
    Konto odbiorca;
    double kwota;
    LocalDate data;


    public Przelew(){}

    public Przelew(Konto wlasciciel, Konto odbiorca, double kwota){
        this.wlasciciel = wlasciciel;
        this.odbiorca = odbiorca;
        this.kwota = kwota;
        if(wlasciciel.nr == "Numer bankomatu"){
            rodzaj = "Wyplata";
        }
        else if(odbiorca.nr == "Numer bankomatu"){
            rodzaj = "Wplata";
        }
        else{
            rodzaj = "Przelew";
        }

        wlasciciel.stan = wlasciciel.stan - kwota;
        odbiorca.stan = odbiorca.stan + kwota;
        data = LocalDate.now();
    }


}
