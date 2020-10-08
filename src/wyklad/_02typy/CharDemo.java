package wyklad._02typy;

// demonstracja typu char
class CharDemo {
	public static void main(String args[]) {
		char ch1 = 88;
		char ch2 = 'Y';
		System.out.print("ch1   i ch2  : ");
		System.out.println(ch1 + "  " + ch2);
		System.out.println("ch1 + ch2 = "+ (ch1 + ch2) + " " + (char)(ch1 + ch2));
		// teraz cos egzotycznego
		ch1 = 261;
		ch2 = 'z';
		System.out.print("ch1   i ch2  : ");
		System.out.println(ch1 + "  " + ch2);
		System.out.print("ch1   i ch2  : ");
		System.out.println((int) ch1 + "  " + (int) ch2);

		ch1++;
		ch2++;
		System.out.print("ch1++ i ch2++: ");
		System.out.println(ch1 + "  " + ch2);
	}
}
