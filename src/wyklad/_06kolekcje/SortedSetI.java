package wyklad._06kolekcje;
public interface SortedSet<E> extends Set<E> {
    //Range-view
    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);
    SortedSet<E> tailSet(E fromElement);

    //Endpoints
    E first();
    E last();

    //Comparator access
    Comparator<? super E> comparator();
}
