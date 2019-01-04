package _04_Dziedziczenie;

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
		A_3 a = new A_3(); 
		B_3 b = new B_3(); 
		C_3 c = new C_3(); 

		A_3 r; 

		r = a; 
		r.callMe(); 

		r = b; 
		r.callMe(); 

		r = c; 
		r.callMe(); 

		r = a; 
		r.callMe(); 
	}
}
