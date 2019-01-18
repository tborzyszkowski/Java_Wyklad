package kadry;

public class kierownik extends pracownik{
	double pensja,procent,kdk,wyplata;
	String nrtel,nrkom,nrpokoju,dzial;
	void printdanekier() { 
		printdane();
		wyplata = (pensja + (procent / 100) * pensja + kdk);
		System.out.println("pensja: "+ pensja);
		System.out.println("procent premii: " + procent);
		System.out.println("nr. telefonu: " + nrtel);
		System.out.println("nr. komórkowy: " + nrkom);
		System.out.println("nr. pokoju: " + nrpokoju);
		System.out.println("dział opieki: " + dzial);
		System.out.println("dodatek kierowniczy: " + kdk);
		System.out.println(wyplata);
}}