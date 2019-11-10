import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Konto {

    private String numerKonta;
    private int stanKonta;
    private List<List<String>> historia = new ArrayList<>();

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
//        wplata.add(Integer.toString(kwota));
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm ' '");
        Date date = new Date(System.currentTimeMillis());
        wplata.add(formatter.format(date));
        wplata.add("'Operacja wewnątrz konta' ");
        wplata.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) + kwota;
        wplata.add(Integer.toString(nowyStanKonta));
        historia.add(wplata);
        return nowyStanKonta;
    }

    public int wyplac(int kwota) {
        List<String> wyplata = new ArrayList<>();
        wyplata.add("'Wypłata' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm ' '");
        Date date = new Date(System.currentTimeMillis());
        wyplata.add(formatter.format(date));
        wyplata.add("'Operacja wewnątrz konta' ");
        wyplata.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) - kwota;
        wyplata.add(Integer.toString(nowyStanKonta));
        historia.add(wyplata);
        return nowyStanKonta;
    }


    public void wykonajPrzelewWychodzący(int kwota, String inneKonto) {
        List<String> przelew = new ArrayList<>();
        przelew.add("'Przelew wychodzący' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm ' '");
        Date date = new Date(System.currentTimeMillis());
        przelew.add(formatter.format(date));
        przelew.add("'Na konto:' " + inneKonto + " ");
        przelew.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) - kwota;
        przelew.add(Integer.toString(nowyStanKonta));
        historia.add(przelew);
    }

    public void wykonajPrzelewPrzychodzący(int kwota, String inneKonto) {
        List<String> przelew = new ArrayList<>();
        przelew.add("'Przelew przychodzący' ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm ' '");
        Date date = new Date(System.currentTimeMillis());
        przelew.add(formatter.format(date));
        przelew.add("'Przelew z konta:' " + inneKonto + " ");
        przelew.add("'Obecny stan konta:' ");
        int nowyStanKonta = Integer.parseInt(historia.get(historia.size()-1).get(4)) + kwota;
        przelew.add(Integer.toString(nowyStanKonta));
        historia.add(przelew);
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public List<List<String>> getHistoria() {
        return historia;
    }

    public void wypiszHistorie() {
        for (List<String> lista : historia) {
            for (String element : lista) {
                System.out.printf(element);
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

}
