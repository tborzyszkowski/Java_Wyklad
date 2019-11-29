import java.time.LocalDate;
import java.util.ArrayList;

public class Transakcje {
    private Klient klient;
    private float saldo;
    private ArrayList<Historia> historiaArrayList = new ArrayList<>();
    private LocalDate data_dzis;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Klient getKlient() {
        return klient;
    }

    public Transakcje(Klient klient, float saldo) {
        this.klient = klient;
        this.saldo = saldo;
        this.data_dzis = LocalDate.now();
    }

    public void wplata(float kwota) {
         setSaldo(getSaldo() + kwota);
         historiaArrayList.add(new Historia(klient,getSaldo() ,kwota, "wplata"));
    }

    public void wyplata(float kwota) {
         setSaldo(getSaldo() - kwota);
         historiaArrayList.add(new Historia(klient,getSaldo() ,-kwota, "wyplata"));
    }

    public void przelew(Transakcje transakcje, float kwota) {
        setSaldo(getSaldo() - kwota);
        historiaArrayList.add(new Historia(klient, getSaldo(), -kwota, "przelew"));
        transakcje.setSaldo(transakcje.getSaldo() + kwota);
        historiaArrayList.add(new Historia(transakcje.getKlient(), transakcje.getSaldo(), kwota, "przelew"));
    }

    public void print_transakcje(String nr_bank, LocalDate dzien1, LocalDate dzien2) {
        for (int i=0; i<historiaArrayList.size(); i++) {
            Historia x = historiaArrayList.get(i);

            if ((x.getData().compareTo(dzien1) >= 0) && (x.getData().compareTo(dzien2) <= 0)) {
                if (x.getKlient().getNr_bank().equals(nr_bank)) {

                    if (x.getNazwa_operacji().equals("wyplata"))
                        System.out.println("Imie i nazwisko: " + x.getKlient().getImie_nazwisko() + ", Data: " + x.getData() + ", Saldo: " + x.getSaldo() + ", Kwota: "+ x.getKwota() + ", Nazwa operacji: " + x.getNazwa_operacji());

                    if (x.getNazwa_operacji().equals("wplata"))
                        System.out.println("Imie i nazwisko: " + x.getKlient().getImie_nazwisko() + ", Data: " + x.getData() + ", Saldo: " + x.getSaldo() + ", Kwota: "+ x.getKwota() + ", Nazwa operacji: " + x.getNazwa_operacji());

                    if (x.getNazwa_operacji().equals("przelew"))
                        System.out.println("Imie i nazwisko: " + x.getKlient().getImie_nazwisko() + ", Data: " + x.getData() + ", Saldo: " + x.getSaldo() + ", Kwota: "+ x.getKwota() + ", Nazwa operacji: " + x.getNazwa_operacji());
                }
            }
        }
    }
}

// historiaArrayList.get(i)
