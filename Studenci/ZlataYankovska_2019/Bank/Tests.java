import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Date;
public class Tests {
	@Test public void TestKlientTest() {
		Klient c = new Klient("Jan", "Kowalski", "Gdañsk, Lisowa 4");
		assertEquals(c.imie, "Jan");
		assertEquals(c.nazwisko, "Kowalski");
		assertEquals(c.adres, "Gdañsk, Lisowa 4");
	}
	@Test public void TestOperacjaTest() {
		Klient c = new Klient("Jan", "Kowalski", "Gdañsk, Lisowa 4");
		Konto a = new Konto(c);
		Operacja o = new Operacja(1, a, 1000);
		assertEquals(o.type, 1);
		assertEquals(o.account, a);
		assertEquals(o.amount, 1000);
		assertEquals(o.checkDate(new Date(0), new Date()), true);
		assertEquals(o.checkDate(new Date(0), new Date(100)), false);
		assertEquals(o.checkDate(new Date(), new Date(2100000000)), false);
	}
	@Test public void TestKontoTest() {
		Klient c1 = new Klient("Jan", "Kowalski", "Gdañsk, Lisowa 4");
		Klient c2 = new Klient("Anna", "Nowak", "Warszawa, Cisowa 4");
		Konto a1 = new Konto(c1);
		Konto a2 = new Konto(c2);
		assertEquals(a1.client, c1);
		assertEquals(a1.getBalance(), 0);
		a1.cashIn(1000);
		assertEquals(a1.getBalance(), 1000);
		a1.cashSend(a2, 200);
		assertEquals(a1.getBalance(), 800);
		assertEquals(a2.getBalance(), 200);
		a1.cashOut(500);
		assertEquals(a1.getBalance(), 300);
	}
}
