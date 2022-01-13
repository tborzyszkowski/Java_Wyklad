package wyklad._06kolekcje;

import java.util.*;

class Stack22 {
	private ArrayList items;

	public Stack22(int size) {
		items = new ArrayList(size);
	}

	void push(Object item) {
		items.add(item);
	}

	public Object pop() {
		int len = items.size();
		Object obj = null;
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

class Stack_1 {
	public static void main(String[] args) {
		Stack22 myStack = new Stack22(10);

		for (int i = 0; i < 15; i++) {
			myStack.push(new Integer(i));
			System.out.println(myStack);
		}
		myStack.push("Ala ma kota");
		System.out.println(myStack);

		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());

		System.out.println("Stos myStack:");
		for (int i = 0; i < 16; i++) {
			Object o = myStack.pop();
			if (o instanceof Integer) {
				System.out.println(((Integer) o).intValue() + 1);
				//System.out.println(""+o+1);
			} else
				System.out.println("String: " + o);
		}
		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());
	}
}
