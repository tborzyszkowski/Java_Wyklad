package kadry;

public class czlonekzarzadu extends pracownik{
	double pensja,wyplata;
	int iloscspotkan;
	void printdanecz() { 
		printdane();
		wyplata = (pensja + iloscspotkan * 1000);
		System.out.println("pensja: "+ pensja);
		System.out.println("ilosc spotkan: : "+ iloscspotkan);
		System.out.println("wyplatta: " + wyplata);
	}
		
}