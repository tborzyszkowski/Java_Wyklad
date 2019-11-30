import java.util.ArrayList;
import java.util.Date;
public class Konto {
	Klient client;
	private static int counter = 0;
	private int ID;
	private int balance; //Grosze
	private ArrayList<Operacja> history;
	Konto(Klient client){
		ID = counter;
		counter++;
		this.client = client;
		balance = 0;
		history = new ArrayList<Operacja>();
	}
	public int getID() {
		return ID;
	}
	public int getBalance() {
		return balance;
	}
	public void cashIn(int amount) {
		balance += amount;
		history.add(new Operacja(0, null, amount));
	}
	public void cashOut(int amount) {
		balance -= amount;
		history.add(new Operacja(1, null, amount));
	}
	public void cashSend(Konto recipient, int amount) {
		balance -= amount;
		recipient.cashGet(this, amount);
		history.add(new Operacja(2 , recipient, amount));
	}
	public void cashGet(Konto sender, int amount) {
		balance += amount;
		history.add(new Operacja(3 , sender, amount));
	}
	public void printHistory(Date from, Date to) {
		int len = history.size();
		for(int i = 0; i < len; i++) {
			Operacja op = history.get(i);
			if(op.checkDate(from, to)) {
				if(op.type == 0) {
					System.out.println(op.date.toString() + ": Wp³ata " + op.amount + " groszy.");
				}
				else if(op.type == 1) {
					System.out.println(op.date.toString() + ": Wyp³ata " + op.amount + " groszy.");
				}
				else if(op.type == 2) {
					System.out.println(op.date.toString() + ": Wys³ano " + op.amount + " na konto " + op.account.ID +".");
				}
				else {
					System.out.println(op.date.toString() + ": Otrzymano " + op.amount + " z konta " + op.account.ID +".");
				}
			}
		}
	}
}
