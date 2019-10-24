package wyklad._02typy;

// Demonstracja tablicy jednowymiarowej
class Array {
	public static void main(String args[]) {
		int monthDays[];
		monthDays = new int[14];
		// nadajemy wartosci
		monthDays[0] = 31; // styczen
		monthDays[1] = 28; // luty
		monthDays[2] = 31; // marzec
		monthDays[3] = 30; // kwiecien
		monthDays[4] = 31; // maj
		monthDays[5] = 30; // czerwiec
		monthDays[6] = 31; // lipiec
		monthDays[7] = 31; // sierpien
		monthDays[8] = 30; // wrzesien
		monthDays[9] = 31; // pazdziernik
		monthDays[10] = 30; // listopad
		//month_days[11] = 31; // grudzien
		monthDays[13] = 31; // PREMIA
		// korzystanie z tablicy
		System.out.println("Kwiecien ma " + monthDays[10] + " dni");
		
		String s[];
		s = new String[3];
		s[0] = "sdrswserw";
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
}
