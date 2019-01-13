package kadry;

public class wyplata {
	public static void main(String[] args) {
	static void fizycznywyplata(double stawkagodzinowa, int lpg, int lng) {
	System.out.printf(stawkagodzinowa * lpg + 1,5 * stawkagodzinowa * lng);
	}
	
	/*case "umyslowy":
		prt(pensja + (procent / 100) * pensja);
	case "kierownik":
		prt(pensja + (procent / 100) * pensja + kdk);
	case "czlonekzarzadu":
		prt(pensja + iloscspotkan * 1000);
	case "praktykant":
		if (stypendium == true) {
			prt("500");
		}
		else {
			prt("0");
		}
		default:
		prt("błąd");
	}*/
static void prt(String s) {
System.out.println(s);
}
}