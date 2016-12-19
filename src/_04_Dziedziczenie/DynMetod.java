package _04_Dziedziczenie;
// Przyklad dynamicznego wiazania metod

class A_3 {
	void callMe() {
		System.out.println("Metoda klasy A");
	}
}
class B_3 extends A_3 {
	void callMe() {
		System.out.println("Metoda klasy B");
	}
}
class C_3 extends B_3 {
	void callMe() {
		System.out.println("Metoda klasy C");
	}
}
class DynMetod {
	public static void main(String args[]) {
		A_3 a = new A_3(); // obiekt klasy A_3
		B_3 b = new B_3(); // obiekt klasy B_3
		C_3 c = new C_3(); // obiekt klasy C_3

		A_3 r; // referencja klasy A (nadrzednej)

		r = a; // wskazujemy na obiekt klasy A
		r.callMe(); // wywolanie wersji A callMe

		r = b; // wskazujemy na obiekt klasy B
		r.callMe(); // wywolanie wersji B callMe

		r = c; // wskazujemy na obiekt klasy C
		r.callMe(); // wywolanie wersji C callMe

		r = a; // wskazujemy na obiekt klasy A
		r.callMe(); // wywolanie wersji A callMe
	}
}
