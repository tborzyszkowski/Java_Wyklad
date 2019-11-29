package bank;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private Account source;
    private Account destination;
    private String title;
    private double amount;
    private LocalDate date;
    private static int idCounter = 0;
    private int id;

    public Transaction(Account source, Account destination, String title, double amount) {
        this.source = source;
        this.destination = destination;
        this.title = title;
        this.amount = amount;
        this.date = LocalDate.now();
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "source=" + source +
                ", destination=" + destination +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                id == that.id &&
                Objects.equals(source, that.source) &&
                Objects.equals(destination, that.destination) &&
                Objects.equals(title, that.title) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, title, amount, date, id);
    }

    public Account getSource() {
        return source;
    }

    public Account getDestination() {
        return destination;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
