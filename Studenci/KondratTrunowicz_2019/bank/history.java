import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Date;

public class history {
    private LocalDate date;
    private int balance;
    private int n;

    public history(LocalDate date, int n, int balance) {
        this.date = date;
        this.n = n;
        this.balance = balance;
    }

    public history(){}

    public void setHistory(LocalDate date, int n, int balance)
    {
        this.date = date;
        this.n = n;
        this.balance=balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void wypiszHistory(){
        System.out.printf("Data: ");
        System.out.println(date);
        System.out.printf("Kwota: ");
        System.out.println(n);
        System.out.printf("Saldo: ");
        System.out.println(balance);
    }

}
