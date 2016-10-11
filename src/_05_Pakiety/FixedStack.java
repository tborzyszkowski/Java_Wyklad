package _05_Pakiety;

// implementacja stosu o stalej wielkosci
class FixedStack implements IntStack {

	private int stck[];
	private int top_of_stack;

	FixedStack(int size) {
		stck = new int[size];
		top_of_stack = -1;
	}

	// wkladanie na stos
	public void push(int item) {
		if (top_of_stack == stck.length - 1)
			System.out.println("Stos pelen");
		else
			stck[++top_of_stack] = item;
	}

	// zdejmowanie ze stosu
	public int pop() {
		if (top_of_stack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stck[top_of_stack--];
	}
}

// klasa testujaca
class IFTest {
	public static void main(String args[]) {
		FixedStack myStack1 = new FixedStack(5);
		FixedStack myStack2 = new FixedStack(8);

		// wkladamy liczby na stos
		for (int i = 0; i < 5; i++)
			myStack1.push(i * i);
		for (int i = 0; i < 8; i++)
			myStack2.push(i + i);

		// zdejmujemy ze stosow
		System.out.println("Stos myStack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 8; i++)
			System.out.println(myStack2.pop());
	}
}
