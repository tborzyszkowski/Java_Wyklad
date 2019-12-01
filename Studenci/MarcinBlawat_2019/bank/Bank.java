package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> accounts;
	
	public Bank() {
		this.accounts = new ArrayList<Account>();
	};
	
	public void addAccount(Account account)
	{
		this.accounts.add(account);
	}
	
	public Account account(String accountNumber) {
	
		for(Account account : this.accounts) {
			if(account.getNumber().equals(accountNumber))
				return account;
		}
		return null;
	}
	
	public void transfer(String senderAccountNumber, String receiverAccountNumber, double amount)
	{
		Account sender = account(senderAccountNumber);
		Account receiver = account(receiverAccountNumber);
		sender.withdraw(amount);
		receiver.put(amount);
		Log temp = new Log(senderAccountNumber, amount, receiverAccountNumber, LocalDateTime.now());
		sender.notifyObserver(temp);
		receiver.notifyObserver(temp);
	}
}
