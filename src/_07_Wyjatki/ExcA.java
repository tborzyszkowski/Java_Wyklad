package _07_Wyjatki;
class  ExcA {
	static void procA() throws RuntimeException{
		int a = 1;
		try {
			System.out.println("Wewnatrz procA: "+ a);
			a++;
			throw new RuntimeException("To tylko test: "+ a);
		}
		catch (RuntimeException e) {
			a++;
			System.out.println("Wewnatrz catch: "+ a + " e: "+ e);
			throw e;
		}
		finally {
			System.out.println("finally w procA: "+ (++a));
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

	static Integer procB() {
		Integer a = 1;
		try {
			System.out.println("Wewnatrz procB: " + a);
			return a++;
		} 
		finally {
			System.out.println("finally w procB-1: " + a);
			a++;
			System.out.println("finally w procB-2: " + a);
		}
	}
	static void procC() {
		try {
			System.out.println("Wewnatrz procC");
		} finally {
			System.out.println("finally w procC");
		}
	}	    
	public static void main(String args[]) {
//		try {
//			procA();
//		}
//		catch (Exception e) {
//			System.out.println("Main: wyjatek z procA obsłużony"+e);
//		}
//		System.out.println("B: " + procB());
		procC();
	}
}
