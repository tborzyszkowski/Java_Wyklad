package Laboratorium.pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Rejestr {
    private List<Pracownik> pracownicy = new ArrayList<Pracownik>();

    public void addPracownik(Pracownik pracownik){
        if(pracownicy.contains(pracownik)) {
            this.pracownicy.add(pracownik);
        }
    }

    public int rejestrSize(){
        return this.pracownicy.size();
    }

    public int wartoscRejestru(){
        int result = 0;
        for(Pracownik p : pracownicy){
            result += p.wartosc();
        }
        return result;
    }
}
