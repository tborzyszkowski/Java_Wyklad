package wyklad._06kolekcje.interfejsy;

// ------------------------------------------
public interface ListIterator<E> extends Iterator<E> {
    boolean hasNext();
    E next();
    boolean hasPrevious();
    E previous();
    int nextIndex();
    int previousIndex();

    // Removes from the list the last element that
    // was returned by next or previous
    void remove(); // Optional

    // Replaces the last element returned by next
    // or previous with the specified element
    void set(E o); // Optional
    void add(E o); // Optional
}
