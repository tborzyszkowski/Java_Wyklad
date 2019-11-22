import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Account {
    private Owner owner;
    private int number;
    private double balance;
    private ArrayList<Transaction> transaction_list;

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number &&
                Double.compare(account.balance, balance) == 0 &&
                Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, number, balance);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Account(Owner owner, int number) {
        this.owner = owner;
        this.number = number;
        this.balance = 0;
        if (String.valueOf(number).length() != 6){
            throw  new ValueException("That's not valid length");
        }
        this.transaction_list = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public double getBalance(){
        return balance;
    }
    public void change_balance(double amount) {
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
