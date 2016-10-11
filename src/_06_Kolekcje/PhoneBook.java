package _06_Kolekcje;
import java.io.*;
import java.util.*;

class PhoneBook {
	public static void main(String args[]) throws IOException {
		// klasa do obslugi par: (klucz, wartosc)
		// jest podklasa klasy Hashtable
		// dodatkowo posiada metody store() i load()
		// do zapisywania i odczytywania kolekcji ze strumienia
		Properties ht = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name, number;
		FileInputStream fin = null;
		boolean changed = false;

		// proba otworzenia pliku phonebook.dat
		try {
			fin = new FileInputStream("phonebook.dat");
		} catch (FileNotFoundException e) {
			// ignoruj brakujacy plik
		}
		// zaladuj plik jezeli istnieje
		try {
			if (fin != null) {
				ht.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			System.out.println("Blad odczytu!!!!");
		}
		System.out.println("Po zaladowaniu z pliku : " + ht);

		// uzytkownik wprowadza nowe dane
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

		// jezeli dane ulegly zmianie, zapisz je
		if (changed) {
			FileOutputStream fout = new FileOutputStream("phonebook.dat");

			ht.store(fout, "Ksiazka telefoniczna");
			fout.close();
		}

		// znajdz numer dla danej nazwy
		do {
			System.out.print("Podaj nazwe do wyszukania (lub stop): ");
			name = br.readLine();
			if (name.equals("stop"))
				continue;

			System.out.println(ht.get(name));
		} while (!name.equals("stop"));
	}
}
