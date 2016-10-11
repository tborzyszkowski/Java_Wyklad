package _06_Kolekcje;
// Queues typically, but do not necessarily, order elements 
// in a FIFO (first-in-first-out) manner. 
public interface Queue<E> extends Collection<E> {
    // Retrieves, but does not remove, the head of this queue.
    E element();
    // Inserts the specified element into this queue, if possible
    boolean offer(E o);
    // Retrieves, but does not remove, the head of this queue, 
    // returning null if this queue is empty
    E peek();
    // Retrieves and removes the head of this queue, 
    // or null  if this queue is empty
    E poll();
    // Retrieves and removes the head of this queue
    E remove();
}
