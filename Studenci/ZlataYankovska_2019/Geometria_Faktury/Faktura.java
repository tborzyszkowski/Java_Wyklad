import java.util.ArrayList;
public class Faktura {
	ArrayList<Pozycja> pozycje;
	Firma klient;
	Firma sprzedawca;
	private static int counter = 0;
	int numer;
	String dwyst;
	String dsprze;
	String dzap;
	Faktura(Firma klient, Firma sprzedawca, String dwyst, String dsprze, String dzap){
		pozycje = new ArrayList<Pozycja>();
		this.klient = klient;
		this.sprzedawca = sprzedawca;
		this.numer = counter;
		counter++;
		this.dwyst = dwyst;
		this.dsprze = dsprze;
		this.dzap = dzap;
	}
	public double getTotalBrutto() {
		double s = 0;
		int size = pozycje.size();
		for(int i = 0; i <= size; i++) {
			s += pozycje.get(i).getBrutto();
			System.out.println(s);
		}
		return s;
	}
	public void addPoz(Pozycja poz) {
		pozycje.add(poz);
	}
}
