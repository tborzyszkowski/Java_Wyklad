package wyklad._04dziedziczenie;

class A_3 {
	String callMe() {
		return "Metoda klasy A";
	}
}

class B_3 extends A_3 {
	String callMe() {
		return "Metoda klasy B";
	}
}

class C_3 extends B_3 {
	String callMe() {
		return "Metoda klasy C";
	}
}

class DynMetod {
	public static void main(String[] args) {
		A_3 a = new A_3();
		B_3 b = new B_3();
		C_3 c = new C_3();

		A_3 r;

		r = a;
		System.out.println(r.callMe());

		r = b;
		System.out.println(r.callMe());

		r = c;
		System.out.println(r.callMe());

		r = a;
		System.out.println(r.callMe());
	}
}
