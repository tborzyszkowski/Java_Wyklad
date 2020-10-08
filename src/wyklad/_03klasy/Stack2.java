package wyklad._03klasy;

class Stack21 {
	private int stck[] = new int[10];
	private int top_of_stack;

	Stack21() {
		top_of_stack = -1;
	}

	void push(int item) {
		if (top_of_stack == 9)
			System.out.println("Stos pelen");
		else
			stck[++top_of_stack] = item;
	}

	int pop() {
		if (top_of_stack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stck[top_of_stack--];
	}
}

// Klasa testujaca stos

class Stack2 {
	public static void main(String args[]) {
		Stack21 myStack1 = new Stack21();
		Stack21 myStack2 = new Stack21();

		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 0; i < 12; i++)
			myStack2.push(i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack2.pop());

//		 myStack1.top_of_stack = -2;
//		 myStack2.stck[3] = 100;

	}
}
