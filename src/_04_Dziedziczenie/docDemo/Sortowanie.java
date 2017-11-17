package _04_Dziedziczenie.docDemo;

// Przykład prostego ADT

/**
 * Klasa nadrzędna elementów, które bedziemy chcieli sortować. Niczego nie
 * zawiera. Każda klasa potomna musi implementować metodę int compareTo(Object
 * o);
 * 
 * @author Tomasz Borzyszkowski
 * @version 1.0
 */

abstract class ElementA implements Comparable {

}

/**
 * Klasa sortująca elementy typu Element.
 * 
 * @see Element
 * @version 1.0
 */

class Sortuj {
	/**
	 * Zmienne prywatne klasy sortującej
	 */
	private ElementA elms[];
	private int indeksy[];

	/**
	 * Konstruktor klasy
	 * 
	 * @param dlugość
	 *            ilość elementów do posortowania
	 */
	public Sortuj(int dlugosc) {
		elms = new ElementA[dlugosc];
		indeksy = new int[dlugosc];
		for (int i = 0; i < dlugosc; i++)
			indeksy[i] = i;
	}

	/**
	 * Dodaje elementy do posortowania UWAGA: brak sprawdzania zakresów
	 * 
	 * @param e
	 *            dodawany element klasy potomnej @see Element
	 * @param i
	 *            miejsce, na które wstawiamy element wyznaczone przez tablicę
	 *            indeksy
	 * @return nic
	 */
	public void dodajNa(ElementA e, int i) {
		elms[indeksy[i]] = e;
	}

	/**
	 * Reprezentacja sortowanej tablicy jako String
	 * 
	 * @return String opisujący tablicę
	 */
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < elms.length; i++)
			s = s.append((elms[indeksy[i]]).toString());
		return s.toString();
	}

	/**
	 * Metoda sortująca. Nie zmienia tablicy elementów. Zamienia tylko indeksy w
	 * pośredniej tablicy indeksów.
	 * 
	 * @return nic
	 */
	public void sortuj() {
		for (int i = 0; i < elms.length - 1; i++) {
			int k = i;
			int x = indeksy[i];
			for (int j = i + 1; j < elms.length; j++)
				if ((elms[x]).compareTo(elms[indeksy[j]]) > 0) {
					k = j;
					x = indeksy[j];
				}
			indeksy[k] = indeksy[i];
			indeksy[i] = x;
		}
	}
}

/**
 * Klasa elementów do posortowania.
 * 
 * @version 1.0
 */
class ElemIntEx extends ElementA {
	/**
	 * Stan obiektu - sortowany element.
	 */
	private int x;

	/**
	 * Konstruktor klasy
	 * 
	 * @param i
	 *            stan tworzonego obiektu
	 */
	public ElemIntEx(int i) {
		x = i;
	}

	/**
	 * Metoda zwraca stan obiektu
	 * 
	 * @return Stan obiektu
	 */
	public int getElem() {
		return x;
	}

	/**
	 * Metoda porównująca wymagana przez interfejs Comparable
	 * 
	 * @return 1 = wieksze; 0 = równe; -1 = mniejsze czasem wymaga się by
	 *         (a.compareTo(e)==0) == (a.equals(e))
	 */
	public int compareTo(Object e) {
		if (this.x > ((ElemIntEx) e).getElem())
			return 1;
		else if (this.x == ((ElemIntEx) e).getElem())
			return 0;
		else
			return -1;
	}

	/**
	 * Reprezentacja elementu jako String
	 * 
	 * @return String opisujący element
	 */
	public String toString() {
		return x + " ";
	}
}

/**
 * Klasa tastująca sortowanie elementów
 * 
 * @version 1.0
 */
class SortTest2 {
	/**
	 * Metoda demonstrująca sortowanie 20 elementów typu
	 * 
	 * @see ElemInt
	 * @param args
	 *            nieużywane
	 * @return nic
	 */
	public static void main(String args[]) {
		Sortuj srt = new Sortuj(20);
		// wkładamy 20 elementów
		srt.dodajNa((new ElemIntEx(91)), 0);
		srt.dodajNa((new ElemIntEx(22)), 1);
		srt.dodajNa((new ElemIntEx(4)), 2);
		srt.dodajNa((new ElemIntEx(67)), 3);
		srt.dodajNa((new ElemIntEx(11)), 4);
		srt.dodajNa((new ElemIntEx(1)), 5);
		srt.dodajNa((new ElemIntEx(46)), 6);
		srt.dodajNa((new ElemIntEx(13)), 7);
		srt.dodajNa((new ElemIntEx(77)), 8);
		srt.dodajNa((new ElemIntEx(33)), 9);
		srt.dodajNa((new ElemIntEx(96)), 10);
		srt.dodajNa((new ElemIntEx(28)), 11);
		srt.dodajNa((new ElemIntEx(7)), 12);
		srt.dodajNa((new ElemIntEx(61)), 13);
		srt.dodajNa((new ElemIntEx(18)), 14);
		srt.dodajNa((new ElemIntEx(2)), 15);
		srt.dodajNa((new ElemIntEx(41)), 16);
		srt.dodajNa((new ElemIntEx(12)), 17);
		srt.dodajNa((new ElemIntEx(71)), 18);
		srt.dodajNa((new ElemIntEx(39)), 19);
		// wypisujemy elementy przez sortowaniem
		System.out.println(srt.toString());
		srt.sortuj(); // teraz sortujemy
		// wypisujemy posortowane
		System.out.println(srt.toString());
	}
}
