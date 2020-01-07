package _07_Wyjatki;

class MyException11 extends Exception {
	
	private static final long serialVersionUID = 231231L;
	
	private int detail;

	MyException11(int a) {
		detail = a;
	}

	public int getDetail() {
		return detail;
	}

	public String toString() {
		return "MyException[" + detail + "]";
	}
}

class ExcC {
	static void oblicz(int a) throws MyException11 {
		System.out.println("Wywołanie oblicz(" + a + ")");
		if (a > 10)
			throw new MyException11(a);
		System.out.println("Normalne zakończenie");
	}

	public static void main(String args[]) {
		try {
			oblicz(1);
			oblicz(20);
		} catch (MyException11 e) {
			System.out.println("Obsługa wyjątku: " + e);
			e.printStackTrace();
			System.out.println("e.detail: " + e.getDetail());
		}
	}
}
