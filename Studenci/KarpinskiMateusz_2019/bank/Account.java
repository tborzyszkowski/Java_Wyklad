package bank;


import java.util.ArrayList;
import java.util.Date;

public class Account {
    private Client client;
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> accountLog = new ArrayList<>();

    public Account(Client client, String accountNumber) {
        this.client = client;
        this.accountNumber = accountNumber;
        balance = 0.0;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double value) {
        balance+= value;
    }


    public void deposit(double value){
        setBalance(value);
        Transaction transaction = new Transaction(value, "wplata");
        accountLog.add(transaction);
    }

    public void withdraw(double value){
        setBalance(-value);
        Transaction transaction = new Transaction(-value, "wyplata");
        accountLog.add(transaction);
    }

    public void transfer(double value, Account to){
        to.onTransaction(value, this);
        setBalance(-value);
        Transaction transaction = new Transaction(-value, "przelew wychodzacy", to);
        accountLog.add(transaction);
    }

    private void onTransaction(double value, Account from){
        setBalance(value);
        Transaction transaction = new Transaction(value, "przelew przychodzacy", from);
        accountLog.add(transaction);
    }

    public void accountLog(){
        System.out.println("Historia: ");
        accountLog.forEach(l -> {
            System.out.println(l.toString());
        });
    }

    public void accountLog(Date from, Date to){

        System.out.println("Historia od " + from.toString()+ " do " + to.toString());
        accountLog.iterator().forEachRemaining(p-> {
            if((from.compareTo(p.getDate()) <= 0) && (to.compareTo(p.getDate()) >= 0)) System.out.println(p.toString());
        });


    }

}
