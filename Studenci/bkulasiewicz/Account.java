  import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private String name;
    private String surname;
    private int accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;
    private int id;
    private static int idCounter = 0;


    public Account(int accountNumber, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactions = new ArrayList<Transaction>();
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {

        return "Account{" + "balance=" + balance +
                "number=" + "name+" + name + "surname+" + surname
                + "transactions" + transactions + "id" + id + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Double.compare(account.balance, balance) == 0 &&
                accountNumber == account.accountNumber &&
                id == account.id &&
                Objects.equals(name, account.name) &&
                Objects.equals(surname, account.surname) &&
                Objects.equals(transactions, account.transactions);

    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, accountNumber, name, surname, transactions, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public ArrayList<Transaction> getTransactions(LocalDate from, LocalDate to) {
        ArrayList<Transaction> x = new ArrayList<>();
        for (Transaction transaction : transactions) {
            int tmp1 = transaction.getDate().compareTo(from);
            int tmp2 = transaction.getDate().compareTo(to);
            if (tmp1 >= 0 && tmp2 <= 0) {
                x.add(transaction);
            }
        }
        return x;

    }

    public int getId() {
        return id;
    }
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        this.changeBalance(-(transaction.getAmount()));
    }
    public void changeBalance(double amount) {
        this.balance += amount;
    }

}


