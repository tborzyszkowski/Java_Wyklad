import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Konto {

    private String numerKonta;
    private int stanKonta;
    private List<List<String>> historia = new ArrayList<>();

    public int getStanKonta() {
        return stanKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public void setHistoria(List<List<String>> historia) {
        this.historia = historia;
    }

    public Konto(String numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        List<String> tmp = new ArrayList<>();
        tmp.add("'Operacja' ");
        tmp.add("'Data' ");
        tmp.add("'Operacja wewnątrz konta/przelew' ");
        tmp.add("'Obecny stan konta:' ");
        tmp.add(Integer.toString(stanKonta));
        this.historia.add(tmp);
    }

    public int wplac(int kwota) {
        List<String> wplata = new ArrayList<>();
        wplata.add("'Wpłata' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        wplata.add(formatter.format(date));
        wplata.add("'Operacja wewnątrz konta' ");
        wplata.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) + kwota;
        wplata.add(Integer.toString(nowyStanKonta));
        historia.add(wplata);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return nowyStanKonta;
    }

    public int wyplac(int kwota) {
        List<String> wyplata = new ArrayList<>();
        wyplata.add("'Wypłata' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        wyplata.add(formatter.format(date));
        wyplata.add("'Operacja wewnątrz konta' ");
        wyplata.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) - kwota;
        wyplata.add(Integer.toString(nowyStanKonta));
        historia.add(wyplata);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return nowyStanKonta;
    }


    public void wykonajPrzelewWychodzący(int kwota, String inneKonto){
        List<String> przelew = new ArrayList<>();
        przelew.add("'Przelew wychodzący' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        przelew.add(formatter.format(date));
        przelew.add("'Na konto:' " + inneKonto + " ");
        przelew.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) - kwota;
        przelew.add(Integer.toString(nowyStanKonta));
        historia.add(przelew);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void wykonajPrzelewPrzychodzący(int kwota, String inneKonto) {
        List<String> przelew = new ArrayList<>();
        przelew.add("'Przelew przychodzący' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        przelew.add(formatter.format(date));
        przelew.add("'Przelew z konta:' " + inneKonto + " ");
        przelew.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) + kwota;
        przelew.add(Integer.toString(nowyStanKonta));
        historia.add(przelew);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public List<List<String>> getHistoria() {
        return historia;
    }

    @Override
    public String toString() {
        return "Konto{" +
                ", historia=" + historia +
                '}';
    }
}
