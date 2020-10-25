package wyklad._03klasy;

class Stack1 {
	int stck[] = new int[10];
	int top_of_stack;

	Stack1() {
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

class StackTest1 {
	public static void main(String args[]) {
		Stack1 myStack1 = new Stack1();
		Stack1 myStack2 = new Stack1();

		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 0; i < 20; i++)
			myStack2.push(i);

		myStack1.stck[2] = 117;

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());
	}
}
