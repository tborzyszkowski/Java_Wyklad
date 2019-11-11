import java.util.List;

public class Operations {
    String operationDate;
    //private static String opList[] = {"in", "out", "transfer_in", "t"};
    private int opId; // 0-in, 1-out, 2-transfer_in, 3-transfer_out
    private Account sourceAcc;
    private double sourceBalanceBefore;
    private double sourceBalanceAfter;
    private Account targetAcc;
    private double targetBalanceBefore;
    private double targetBalanceAfter;
    private double amount;

    Operations(String date, Account source, Account target, double amount) {
        operationDate = date;
        sourceAcc = source;
        targetAcc = target;
        sourceBalanceBefore = source.getBalance();
        targetBalanceBefore = target.getBalance();
        this.amount = amount;
        source.changeBalance(-amount);
        target.changeBalance(amount);
        sourceBalanceAfter = source.getBalance();
        targetBalanceAfter = target.getBalance();
        sourceAcc.addOperation(this);
        targetAcc.addOperation(this);
    }

    double getAmount(){
        return amount;
    }

    Operations(String date, Account source, double amount) {
        operationDate = date;
        sourceAcc = source;
        sourceBalanceBefore = source.getBalance();
        this.amount = amount;
        source.changeBalance(amount);
        sourceAcc.addOperation(this);
        sourceBalanceAfter = source.getBalance();
    }

    public String toString(Account trigger) {
        String transactionType;
        double before = sourceBalanceBefore;
        double after = sourceBalanceAfter;

        if (trigger == targetAcc) {
            transactionType = "Przelew przychodzacy: ";
            before = targetBalanceBefore;
            after = targetBalanceAfter;
        } else if (trigger == sourceAcc && targetAcc != null) {
            transactionType = "Przelew wychodzacy: ";
        } else if (trigger == sourceAcc && amount > 0) {
            transactionType = "Wplata: ";
        } else {
            transactionType = "Wyplata: ";
        }
        return operationDate + " " + transactionType + String.format("%.2f PLN", amount)
                + "\n\tPrzed operacja: " + String.format("%.2f PLN", before) +
                "\n\tPo operacji: " + String.format("%.2f PLN", after) + "\n";
    }
}