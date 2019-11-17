public class Transfer {

    private Bank account1;
    private Bank account2;

    public Transfer(Bank account1, Bank account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public double makeTransfer(double amount, Bank account1, Bank account2) {

        this.account1.getDate();
        this.account1.setAccountBalance(this.account1.getAccountBalance() - amount);
        this.account1.addOperationSums("Transfer: -" + amount + "$" + " to account: " + this.account2.getAccountNumber());

        this.account2.getDate();
        this.account2.setAccountBalance(this.account2.getAccountBalance() + amount);
        this.account2.addOperationSums("Transfer: +" + amount + "$" + " from account: " + this.account1.getAccountNumber());

        return account1.getAccountBalance();
    }

}