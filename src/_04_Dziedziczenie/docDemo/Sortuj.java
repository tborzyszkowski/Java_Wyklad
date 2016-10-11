package _04_Dziedziczenie.docDemo;

class SortujEx {
    /** 
     * Zmienne prywatne klasy sortującej
     */
    private Element elms[];
    private int indeksy[];

    /** 
     * Konstruktor klasy 
     * @param dlugosc ilość elementów do posortowania
     */
    public SortujEx(int dlugosc){
	elms = new Element[dlugosc];
	indeksy = new int[dlugosc];
	for(int i = 0; i < dlugosc; i++) 
	    indeksy[i] = i;
    }
    /**
     *  Dodaje elementy do posortowania
     *  UWAGA: brak sprawdzania zakresów
     *  @param e dodawany element klasy potomnej @see Element
     *  @param i miejsce, na które wstawiamy element wyznaczone 
     *  przez tablicę indeksy
     *  @return nic
     */
    public void dodajNa(Element e, int i) {
	elms[indeksy[i]] = e;
    }
    /**
     * Reprezentacja sortowanej tablicy jako String
     * @return String opisujący tablicę
     */
    public String toString() {
	StringBuffer s = new StringBuffer();
	for(int i = 0; i < elms.length; i++)
	    s = s.append((elms[indeksy[i]]).toString());
	return s.toString();
    }
    /** 
     * Metoda sortująca. Nie zmienia tablicy elementów. 
     * Zamienia tylko indeksy w pośredniej tablicy indeksów.
     * @return nic
     */
    public void sortuj() {
	for(int i = 0; i < elms.length - 1; i++) {
	    int k = i;  
	    int x = indeksy[i];
	    for(int j = i+1; j < elms.length; j++) 
		if ((elms[x]).compareTo(elms[indeksy[j]]) > 0) {
		    k = j;
		    x = indeksy[j];
		}
	    indeksy[k] = indeksy[i]; 
	    indeksy[i] = x;
	}
    }
}
