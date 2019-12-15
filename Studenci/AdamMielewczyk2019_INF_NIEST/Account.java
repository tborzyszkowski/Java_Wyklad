import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Account {
    private String owner;
    private String address;
    private double balance;
    private BigInteger number;
    private List<Transaction> history=new ArrayList<>();

    public Account(String owner, String address, double balance, BigInteger number) {
        this.owner = owner;
        this.address = address;
        this.balance = balance;
        this.number = number;
    }

    @Override
    public String toString() {
        return "OWNER: "+owner+" | ADRESS: "+address+" | BALANCE: "+ balance+" | NUMBER: "+number+" |\n";
    }

    public String raport(Date after, Date before)
    {
        String temp=toString()+
                "==============================================================\n";
        for(Transaction trans : history)
        {
            if((trans.getDate().after(after) && trans.getDate().before(before))||trans.getDate().equals(before)) {
                if(trans.getOperationID()==0)
                {
                    boolean fromOrTo = trans.getTargetAccount().equals(this);
                    temp+= fromOrTo ? "FROM: "+trans.getSourceAccount().getNumber() : "TO: "+trans.getTargetAccount().getNumber();
                    temp += " | DATE: " + trans.getDate() + " | AMOUNT_AFTER: "
                            + (fromOrTo ? trans.getBalanceBeforeTargetAccount()+trans.getAmount() : trans.getBalanceBeforeSourceAccount()-trans.getAmount()) + "\n";
                }else if(trans.getOperationID()==1)
                {
                    temp +="|| WYPłATA ||"+ " | DATE: " + trans.getDate() + " | AMOUNT_AFTER: "+ (trans.getBalanceBeforeSourceAccount()-trans.getAmount()) + "\n";
                }else if(trans.getOperationID()==2)
                {
                    temp +="|| WPłATA ||"+ " | DATE: " + trans.getDate() + " | AMOUNT_AFTER: "+ (trans.getBalanceBeforeSourceAccount()+trans.getAmount()) + "\n";
                }
            }
        }
        return temp;
    }

    String getOwner() {
        return owner;
    }

    String getAddress() {
        return address;
    }

    double getBalance() {
        return balance;
    }

    BigInteger getNumber() {
        return number;
    }

    List<Transaction> getHistory() {
        return history;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void addTransaction(Transaction newTransaction){
        history.add(newTransaction);
    }

    @Override
    public boolean equals(Object o) {
        return this==o;
    }
}
