package wyklad._03klasy;

class Stack {
	private int[] elements;
	private int topOfStack;

	public Stack(int size) {
		elements = new int[size];
		topOfStack = -1;
	}

	public int size() {
		return elements.length;
	}

	public void push(int item) {
		if (topOfStack == elements.length - 1)
			System.out.println("Stos pelen");
		else
			elements[++topOfStack] = item;
	}

	public int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return elements[topOfStack--];
	}
}

class Stack3 {
	public static void main(String args[]) {
		Stack myStack1 = new Stack(5);
		Stack myStack2 = new Stack(8);

		for (int i = 0; i < myStack1.size(); i++)
			myStack1.push(i);
		for (int i = 0; i < myStack2.size(); i++)
			myStack2.push(i);

		myStack1.push(1111);
		myStack2.push(2222);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < myStack1.size(); i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < myStack2.size() + 1; i++)
			System.out.println(myStack2.pop());
	}
}
