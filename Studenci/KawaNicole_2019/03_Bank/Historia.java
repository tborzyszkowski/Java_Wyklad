package com.company;
import java.time.LocalDateTime;

public class Historia {
    public String rodzaj;
    public double kwota = 0;
    public LocalDateTime data;

    public void Dodaj(String rodzaj, double kwota, LocalDateTime data) {
        this.rodzaj = rodzaj;
        this.kwota = kwota;
        this.data = data;
    }
    public String Odczytaj(int i) {
        String result = " "+i+ ". " + this.rodzaj + ": " + this.kwota + " zł\n\tData: " + this.data;
        System.out.println(result);
        return result;

    }


}
