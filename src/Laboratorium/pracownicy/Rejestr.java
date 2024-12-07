package Laboratorium.pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Rejestr {
    private List<Pracownik> pracownicy = new ArrayList<Pracownik>();

    public Rejestr addPracownik(Pracownik pracownik){
        //if(pracownicy.contains(pracownik)) {
            this.pracownicy.add(pracownik);
        //}
        return this;
    }

    public int rejestrSize(){
        return this.pracownicy.size();
    }

    public int wartoscRejestru(){
        return pracownicy.stream()
                .map(p -> p.wartosc())
                .reduce(0, (acc, w) -> acc + w);
//        int result = 0;
//        for(Pracownik p : pracownicy){
//            result += p.wartosc();
//        }
//        return result;
    }
}
