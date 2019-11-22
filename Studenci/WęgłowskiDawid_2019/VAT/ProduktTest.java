import org.junit.*;

public class ProduktTest
{

	@Test
	public void prototypeConstructorGetCenaNetto()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals(2.12, produkt.getCenaNetto(), 0.01);
	}

	@Test
	public void prototypeConstructorGetSumaNetto()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals(10.60, produkt.getSumaNetto(), 0.01);
	}

	@Test
	public void prototypeConstructorGetSumaBruto()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals(13.03, produkt.getSumaBrutto(), 0.01);
	}

	@Test
	public void prototypeConstructorGetNazwa()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals("Jablko", produkt.getNazwaProd());
	}

	@Test
	public void prototypeConstructorGetVAT()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals(0.23, produkt.getVAT(), 0.0);
	}

	@Test
	public void prototypeConstructorGetIlosc()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals(5, produkt.getIlosc(), 0);
	}

	@Test
	public void prototypeConstructorPrintProdukt()
	{
		Produkt produkt = new Produkt("Jablko", 5, 2.12, 0.23);
		Assert.assertEquals("Jablko szt. 5 13,04\n", produkt.printProdukt());
	}
}