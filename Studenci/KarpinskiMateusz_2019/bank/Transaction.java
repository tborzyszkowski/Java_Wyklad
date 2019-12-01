package bank;


import java.util.Date;

public class Transaction {
    private Date date;
    private double value;
    private Account account;
    private String type;



    public Transaction(double value, String type) {
        this.value = value;
        date = new Date();
        this.type = type;
    }

    public Transaction(double value, String type, Account account) {
        this(value, type);
        this.account = account;

    }

    public Account getAccount() {
        return account;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        if (account == null){
            return  "date: " + date +
                    ", value: " + value +
                    ", type: " + type;

        }else {
            return "date: " + date +
                    ", value: " + value +
                    ", account nr: " + account.getAccountNumber() +
                    ", type: " + type;
        }

    }
}
