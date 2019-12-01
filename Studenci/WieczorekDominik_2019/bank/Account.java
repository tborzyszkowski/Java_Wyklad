import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account {
    private Owner owner;
    private double balance;
    private ArrayList<Transaction> transactionList;
    private String accountNumber;

    public Account(Owner owner, String accountNumber) {
        this.owner = owner;
        this.balance = 0;
        this.transactionList = new ArrayList<Transaction>();
        this.accountNumber = accountNumber; //67 1234 5678 0000 0000 1234 5678
        if (!accountNumber.matches("\\d{26}"))
        {
            throw new IllegalArgumentException("wrong account number");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getBalance() {

        return balance;
    }

    public void changeBalance(double cash) {
        this.balance += cash;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(Transaction transaction) {
        double cash = transaction.getCash();
        if (transaction.getTransferFrom() == transaction.getTransferTo()) {
            changeBalance(cash);
        }
        else {
            if(cash>0) {
                this.changeBalance(-cash);
                Account transferTo = transaction.getTransferTo();
                transferTo.changeBalance(cash);
            }
            else throw new IllegalArgumentException("illegal transfer");
        }
        this.transactionList.add(transaction);
    }

    public ArrayList<Transaction> getTransactionHistory(LocalDate from, LocalDate to) {
        ArrayList<Transaction> list = new ArrayList<Transaction>();
        for (Transaction t : transactionList) {
            if ((t.getDate().isBefore(to) && t.getDate().isAfter(from)) || t.getDate().isEqual(to) || t.getDate().isEqual(from))
            {
                list.add(t);
            }
        }
        return list;
    }
}
