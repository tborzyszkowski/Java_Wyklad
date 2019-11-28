import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Date;
public class Tests {
	@Test public void TestProductTest() {
		Product p = new Product("0000", "wedka", 100.0);
		assertEquals(p.code, "0000");
		assertEquals(p.name, "wedka");
		assertEquals(p.price, 100.0);
		assertEquals(p.discountPrice, 100.0);
	}
	@Test public void TestKoszykTest() {
		Product p1 = new Product("0000", "wedka", 1000.0);
		Product p2 = new Product("0000", "wedka", 200.0);
		Product p3 = new Product("0000", "wedka", 500.0);
		Koszyk k = new Koszyk();
		k.AddProduct(p1);
		k.AddProduct(p2);
		k.AddProduct(p3);
		assertEquals(k.suma, 1700);
		k.tanszyZaDarmo();
		assertEquals(k.suma, 1500);
		k.Restore();
		assertEquals(k.suma, 1700);
		k.ponad300();
		assertEquals(k.suma, 0.95*1700);
		k.kupon();
		assertEquals(k.suma, 0.65*1700);
		k.dajKubek();
		assertEquals(k.Lista.size(), 4);
	}
}
