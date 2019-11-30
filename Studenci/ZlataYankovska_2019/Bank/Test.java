import java.util.Date;
public class Test {
	public static void main(String[] args) {
		Klient c1 = new Klient("jan", "kowalski", "gdansk");
		Klient c2 = new Klient("anna", "wozna", "warszawa");
		Konto k1 = new Konto(c1);
		Konto k2 = new Konto(c1);
		Konto k3 = new Konto(c2);
		k1.cashIn(1000);
		k2.cashOut(200);
		k1.cashSend(k3, 500);
		Date theFirstDay = new Date(0);
		Date theLastDay = new Date();
		k1.printHistory(theFirstDay, theLastDay);
	}
}
