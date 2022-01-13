package wyklad._06kolekcje;

import java.util.*;

class Stack33<T> {
	private ArrayList<T> items;

	public Stack33(int size) {
		items = new ArrayList<T>(size);
	}

	void push(T item) {
		items.add(item);
	}

	public T pop() {
		int len = items.size();
		T obj = null;
		if (len == 0)
			throw new EmptyStackException();
		obj = items.get(len - 1);
		items.remove(len - 1);
		return obj;
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	@Override
	public String toString() {
		return "Stack22{" +
				"size: " + items.size() +
				", items=" + items +
				'}';
	}

}

class Stack_1G {
	public static void main(String[] args) {
		Stack33<Number> myStack = new Stack33<Number>(10);

		for (int i = 0; i < 15; i++) {
			myStack.push(new Integer(i));
			System.out.println(myStack);
		}

		myStack.push(new Long(1));
		System.out.println(myStack);
		myStack.push(new Double(3.14));
		System.out.println(myStack);
//		myStack.push("Ala ma kota");

		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());

		System.out.println("Stos myStack:");
		for (int i = 0; i < 17; i++)
			System.out.println(myStack.pop().intValue() + 1);

		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());
	}
}
