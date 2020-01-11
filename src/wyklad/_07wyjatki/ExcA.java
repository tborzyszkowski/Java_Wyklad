package wyklad._07wyjatki;

class ExcA {
	static void procA() throws RuntimeException {
		int a = 1;
		try {
			System.out.println("Wewnatrz procA: " + a);
			a++;
			throw new RuntimeException("To tylko test: " + a);
		} catch (RuntimeException e) {
			a++;
			System.out.println("Wewnatrz catch: " + a + " e: " + e);
			throw e;
		} finally {
			System.out.println("finally w procA: " + (++a));
			//a = a / (a-a);
		}
	}

//	static int procB() {
//		int a = 1;
//		try {
//			System.out.println("Wewnatrz procB");
//			return a++;
//		}
//		finally {
//			System.out.println("finally w procB: " + a);
//			a++;
//		}
//	}

//	static Integer procB() {
//		Integer a = 1;
//		try {
//			System.out.println("Wewnatrz procB: " + a + ": " + a.hashCode());
//			return a++;
//		}
//		finally {
//			System.out.println("finally w procB-1: " + a + ": " + a.hashCode());
//			a++;
//			System.out.println("finally w procB-2: " + a + ": " + a.hashCode());
//		}
//	}

//	static class IntWrapper {
//		private int val;
//
//		public IntWrapper(int val) {
//			this.val = val;
//		}
//		public IntWrapper Inc() {val++; return this;}
//
//		public int getVal() {
//			return val;
//		}
//
//		public void setVal(int val) {
//			this.val = val;
//		}
//		@Override
//		public String toString() {
//			return "" + val;
//		}
//	}
//
//	static IntWrapper procB() {
//		IntWrapper a = new IntWrapper(1);
//
//		try {
//			System.out.println("Wewnatrz procB: " + a + ": " + a.hashCode());
//			return a.Inc();
//		} finally {
//			System.out.println("finally w procB-1: " + a + ": " + a.hashCode());
//			a.Inc();
//			System.out.println("finally w procB-2: " + a + ": " + a.hashCode());
//		}
//	}

//	static void procC() {
//		try {
//			System.out.println("Wewnatrz procC");
//		} finally {
//			System.out.println("finally w procC");
//		}
//	}

	public static void main(String args[]) {
		try {
			procA();
		}
		catch (Exception e) {
			System.out.println("Main: wyjatek z procA obsłużony"+e);
		}
//		System.out.println("B: " + procB());
//		procC();
	}
}
