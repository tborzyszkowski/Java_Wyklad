package wyklad._06kolekcje.interfejsy;

public interface List<E> extends wyklad._06kolekcje.interfejsy.Collection<E> {
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

