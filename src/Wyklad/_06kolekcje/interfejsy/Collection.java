package wyklad._06kolekcje.interfejsy;

public interface Collection<E> extends Iterable<E> {
    // Basic Operations
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);         // Optional
    boolean remove(Object element); // Optional
    Iterator iterator();
    
    // Bulk Operations

    // Returns true if the target Collection contains 
    // all of the elements in the specified Collection.
    boolean containsAll(Collection<?> c);

    // Adds all the elements in the specified Collection 
    // to the target Collection. 
    boolean addAll(Collection<? extends E> c); // Optional

    // Removes from the target Collection all its elements 
    // that are also contained in the specified Collection.
    boolean removeAll(Collection<?> c);        // Optional

    // Removes from the target Collection all its elements 
    // that are not also contained in the specified Collection. 
    // That is, it retains in the target Collection only 
    // those elements that are also contained in the specified Collection.
    boolean retainAll(Collection<?> c);        // Optional

    // Removes all elements from the Collection.
    void clear(); // Optional
    
    // Array Operations
    Object[] toArray();

    // Parameters:
    //    a - the array into which the elements of this collection 
    //        are to be stored, if it is big enough; otherwise, 
    //        a new array of the same runtime type is allocated 
    //        for this purpose. 
    // Returns:
    //    an array containing the elements of this collection
    <T> T[] toArray(T[] a);
}

