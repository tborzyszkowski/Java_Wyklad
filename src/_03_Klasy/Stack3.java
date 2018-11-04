package _03_Klasy;

// implementacja stosow w oparciu o tablice
// wersja z kontrola dostepu i zastosowaniem atrybutu length
class Stack {
	// stos i wierzcholek sa prywatne
	private int stck[]; // TU: tablica bez rozmiaru
	private int top_of_stack;

	// TU: inicjalizacja stosu
	Stack(int size) {
		stck = new int[size];
		top_of_stack = -1;
	}

	int size() {
		return stck.length;
	}

	// wkladanie na stos
	void push(int item) {
		if (top_of_stack == stck.length - 1) // TU: badamy wielkosc stosu
			System.out.println("Stos pelen");
		else
			stck[++top_of_stack] = item;
	}

	// zdejmowanie ze stosu
	int pop() {
		if (top_of_stack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stck[top_of_stack--];
	}
}

// Klasa testujaca stos
class Stack3 {
	public static void main(String args[]) {
		Stack myStack1 = new Stack(5); // TU: mozemy inicjalizowac wielkosc
		Stack myStack2 = new Stack(8); // TU: tez

		// wkladamy liczby na stos
		for (int i = 0; i < myStack1.size(); i++)
			myStack1.push(i);
		for (int i = 0; i < myStack2.size(); i++)
			myStack2.push(i);

		myStack1.push(1111);
		myStack2.push(2222);
		
		// zdejmujemy ze stosow
		System.out.println("Stos myStack1:");
		for (int i = 0; i < myStack1.size(); i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < myStack2.size()+1; i++)
			System.out.println(myStack2.pop());
	}
}
