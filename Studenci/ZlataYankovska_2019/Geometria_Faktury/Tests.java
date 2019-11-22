import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Tests {
	@Test public void PunktConstructorGetTest() {
		Punkt p1 = new Punkt();
		assertEquals(p1.getX(), 0);
		assertEquals(p1.getY(), 0);
		
		Punkt p2 = new Punkt(1, 2);
		assertEquals(p2.getX(), 1);
		assertEquals(p2.getY(), 2);
		
		Punkt p3 = new Punkt(p2);
		assertEquals(p3.getX(), 1);
		assertEquals(p3.getY(), 2);
	}
	@Test public void PunktSetTest() {
		Punkt p = new Punkt();
		p.setX(4);
		assertEquals(p.getX(), 4);
		p.setY(3);
		assertEquals(p.getY(), 3);
	}
	@Test public void PunktShiftTest() {
		Punkt p = new Punkt();
		p.shift(4, 5);
		assertEquals(p.getX(), 4);
		assertEquals(p.getY(), 5);
	}
	@Test public void PunktDistanceTest() {
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(4, 3);
		assertEquals(p1.distance(p2), 5);
	}
	@Test public void OdcinekConstructorTest() {
		Odcinek o1 = new Odcinek();
		assertEquals(o1.A.getX(), 0);
		assertEquals(o1.A.getY(), 0);
		assertEquals(o1.B.getX(), 0);
		assertEquals(o1.B.getY(), 0);
		
		Punkt p1 = new Punkt(1, 2);		
		Punkt p2 = new Punkt(p1);
		
		Odcinek o2 = new Odcinek(p1, p2);
		assertEquals(o2.A.getX(), 1);
		assertEquals(o2.A.getY(), 2);
		assertEquals(o2.B.getX(), 1);
		assertEquals(o2.B.getY(), 2);
		
		Odcinek o3 = new Odcinek(1, 2, 3, 4);
		assertEquals(o3.A.getX(), 1);
		assertEquals(o3.A.getY(), 2);
		assertEquals(o3.B.getX(), 3);
		assertEquals(o3.B.getY(), 4);
		Odcinek o4 = new Odcinek(1, 2, p2);
		assertEquals(o4.A.getX(), 1);
		assertEquals(o4.A.getY(), 2);
		assertEquals(o4.B.getX(), 1);
		assertEquals(o4.B.getY(), 2);
		Odcinek o5 = new Odcinek(p1, 3, 4);
		assertEquals(o5.A.getX(), 1);
		assertEquals(o5.A.getY(), 2);
		assertEquals(o5.B.getX(), 3);
		assertEquals(o5.B.getY(), 4);
	}
	@Test public void OdcinekShiftTest() {
		Odcinek o = new Odcinek(1, 1, 1, 1);
		o.shift(4, 5);
		assertEquals(o.A.getX(), 5);
		assertEquals(o.A.getY(), 6);
		assertEquals(o.B.getX(), 5);
		assertEquals(o.B.getY(), 6);
	}
	@Test public void OdcinekDistanceTest() {
		Punkt A = new Punkt(0, 0);
		Punkt B = new Punkt(0, 4);
		Odcinek o = new Odcinek(A, B);
		Punkt C = new Punkt(2, 2);
		assertEquals(o.distance(C), 2);
	}
	@Test public void PozycjaOverallTest() {
		Pozycja p = new Pozycja("Buty", 2, 3500, 0.23);
		assertEquals(p.getName(), "Buty");
		assertEquals(p.getPrice(), 3500);
		assertEquals(p.getQuantity(), 2);
		assertEquals(p.getVAT(), 0.23);
		assertEquals(p.getBrutto(), 0.23*3500*2);
		assertEquals(p.getNetto(), 3500*2);
	}
	@Test public void FirmaOverallTest() {
		Firma f = new Firma("Fresh", "Berlin", "123", "234");
		assertEquals(f.nazwa, "Fresh");
		assertEquals(f.adres, "Berlin");
		assertEquals(f.NIP, "123");
		assertEquals(f.konto, "234");
	}
	@Test public void FakturaConstructorTest() {
		Firma k = new Firma("Fresh", "Berlin", "123", "234");
		Firma s = new Firma("Fire", "Bydgoszcz", "321", "432");
		Faktura f = new Faktura(k, s, "1000/12/03", "1000/12/03", "2020/12/31");
		assertEquals(f.klient, k);
		assertEquals(f.sprzedawca, s);
		assertEquals(f.dwyst, "1000/12/03");
		assertEquals(f.dsprze, "1000/12/03");
		assertEquals(f.dzap, "2020/12/31");
	}
	@Test public void FakturaCounterTest() {
		Firma k = new Firma("Fresh", "Berlin", "123", "234");
		Firma s = new Firma("Fire", "Bydgoszcz", "321", "432");
		Faktura f1 = new Faktura(k, s, "1000/12/03", "1000/12/03", "2020/12/31");
		Faktura f2 = new Faktura(k, s, "1000/12/03", "1000/12/03", "2020/12/31");
		assertEquals(f1.numer, 0);
		assertEquals(f2.numer, 1);
	}
	@Test public void FakturaMethodsTest() {
		Firma k = new Firma("Fresh", "Berlin", "123", "234");
		Firma s = new Firma("Fire", "Bydgoszcz", "321", "432");
		Faktura f = new Faktura(k, s, "1000/12/03", "1000/12/03", "2020/12/31");
		Pozycja p1 = new Pozycja("Buty", 20, 200, 0.2);
		Pozycja p2 = new Pozycja("Buty", 10, 4000, 0.2);
		f.addPoz(p1);
		f.addPoz(p2);
		assertEquals(f.getTotalBrutto(), 8800.0); //???
	}
}
