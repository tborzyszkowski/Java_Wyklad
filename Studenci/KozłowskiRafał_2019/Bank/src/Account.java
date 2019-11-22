import java.util.*;

public class Account {
    private String numberAcc;
    private double balance;
    private List<Operations> listOp = new ArrayList<>();

    Account(String nrAcc, double bal, Bank bank){
        numberAcc = nrAcc;
        balance = bal;
        bank.listAccAdd(this);
    }

    void changeBalance(double amount){
        this.balance += amount;
    }

    String getNumberAcc(){ return numberAcc; }

    double getBalance() { return balance; }

    void addOperation(Operations newOp){
        listOp.add(newOp);
    }

    public String toString(){
        return "Historia transakcji dla rachunku: " + numberAcc + "\t\tObecne saldo: " + balance
                + "\n" + allOperations();
    }

    String allOperations(){
        String ops = new String();
        for(int i=0; i<listOp.size(); i++){
            ops += listOp.get(i).toString(this);
        }
        return ops;
    }

}
