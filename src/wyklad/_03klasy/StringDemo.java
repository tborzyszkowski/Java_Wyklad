package wyklad._03klasy;

class StringDemo {
	public static void main(String[] args) {
		String str = "Ala ma kota";//new String("Ala ma kota");
		String str2 = "Ala ma kota";//new String("Ala ma kota"); //"Ala ma kota";

		System.out.println(str == str2);
		System.out.println(str.equals(str2));

		str2 = str;
		System.out.println(str == str2);
		System.out.println(str.equals(str2));

		str = str + "AQQ";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));

		System.out.println();
		System.out.println("Pierwszy : " + str.length());
		System.out.println("Drugi    : "
				+ str.replaceAll("Ala", "Katarzyna").length() + "  "
				+ str.length());
		System.out.println("Trzeci   : "
				+ str.toLowerCase().equalsIgnoreCase(str));
		System.out.println("Czwarty  : " + str.toLowerCase().equals(str));
		System.out.println("Piaty    : "
				+ (new Character(str.charAt(2))).equals(
				new Character(str.charAt(10)))
		);
		System.out.println();
		String tab[] = {"Ala", "ma", "kota"};
		for (int i = 0; i < tab.length; i++)
			System.out.println("tab[" + i + "] = " + tab[i]);
		// a teraz znak po znaku
		System.out.println();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length(); j++)
				System.out.print(tab[i].charAt(j));
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();

	}
}
