package fvat;
import java.util.*;

public class Faktura {
    //PozycjaFaktury[] lista;
    List<PozycjaFaktury> lista = new ArrayList<>();
    int numerFaktury;
    static int ostNumerFaktury = 0;
    String datSp;
    String datZp;
    double wartoscFv;
    String datWyst;
    Firma sprzedajacy;
    Firma kupujacy;

    Faktura(Firma sprzed, Firma kupuj, String datS, String datZ, String datW){
        numerFaktury = ++ostNumerFaktury;
        sprzedajacy = sprzed;
        kupujacy = kupuj;
        datSp = datS;
        datZp = datZ;
        datWyst = datW;
    }

    int getNumerFaktury(){
        return this.numerFaktury;
    }
    String getDatSp(){
        return this.datSp;
    }

    String getDatZp(){
        return this.datZp;
    }

    double getWartoscFv(){
        return this.wartoscFv;
    }

    String getDatWyst(){
        return this.datWyst;
    }

    Firma getSprzedajacy(){
        return this.sprzedajacy;
    }

    Firma getKupujacy(){
        return this.kupujacy;
    }

    void dodajPozycje(PozycjaFaktury poz){
        lista.add(poz);
        wartoscFv += poz.wartoscPoz();
    }

    double zwrocWartosc(){
        double sum = 0;
        for(int i=0; i < lista.size(); i++){
            sum += lista.get(i).wartoscPoz();
        }
        return sum;
    }

    void infoFV(){
        System.out.printf("Faktura nr:   %d\n", this.numerFaktury);
        System.out.printf("Sprzedajacy:  %s\n", this.sprzedajacy.nazwa);
        System.out.printf("Kupujacy:     %s\n", this.kupujacy.nazwa);
        System.out.printf("Data sprzed:  %s\n", this.datSp);
        System.out.printf("Data zaplaty: %s\n", this.datZp);
        System.out.printf("Data wystaw:  %s\n", this.datWyst);
        System.out.printf("Pozycje: ");
        System.out.println(lista.size());
        for (int i=0; i < lista.size(); i++){
            System.out.printf("         %s     %d        %f\n", lista.get(i).nazwaPoz, lista.get(i).ilosc, lista.get(i).ceneNettoPoz);
        }
    }
    public static void main(String[] args){
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        PozycjaFaktury lp1 = new PozycjaFaktury("Maszynka", 1, 30.25, 23);
        System.out.println(ostNumerFaktury);
        Faktura pierwsza = new Faktura(dpd, fedex, "dzis", "jutro", "pojutrze");
        System.out.println(ostNumerFaktury);
        System.out.println(pierwsza.getNumerFaktury());
        pierwsza.dodajPozycje(lp1);
        pierwsza.infoFV();
    }

}
