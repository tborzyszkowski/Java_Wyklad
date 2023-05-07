package wyklad._04dziedziczenie;

class AF {
	final void finalMethod() {
		System.out.println("To jest metoda finalna");
	}
}
class BF extends AF {
//	final void finalMethod() {
//		System.out.println("To jest nielegalne");
//	}
}
class FinalMethod {
	public static void main(String[] args) {
		AF a = new AF();
		BF b = new BF();

		a.finalMethod();
		b.finalMethod();
	}
}
