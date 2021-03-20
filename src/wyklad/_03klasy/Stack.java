package wyklad._03klasy;

class Stack1 {
	int[] stack = new int[10];
	int topOfStack;

	Stack1() {
		topOfStack = -1;
	}

	void push(int item) {
		if (topOfStack == 9)
			System.out.println("Stos pelen");
		else
			stack[++topOfStack] = item;
	}

	int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stack[topOfStack--];
	}
}

class StackTest1 {
	public static void main(String[] args) {
		Stack1 myStack1 = new Stack1();
		Stack1 myStack2 = new Stack1();

		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 0; i < 20; i++)
			myStack2.push(i);

		myStack1.stack[2] = 117;

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());
	}
}
