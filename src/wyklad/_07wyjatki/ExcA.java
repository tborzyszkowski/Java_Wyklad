package wyklad._07wyjatki;

class IntWrapper {
	private int val;
	public IntWrapper(int val) {
		this.val = val;
	}
	public IntWrapper Inc() {val++; return this;}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "" + val;
	}
}

class ExcA {
//	static void procA() throws RuntimeException {
//		int a = 1;
//		try {
//			System.out.println("Wewnatrz procA: " + a);
//			a++;
//			if(a < a * a)
//				throw new RuntimeException("To tylko test: " + a);
//		} catch (RuntimeException e) {
//			a++;
//			System.out.println("Wewnatrz catch: " + a + " e: " + e);
//			throw e;
//		} finally {
//			System.out.println("finally w procA: " + (++a));
////			a = a / (a-a);
//		}
//		System.out.println("Po try-catch-finally");
//	}

//	static int procB() {
//		int a = 1;
//		try {
//			System.out.println("Wewnatrz procB: " + a);
//			return ++a;
//		}
//		finally {
//			a++;
//			System.out.println("finally w procB: " + a);
//		}
//	}

//	static Integer procB() {
//		Integer a = 1;
//		try {
//			System.out.println("Wewnatrz procB-1:  " + a + ": " + a.hashCode());
//			return ++a;
//		}
//		finally {
//			System.out.println("finally w procB-1: " + a + ": " + a.hashCode());
//			a++;
//			System.out.println("finally w procB-2: " + a + ": " + a.hashCode());
//		}
//	}



	static IntWrapper procB() {
		IntWrapper a = new IntWrapper(1);

		try {
			System.out.println("Wewnatrz procB-0:  " + a + ": " + a.hashCode());
			return a.Inc();
		} finally {
			System.out.println("finally w procB-1: " + a + ": " + a.hashCode());
			a.Inc();
			System.out.println("finally w procB-2: " + a + ": " + a.hashCode());
		}
	}
	static Integer procBB() {
		Integer a = new Integer(1);

		try {
			System.out.println("Wewnatrz procBB-0:  " + a + ": " + a.hashCode());
			return ++a;
		} finally {
			System.out.println("finally w procBB-1: " + a + ": " + a.hashCode());
			++a;
			System.out.println("finally w procBB-2: " + a + ": " + a.hashCode());
		}
	}

	static void procC() {
		try {
			System.out.println("Wewnatrz procC");
		} finally {
			System.out.println("finally w procC");
		}
	}

	public static void main(String[] args) {
//		try {
//			procA();
//		}
//		catch (Exception e) {
//			System.out.println("Main: wyjatek z procA obsłużony"+e);
//		}
		System.out.println("B:  " + procB());
//		System.out.println("BB: " + procBB());
//		Integer x = 1;
//		Integer y = 1;
//		System.out.println((x == y) + " " + (x.hashCode() == y.hashCode()));
//		Integer z = x+1;
//		System.out.println((x == z) + " " + (x.hashCode() == z.hashCode()));
//		procC();
	}
}
