import java.time.LocalDate;

public class Transaction {
    private Account transferFrom;
    private Account transferTo;
    private double cash;
    private String title;
    private LocalDate date;

    private double currentBalance;

    public Transaction(Account transferFrom, Account transferTo, double cash, String title) {
        this.transferFrom = transferFrom;
        this.transferTo = transferTo;
        this.cash = cash;
        this.title = title;
        this.date = LocalDate.now();
        this.currentBalance = transferFrom.getBalance() + cash;
        if (cash > transferFrom.getBalance()) {
            throw new IllegalArgumentException("insufficient cash");
        }

    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Transaction(Account transferFrom, double cash, String title) {
        this.transferFrom = transferFrom;
        this.transferTo = transferFrom;
        this.cash = cash;
        this.title = title;
        this.date = LocalDate.now();
        this.currentBalance = transferFrom.getBalance() + cash;

        if (cash < 0 && transferFrom.getBalance() < (-cash)) {
            throw new IllegalArgumentException("insufficient cash");
        }

    }

    @Override
    public String toString() {
        return "Transfer from: " + transferFrom.getAccountNumber() +
                "\ntransfer to: " + transferTo.getAccountNumber()
                + "\ncash: " + cash +
                "\ntitle: " + title +
                "\ndate: " + date +
                "\nbalance: " + currentBalance + "\n";
    }


    public Account getTransferFrom() {
        return transferFrom;
    }

    public Account getTransferTo() {
        return transferTo;
    }

    public double getCash() {
        return cash;
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
}
