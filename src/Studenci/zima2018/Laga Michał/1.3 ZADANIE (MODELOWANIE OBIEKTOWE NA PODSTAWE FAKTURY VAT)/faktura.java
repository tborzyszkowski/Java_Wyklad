import java.util.Random;
import java.util.Date;
import java.util.Calendar;
public class faktura {
	public static void main(String[] args) {
		Date date = new Date();
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, 7);
		dt = c.getTime();
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		System.out.println("faktura nr:"+n);
		System.out.println("data wystawienia: "+date);
		System.out.println("data p³atnoœci: "+dt);
		
		klient nosacz = new klient("Nosacz Saudyjski","5871519200","4920010000316512");
		adres nosacz1 = new adres("Mickiewicza","15","90-210","Farrzafa");
		nosacz1.printadres();
		nosacz.printklient();
		produkt bu³ka = new produkt("bu³ka", 5, 0.20 ,23);
		produkt mas³o = new produkt("mas³o", 2, 2.20 ,23);
		produkt marchew = new produkt("marchew", 10, 0.20 ,18);
		produkt cukier = new produkt("cukier", 1, 1.50 ,100);
		produkt dzem = new produkt("d¿em", 1, 5.20 ,23);
		produkt srubokret = new produkt("œrubokrêt", 1, 15.50 ,23);
	
		bu³ka.printproduct();
		mas³o.printproduct();
		marchew.printproduct();
		cukier.printproduct();
		dzem.printproduct();
		srubokret.printproduct();
		
		double wartosccalkowita = 0;
		wartosccalkowita=wartosccalkowita+bu³ka.brutto();
		wartosccalkowita=wartosccalkowita+mas³o.brutto();
		wartosccalkowita=wartosccalkowita+marchew.brutto();
		wartosccalkowita=wartosccalkowita+cukier.brutto();
		wartosccalkowita=wartosccalkowita+dzem.brutto();
		wartosccalkowita=wartosccalkowita+srubokret.brutto();
		System.out.println("ca³kowita cena brutto: "+wartosccalkowita+"z³");
		}
	
}
