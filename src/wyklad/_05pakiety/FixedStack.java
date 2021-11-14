package wyklad._05pakiety;

class FixedStack implements IntStack {

	private int[] elements;
	private int topOfStack;

	FixedStack(int size) {
		elements = new int[size];
		topOfStack = -1;
	}

	public void push(int item) {
		if (topOfStack == elements.length - 1)
			System.out.println("Stos pełen");
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

class IFTest {
	public static void main(String[] args) {
		FixedStack myStack1 = new FixedStack(5);
		FixedStack myStack2 = new FixedStack(8);

		for (int i = 0; i < 5; i++)
			myStack1.push(i * i);
		for (int i = 0; i < 8; i++)
			myStack2.push(i + i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack2.pop());
	}
}
