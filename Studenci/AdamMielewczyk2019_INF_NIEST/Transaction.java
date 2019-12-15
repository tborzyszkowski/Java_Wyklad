import jdk.jfr.Unsigned;

import java.util.Date;

public class Transaction {
    private Account sourceAccount;
    private Account targetAccount;
    private double balanceBeforeSourceAccount;
    private double balanceBeforeTargetAccount;
    private double amount;
    private Date date;
    private int operationID;//0-przelew, 1-wypłata, 2-wpłata

    public Transaction(Account sourceAccount, Account targetAccount, double amount, Date date) throws IllegalArgumentException{
        if(amount < 0.01 || (amount*100)%1 != 0 || sourceAccount.getBalance()<amount)
            throw new IllegalArgumentException("niepoprawna wartość transakcji");
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.balanceBeforeSourceAccount = sourceAccount.getBalance();
        this.balanceBeforeTargetAccount = targetAccount.getBalance();
        this.amount = amount;
        this.date = date;
        this.operationID = 0;

        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        sourceAccount.addTransaction(this);
        targetAccount.setBalance(targetAccount.getBalance()+amount);
        targetAccount.addTransaction(this);
    }

    public Transaction(Account sourceAccount, double amount, Date date, boolean payoutOrPayment) throws IllegalArgumentException{
        if(amount < 0.01 || amount%50 != 0 || sourceAccount.getBalance()<amount)
            throw new IllegalArgumentException("niepoprawna wartość transakcji");
        this.sourceAccount = sourceAccount;
        this.balanceBeforeSourceAccount = sourceAccount.getBalance();
        this.amount = amount;
        this.date = date;
        this.operationID = (payoutOrPayment?0:1) +1;

        if(payoutOrPayment)
        {
            sourceAccount.setBalance(sourceAccount.getBalance()-amount);
            sourceAccount.addTransaction(this);
        }
        else {
            sourceAccount.setBalance(sourceAccount.getBalance() + amount);
            sourceAccount.addTransaction(this);
        }
    }

    public static String stringHeader()
    {
        return "--------------------------------------------------------------------------------------------\n"+
                "SOURCE ACCOUNT NUMBER      |TARGET ACCOUNT NUMBER      |DATE                         |AMOUNT\n";

    }

    @Override
    public String toString() {
        return sourceAccount.getNumber()+" |"+targetAccount.getNumber()+" |"+date+" |"+amount+"\n";
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getTargetAccount() {
        return targetAccount;
    }

    public double getBalanceBeforeSourceAccount() {
        return balanceBeforeSourceAccount;
    }

    public double getBalanceBeforeTargetAccount() {
        return balanceBeforeTargetAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public int getOperationID() {
        return operationID;
    }
}
