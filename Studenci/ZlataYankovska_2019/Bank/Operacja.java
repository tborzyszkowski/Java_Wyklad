import java.util.Date;
public class Operacja {
	int type;
	Konto account;
	int amount;
	Date date;
	Operacja(int type, Konto account, int amount){
		this.type = type;
		this.account = account;
		this.amount = amount;
		date = new Date();
	}
	boolean checkDate(Date from, Date to) {
		if(date.before(from) || date.after(to)) {
			return false;
		}
		return true;
	}
}
