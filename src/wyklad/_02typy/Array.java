package wyklad._02typy;

// Demonstracja tablicy jednowymiarowej
class Array {
	public static void main(String args[]) {
		int month_days[];
		month_days = new int[14];
		// nadajemy wartosci
		month_days[0] = 31; // styczen
		month_days[1] = 28; // luty
		month_days[2] = 31; // marzec
		month_days[3] = 30; // kwiecien
		month_days[4] = 31; // maj
		month_days[5] = 30; // czerwiec
		month_days[6] = 31; // lipiec
		month_days[7] = 31; // sierpien
		month_days[8] = 30; // wrzesien
		month_days[9] = 31; // pazdziernik
		month_days[10] = 30; // listopad
		//month_days[11] = 31; // grudzien
		month_days[13] = 31; // PREMIA
		// korzystanie z tablicy
		System.out.println("Kwiecien ma " + month_days[10] + " dni");
		
		String s[];
		s = new String[3];
		s[0] = "sdrswserw";
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
}
