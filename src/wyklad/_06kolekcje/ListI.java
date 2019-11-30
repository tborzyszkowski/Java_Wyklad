package wyklad._06kolekcje;
public interface List<E> extends Collection<E> {
    // Positional Access
    E get(int index);
    E set(int index, E element);    // Optional
    boolean add(E element);         // Optional
    void add(int index, E element); // Optional
    E remove(int index);            // Optional
    abstract boolean addAll(int index,
                            Collection<? extends E> c);  //Optional

    // Search
    int indexOf(Object o);
    int lastIndexOf(Object o);

    // Iteration
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);

    // Range-view
    List<E> subList(int from, int to);
}

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
