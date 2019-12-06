package wyklad._05pakiety;

class DynStack implements IntStack {

	private int stck[];
	private int top_of_stack;

	DynStack(int size) {
		stck = new int[size];
		top_of_stack = -1;
	}

	public void push(int item) {
		// jezeli stos jest pelen, to zarezerwuj wiekszy stos
		if (top_of_stack == stck.length - 1) {
			int temp[] = new int[stck.length * 2]; // dwa razy wiekszy
			for (int i = 0; i < stck.length; i++)
				temp[i] = stck[i];
			stck = temp;
			System.out.println("Nowy rozmiar stosu: " + stck.length);
		}
		stck[++top_of_stack] = item;
	}

	public int pop() {
		if (top_of_stack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stck[top_of_stack--];
	}
}

class IFTest2 {
	public static void main(String args[]) {
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
	public static void main(String args[]) {
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
