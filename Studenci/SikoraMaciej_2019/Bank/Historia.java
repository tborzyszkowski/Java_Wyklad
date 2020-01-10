import java.time.LocalDate;
import java.util.*;

public class Historia {
    Konto konto;
    LocalDate dzisiaj = LocalDate.now();

    List<Przelew> przelewy = new ArrayList<>();

    public Historia(){}

    public Historia(Konto konto){
        this.konto = konto;

    }

    void KolejnyPrzelew(Przelew przelew){
        przelewy.add(przelew);
    }

    void WypiszPrzelewy(){
        Przelew przelew;
        System.out.print("Historia transakcji "+konto.imie+" "+konto.nazwisko+"\n");
        for (int i = 0; i < przelewy.size(); i++){
            przelew = przelewy.get(i);
            System.out.print(przelew.rodzaj+" numer "+(i+1)+", od "+przelew.wlasciciel.imie+" "+przelew.wlasciciel.nazwisko+" do "+przelew.odbiorca.imie+" "+przelew.odbiorca.nazwisko+" wartosc: "+przelew.kwota+" data: "+przelew.data+"\n");
        }

    }

    void PrzelewZDaty(LocalDate dat){
        Przelew przelew;
        System.out.print("Historia transakcji "+konto.imie+" "+konto.nazwisko+"\n");
        for (int i = 0; i < przelewy.size(); i++){
            przelew = przelewy.get(i);
            if (przelew.data == dat){
                System.out.print(przelew.rodzaj+" numer "+(i+1)+", od "+przelew.wlasciciel.imie+" "+przelew.wlasciciel.nazwisko+" do "+przelew.odbiorca.imie+" "+przelew.odbiorca.nazwisko+" wartosc: "+przelew.kwota+" data: "+przelew.data+"\n");
            }

        }

    }


}
