package wyklad._06kolekcje;
import java.io.*;
import java.util.*;

class PhoneBook {
	public static void main(String[] args) throws IOException {
		Properties ht = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name, number;
		FileInputStream fin = null;
		boolean changed = false;

		try {
			fin = new FileInputStream("phonebook.dat");
		} catch (FileNotFoundException e) {
		}
		try {
			if (fin != null) {
				ht.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			System.out.println("Blad odczytu!!!!");
		}
		System.out.println("Po zaladowaniu z pliku : " + ht);

		do {
			System.out.print("Wprowadz nowa nazwe (lub stop): ");
			name = br.readLine();
			if (name.equals("stop"))
				continue;

			System.out.print("Wprowadz nr telefonu          : ");
			number = br.readLine();

			ht.put(name, number);
			changed = true;
		} while (!name.equals("stop"));

		if (changed) {
			FileOutputStream fout = new FileOutputStream("phonebook.dat");

			ht.store(fout, "Ksiazka telefoniczna");
			fout.close();
		}

		do {
			System.out.print("Podaj nazwe do wyszukania (lub stop): ");
			name = br.readLine();
			if (name.equals("stop"))
				continue;

			System.out.println(ht.get(name));
		} while (!name.equals("stop"));
	}
}
