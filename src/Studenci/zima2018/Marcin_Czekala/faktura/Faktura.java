import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Faktura {
	private double priceSum;
	private String date;
	private String saleDate;
	private String payDate;
	private int number;
	private static List<Integer> numbers = new ArrayList<Integer>();
	
	public Faktura(Pozycja[] position, String saleDate, String payDate) {
		super();
		this.priceSum = sumPrices(position);
		this.saleDate = saleDate;
		this.payDate = payDate;
		this.number = generateNumber();
		this.date = generateDate();
	}
	private double sumPrices(Pozycja[] position) {
		double sum=0;
		for(Pozycja x : position) {
			sum+=x.getPriceGross();
		}
		return sum;
	}
	private static int generateNumber() {
		 Random rand = new Random();
		 int number = rand.nextInt(5);
		 if(numbers.contains(number)) {
			 generateNumber();
		 }
		 numbers.add(number);
		return number;
	}
	private static String generateDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(new Date());
	}
	public void printFaktura(Pozycja [] position, Sprzedawca sprzedawca, Klient client) {
		System.out.println("Faktura 2018/"+number);
		System.out.println("Data: "+ date);
		System.out.println("Data sprzedaży :"+ saleDate);
		System.out.println("Data płatności :"+ payDate);
		System.out.println("");
		System.out.println(sprzedawca.printSeller());
		System.out.println(client.printClient());
		System.out.println("");
		System.out.println("Pozycje:");
		for(Pozycja x : position) {
			System.out.println(x.printPosition());
		}
		System.out.println("");
		System.out.println("suma brutto: " + this.priceSum);
	}
	public static void main (String args[]) {
		Pozycja[] position = new Pozycja[2];
 		position[0] = new Pozycja("drukarka", 2, 406);
		position[1] = new Pozycja("mysz", 3, 50);
		Sprzedawca seller = new Sprzedawca("Piotr Nowak", "Gdynia Batorego 74", "4984984984989", "1461468149816814");
		Klient client = new Klient("Jan Kowalski", "Gdańsk Grunwaldzka 25", "846616168486");		
		Faktura faktura = new Faktura(position,"2018/10/12 10:10:10","2018/10/12 10:12:45");
		faktura.printFaktura(position, seller, client);
	}
}