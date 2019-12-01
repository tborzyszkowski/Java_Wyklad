package wyklad._06kolekcje.interfejsy;

public interface Set<E> extends wyklad._06kolekcje.interfejsy.Collection<E> {
    // Basic Operations
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);         // Optional
    boolean remove(Object element); // Optional
    Iterator iterator();

    // Bulk Operations
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c); // Optional
    boolean removeAll(Collection<?> c);        // Optional
    boolean retainAll(Collection<?> c);        // Optional
    void clear();                              // Optional

    // Array Operations
    Object[] toArray();
    <T> T[] toArray(T[] a);
}
