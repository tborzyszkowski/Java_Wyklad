package wyklad._06kolekcje.interfejsy;

// -------------------------------------------
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove(); // Optional: removes the last element
    //                          that was returned by next.
}
