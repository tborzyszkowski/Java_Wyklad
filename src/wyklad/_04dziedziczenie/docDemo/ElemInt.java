package wyklad._04dziedziczenie.docDemo;

/**
 * Klasa elementów do posortowania.
 *   @author Jan Kowalski
 *   @version 1.0    
 */
public class ElemInt extends Element {
    /** 
     * Stan obiektu - sortowany element.
     */
    private int x;
    /** 
     * Konstruktor klasy 
     * @param i stan tworzonego obiektu
     */
    public ElemInt(int i) {
	x = i;
    }
    /**
     * Metoda zwraca stan obiektu
     * @return Stan obiektu
     */
    public int getElem() {
	return x;
    }
    /** 
     *  Metoda porównująca wymagana przez interfejs Comparable
     *  @return 1 = wieksze; 0 = równe; -1 = mniejsze
     *  czasem wymaga się by (a.compareTo(e)==0) == (a.equals(e))
     */
    public int compareTo(Object e) {
	if (this.x >((ElemInt) e).getElem()) return 1;
	else if (this.x ==((ElemInt)e).getElem()) return 0;
	else return -1;
    }
    /**
     * Reprezentacja elementu jako String
     * @return String opisujący element
     */
    public String toString() {
	return x + " ";
    }
}
