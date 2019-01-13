package kadry;

public class umyslowy extends pracownik{
	double pensja,procent,wyplata;
	String nrtel,nrpokoju;
	void printdaneumys() { 
		printdane();
		wyplata = (pensja + (procent / 100) * pensja);
		System.out.println("pensja: "+ pensja);
		System.out.println("procent premii: " + procent);
		System.out.println("nr. telefonu: " + nrtel);
		System.out.println("nr. pokoju: " + nrpokoju);
		System.out.println(wyplata);
	}
}