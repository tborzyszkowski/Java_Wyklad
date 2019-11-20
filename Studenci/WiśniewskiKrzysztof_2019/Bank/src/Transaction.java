import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private Account from;
    private Account to;
    private double amount;
    private String title;
    private static int number = 0;
    private int transaction_number;

    @Override
    public String toString() {
        return "Transaction{" +
                "from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                ", title='" + title + '\'' +
                ", transaction_number=" + transaction_number +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                transaction_number == that.transaction_number &&
                Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(title, that.title) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, amount, title, transaction_number, date);
    }

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
