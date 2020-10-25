package wyklad._03klasy;

class Stack21 {
	private int elements[] = new int[10];
	private int topOfStack;

	Stack21() {
		topOfStack = -1;
	}

	public void push(int item) {
		if (topOfStack == 9)
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

//		 myStack1.topOfStack = -2;
//		 myStack2.elements[3] = 100;

	}
}
