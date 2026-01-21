import java.text.SimpleDateFormat;
import java.util.Date;

public class Transfer {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void MakeTransfer(String title, Account from, Account to, Double amount){
        if(from.getBalance() >= amount && amount > 0){
            Date date = new Date();

            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            from.setLog("\nTitle: "+ title + " From account: " + from.getNumber() + " Owned by: " + from.getOwner().getName() + " " + from.getOwner().getSurname() +  "\nTo account: " + to.getNumber() + " Owned by: " + to.getOwner().getName() + " " + to.getOwner().getSurname()+"\nAmount: " + amount + " Date: " + sf.format(date) );
            to.setLog("\nTitle " + title + "From account: " + from.getNumber() + " Owned by: " + from.getOwner().getName() + " " + from.getOwner().getSurname() +  "\nTo account: " + to.getNumber() + " Owned by: " +  to.getOwner().getName() + " " + to.getOwner().getSurname()+ "\nAmount: " + amount + " Date: " + sf.format(date));
        }

    }
    public void Withdraw(Account account, Double amount){
        if(account.getBalance() >= amount && amount > 0 ){
            account.setBalance(account.getBalance() - amount);
            account.setLog("\nWithdraw: " + amount +" Current Balance: " + account.getBalance() + " Date: " + sf.format(new Date()));
        }

    }
    public void Deposit(Account account, Double amount){
        if(amount > 0 ){
            account.setBalance(account.getBalance() + amount);
            account.setLog("\nDeposit: " + amount +" Current Balance: " + account.getBalance() + " Date: " + sf.format(new Date()));
        }
    }

}
