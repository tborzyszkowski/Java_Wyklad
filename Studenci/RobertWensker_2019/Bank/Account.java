import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private Owner owner;
    private String number;
    private double balance;
    private ArrayList<String>  log = new ArrayList<>();
    public void ShowHistoryFromPeriod (Date starting, Date ending) throws ParseException {
        starting.setYear(starting.getYear() - 1900);
        ending.setYear(ending.getYear() - 1900);

        for(String s : log){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            var st = sf.format(starting);
            var cr = s.substring(s.lastIndexOf("Date")).split(" ")[1];
            var en = sf.format(ending);

            if(CompareDates(cr,st) && CompareDates(en,cr)){
                System.out.println(s);
            }
        }
    }
    public boolean CompareDates(String date1, String date2) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sf.parse(date1);
        Date d2 = sf.parse(date2);

        if(d1.compareTo(d2) >= 0) {
            return true;
        } else{
            return false;
        }

    }
    Account(Owner owner,String number, double balance){
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }
    public ArrayList<String> getLog() {
        return log;
    }

    public void setLog(String str) {
        this.log.add(str);
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
