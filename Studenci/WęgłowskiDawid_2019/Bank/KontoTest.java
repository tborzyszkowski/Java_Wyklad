import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class KontoTest
{
	@Test
	public void getWlasciciel()
	{
		Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Konto konto = new Konto(wlasciciel, "11222233334444555566667777");
		Assert.assertEquals(konto.getWlasciciel(), wlasciciel);
	}
	@Test
	public void getNumer()
	{
		Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Konto konto = new Konto(wlasciciel, "11222233334444555566667777");
		Assert.assertEquals(konto.getNumer(), "11222233334444555566667777");
	}
	@Test
	public void getBalans()
	{
		Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Konto konto = new Konto(wlasciciel, "11222233334444555566667777");
		Assert.assertEquals(konto.getBalans(), 0,0);
	}
	@Test
	public void modBalans()
	{
		Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Konto konto = new Konto(wlasciciel, "11222233334444555566667777");
		konto.modBalans(100.23);
		konto.modBalans(-23.11);
		konto.modBalans(1032.10);
		Assert.assertEquals(konto.getBalans(), 1109.22,0.001);
	}
	@Test
	public void setWlasciciel()
	{
		Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
		Konto konto = new Konto(wlasciciel1, "11222233334444555566667777");
		konto.setWlasciciel(wlasciciel2);
		Assert.assertEquals(konto.getWlasciciel(), wlasciciel2);
	}
	@Test
	public void getTransakcje()
	{
		Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
		Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
		Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
		Transakcja transakcja1 = new Transakcja(konto1,konto2,100.00);
		Transakcja transakcja2 = new Transakcja(konto1,konto2,100.00);
		Assert.assertEquals(konto1.getTransakcje().toString(), "[" + transakcja1 + ", " + transakcja2 + "]");
	}
	@Test
	public void getTransakcjePrzedzial()
	{
		Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
		Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
		Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
		Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
		Transakcja transakcja1 = new Transakcja(konto1,konto2,100.00);
		Transakcja transakcja2 = new Transakcja(konto1,konto2,100.00);
		Transakcja transakcja3 = new Transakcja(konto1,konto2,100.00);
		transakcja1.setDataTransakcji(LocalDate.of(2019,10,11));
		transakcja2.setDataTransakcji(LocalDate.of(2019,11,11));
		transakcja3.setDataTransakcji(LocalDate.of(2019,11,15));
		Assert.assertEquals(konto1.getTransakcje(LocalDate.of(2019,11,1),LocalDate.now()).toString(), "[" + transakcja2 + ", " + transakcja3 + "]");
	}
}