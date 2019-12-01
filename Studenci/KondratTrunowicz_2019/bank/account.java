import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Date;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class account {
    private int balance;
    private Client client;

    public ArrayList<history> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<history> operations) {
        this.operations = operations;
    }

    private ArrayList<history> operations;
    private LocalDate date;

    public account (Client client)
    {
        this.operations = new ArrayList<>();
        this.balance = 0;
        this.client = client;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void payment (account konto, int n) {
        history operation = new history();
        LocalDate today = LocalDate.now();
        konto.balance += n;
        operation.setHistory(today,n,konto.getBalance());
        konto.operations.add(operation);
    }
    public void paymentnotToday (account konto, int n, LocalDate date) {
        history operation = new history();
        konto.balance += n;
        operation.setHistory(date,n,konto.getBalance());
        konto.operations.add(operation);
    }
    public void withdraw (account konto, int n){
        history operation = new history();
        LocalDate today = LocalDate.now();
        konto.balance -= n;
        operation.setHistory(today,-n,konto.getBalance());
        konto.operations.add(operation);
    }
    public void withdrawnotToday (account konto, int n, LocalDate date){
        history operation = new history();
        konto.balance -= n;
        operation.setHistory(date,-n,konto.getBalance());
        konto.operations.add(operation);
    }
    public void transaction (account origin, account destination, int n){
        history operation = new history();
        history operation2 = new history();
        LocalDate today = LocalDate.now();
        origin.balance -= n;
        operation.setHistory(today,-n,origin.getBalance());
        origin.operations.add(operation);
        destination.balance += n;
        operation2.setHistory(today,n,destination.getBalance());
        destination.operations.add(operation2);
    }
    public void transactionnotToday (account origin, account destination, int n, LocalDate sent, LocalDate received){
        history operation = new history();
        history operation2 = new history();
        origin.balance -= n;
        operation.setHistory(sent,-n,origin.getBalance());
        origin.operations.add(operation);
        destination.balance += n;
        operation2.setHistory(received,n,destination.getBalance());
        destination.operations.add(operation2);
    }
    public void checkHistory (account konto, LocalDate from, LocalDate to){
        for (history operation : operations) {
            if (operation.getDate().isAfter(from) && operation.getDate().isBefore(to) || operation.getDate().isEqual(from) || operation.getDate().isEqual(to))
                operation.wypiszHistory();
        }
    }
    public void wypiszHistory() {
        for (int i = 0; i < operations.size(); i++) {
            operations.get(i).wypiszHistory();
        }
    }

}
