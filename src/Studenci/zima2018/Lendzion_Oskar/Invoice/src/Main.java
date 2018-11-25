

import Model.*;


public class Main {
	
	public static void main(String[] args) {
		
		Rejestr rejestr = new Rejestr();
		
		Faktura faktura = new Faktura();
		
		
		//Dane kontrahent = new Dane("przykladowy kontrahent", new Adres("ulica", "warszawa", "00-420"), "654-752-61-47");

		
		faktura.dodajPozycje(new Pozycja("krzeslo", 2, 199.99));
		
		rejestr.Zapisz(faktura);
		
		Faktura telefony = new Faktura();
		
		telefony.setKontrahent(new Dane("nowy kontrahent", new Adres("ulica", "warszawa", "00-420"), "654-752-61-47"));
		
		telefony.dodajPozycje(new Pozycja("iPhoneX", 3, 4999.99)).dodajPozycje(new Pozycja("Galaxy S9", 2, 3799.99));
		
		rejestr.Zapisz(telefony);
		
		
		System.out.println("-1-\n Wyswietlanie faktury 'telefony' \n" + telefony + "\n");
		
		telefony.ilosc("iPhoneX", 2);
		
		System.out.println("-2\n zmiana ilosci szt w pozycji iPhone X \n" + telefony + "/n");
		
		telefony.usunPozycje(new Pozycja("Galaxy S9", 1, 3799.99));
		
		
		//System.out.println("-1-\n" + faktura);
		
		System.out.println("-3-\n usuniecie pozycji galaxy S9 \n" + telefony + "\n");
		

		
		System.out.println("-4-\n Wyswietlenie rejestru z wszyskimi zapisanymi fakturami \n" + rejestr + "\n");
		
		
		
		
	}

}
