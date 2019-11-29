import java.time.LocalDate;


public class Historia {
    private Klient klient;
    private float kwota;
    private LocalDate data;
    private String nazwa_operacji;
    private float saldo;

    public Historia(Klient klient, float saldo, float kwota, String nazwa_operacji) { //jesli nazwa_operacji = przelew, a kwota jest dodatnia, to przelew przychodzacy
        this.klient = klient;
        this.saldo = saldo;
        this.kwota = kwota;
        this.nazwa_operacji = nazwa_operacji;
        this.data = LocalDate.now();
    }

    public Klient getKlient() {
        return klient;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getKwota() {
        return kwota;
    }

    public String getNazwa_operacji() {
        return nazwa_operacji;
    }

    public LocalDate getData() {
        return data;
    }

}
