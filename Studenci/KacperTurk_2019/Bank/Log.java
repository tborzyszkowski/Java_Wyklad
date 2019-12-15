import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private int id_operacji;
    private int id_odbiorcy;
    private double kwota;
    private Date data;
    private static int licznik = 0;

    public Log() {
        valuesSetter(1,0,new Date());
    }

    public Log(int id_odbiorcy) {
        valuesSetter(id_odbiorcy,0,new Date());
    }

    public Log(int id_odbiorcy, double kwota) {
        valuesSetter(id_odbiorcy,kwota,new Date());
    }

    public Log(int id_odbiorcy, double kwota, Date data) {
        valuesSetter(id_odbiorcy,kwota,data);
    }

    public void valuesSetter(int id_odbiorcy,double kwota, Date data) {
        this.id_odbiorcy = id_odbiorcy;
        this.kwota = kwota;
        this.data = data;
        licznik++;
        this.id_operacji = licznik;
    }

    public int getId_operacji() {
        return id_operacji;
    }

    public int getId_odbiorcy() {
        return id_odbiorcy;
    }

    public double getKwota() {
        return kwota;
    }

    public Date getData() {
        return data;
    }

    public void setId_odbiorcy(int rodzaj_operacji) {
        this.id_odbiorcy = rodzaj_operacji;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRodzajOperacji(int id_klienta) {
        if (id_klienta == id_odbiorcy)
            return "WPLATA";
        else if (id_odbiorcy == 0)
            return "WYPLATA";
        else
            return "PRZELEW DO KLIENTA O ID = " + id_odbiorcy;
    }

}
