package bank;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private Account from;
    private Account to;
    private double amount;
    private String title;
    private static int number = 0;
    private int transaction_number;

    public Transaction(Account from, Account to, double amount, String title) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.title = title;
        this.date = LocalDate.now();
        this.transaction_number = number;
        number++;
        from.addTransaction(this);
        to.addTransaction(this);
    }

    private LocalDate date;

    public Account getFrom() {
        return from;
    }

    public Account getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getTransaction_number(){
        return transaction_number;
    }
}