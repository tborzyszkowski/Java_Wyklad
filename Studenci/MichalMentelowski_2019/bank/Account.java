package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    private Owner owner;
    private int number;
    private double balance;
    private ArrayList<Transaction> transaction_list;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Account(Owner owner, int number) {
        this.owner = owner;
        this.number = number;
        this.balance = 0;
        this.transaction_list = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void addTransaction(Transaction transaction){
        this.transaction_list.add(transaction);
    }
    public ArrayList<Transaction> getTransactions() {
        return transaction_list;
    }
    public ArrayList<Transaction> getTransactions(LocalDate from, LocalDate to) {
        ArrayList<Transaction> list = new ArrayList<>();
        for (Iterator<Transaction> it = transaction_list.iterator(); it.hasNext(); ) {
            Transaction x = it.next();
            int fromValue = x.getDate().compareTo(from);
            int toValue = x.getDate().compareTo(to);
            if (fromValue > 0 && toValue < 0) {
                list.add(x);
            }
        }
        return list;
    }

}
