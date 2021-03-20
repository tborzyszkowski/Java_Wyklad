package wyklad._05pakiety;

class DynStack implements IntStack {

	private int[] element;
	private int topOfStack;

	DynStack(int size) {
		element = new int[size];
		topOfStack = -1;
	}

	public void push(int item) {
		if (topOfStack == element.length - 1) {
			int[] temp = new int[element.length * 2];
			for (int i = 0; i < element.length; i++)
				temp[i] = element[i];
			element = temp;
			System.out.println("Nowy rozmiar stosu: " + element.length);
		}
		element[++topOfStack] = item;
	}

	public int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return element[topOfStack--];
	}
}

class IFTest2 {
	public static void main(String[] args) {
		DynStack myStack1 = new DynStack(5);
		DynStack myStack2 = new DynStack(8);

		for (int i = 0; i < 12; i++)
			myStack1.push(i * i);
		for (int i = 0; i < 20; i++)
			myStack2.push(i + i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 20; i++)
			System.out.println(myStack2.pop());
	}
}

class IFTest3 {
	public static void main(String[] args) {
		IntStack myStack;
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);

		myStack = ds;
		for (int i = 0; i < 11; i++)
			myStack.push(i);

		myStack = fs;
		for (int i = 0; i < 8; i++)
			myStack.push(i);

		myStack = ds;
		System.out.println("Stos o zmiennej wielkosci: ");
		for (int i = 0; i < 11; i++)
			System.out.println(myStack.pop());

		myStack = fs;
		System.out.println("Stos o stalej wielkosci: ");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack.pop());
	}
}
