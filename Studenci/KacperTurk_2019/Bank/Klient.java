import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private double stan_konta;
    private int id;
    private static int licznik = 0;
    private List<Log> historia_transkacji = new ArrayList<Log>();

    public Klient() {
        valuesSetter("Jan","Kowalski",0);
    }

    public Klient(String imie, String nazwisko) {
        valuesSetter(imie,nazwisko,0);
    }

    public Klient(String imie, String nazwisko,double stan_konta) {
        valuesSetter(imie,nazwisko,stan_konta);
    }

    public void valuesSetter (String imie,String nazwisko,double stan_konta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stan_konta = stan_konta;
        licznik++;
        this.id=licznik;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStan_konta() {
        return stan_konta;
    }

    public int getId() {
        return id;
    }

    public List<Log> getHistoria_transkacji() {
        return historia_transkacji;
    }

    public Log getLastLog() {
        return historia_transkacji.get(historia_transkacji.size() -1);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStan_konta(int stan_konta) {
        this.stan_konta = stan_konta;
    }

    public void wplata(double kwota) {
        stan_konta+=kwota;
        historia_transkacji.add(new Log(id,kwota,new Date()));
    }

    public void wyplata(double kwota) {
        if (stan_konta>=kwota) {
            stan_konta -= kwota;
            historia_transkacji.add(new Log(0,kwota, new Date()));
        }
        else
            System.out.println("BRAK WYSTARCZAJACYCH SRODKOW");
    }

    public void przelew(Klient odbiorca, double kwota) {
        if (stan_konta>=kwota) {
            stan_konta -= kwota;
            odbiorca.wplata(kwota);
            historia_transkacji.add(new Log(odbiorca.getId(),kwota, new Date()));
            odbiorca.historia_transkacji.add(new Log(getId(),kwota, new Date()));
        }
        else
            System.out.println("BRAK WYSTARCZAJACYCH SRODKOW");
    }

    public void addLog(Log log) {
        historia_transkacji.add(log);
    }

    public void showHistory() {
        System.out.println("Historia :");
        for (Log x : historia_transkacji)
            System.out.println(x.getData() + " " + (BigDecimal.valueOf(x.getKwota()).setScale(2, RoundingMode.FLOOR)) + "   " + x.getRodzajOperacji(id) );
    }

    public void showHistory(Date data) {
        System.out.println("Historia od " + data + " :");
        for (Log x : historia_transkacji)
            if (x.getData().compareTo(data) >= 0)
                 System.out.println(x.getData() + " " + (BigDecimal.valueOf(x.getKwota()).setScale(2, RoundingMode.FLOOR)) + "   " + x.getRodzajOperacji(id) );
    }

    public void showHistory(Date data1, Date data2) {
        System.out.println("Historia     " + data1 + "  ---  " + data2 + " :");
        for (Log x : historia_transkacji)
            if ( (x.getData().compareTo(data1) >= 0) && (x.getData().compareTo(data2) <= 0) )
                System.out.println(x.getData() + " " + (BigDecimal.valueOf(x.getKwota()).setScale(2, RoundingMode.FLOOR)) + "   " + x.getRodzajOperacji(id));
    }

}
