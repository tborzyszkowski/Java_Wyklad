package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private int accountNumber;
    private String ownerFirstName;
    private String ownerLastName;
    private ArrayList<Transaction> transactions;
    private int id;
    private static int idCounter = 0;

    public Account(int accountNumber, String ownerFirstName, String ownerLastName) {
        this.accountNumber = accountNumber;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.balance = 0;
        this.transactions = new ArrayList<>();
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", transactions=" + transactions +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                accountNumber == account.accountNumber &&
                id == account.id &&
                Objects.equals(ownerFirstName, account.ownerFirstName) &&
                Objects.equals(ownerLastName, account.ownerLastName) &&
                Objects.equals(transactions, account.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, accountNumber, ownerFirstName, ownerLastName, transactions, id);
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public ArrayList<Transaction> getTransactions(LocalDate from, LocalDate to){
        ArrayList<Transaction> x = new ArrayList<>();
        for (Transaction transaction : transactions){
            int tmp1 = transaction.getDate().compareTo(from);
            int tmp2 = transaction.getDate().compareTo(to);
            if (tmp1 >= 0 && tmp2 <= 0){
                x.add(transaction);
            }
        }
        return x;
    }

    public int getId() {
        return id;
    }

    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
        this.changeBalance(-(transaction.getAmount()));
    }

    public void changeBalance(double amount){
        this.balance += amount;
    }
}
