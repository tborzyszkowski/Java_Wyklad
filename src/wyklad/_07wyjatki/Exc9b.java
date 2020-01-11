package wyklad._07wyjatki;
class Exc9b {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Wewnątrz metody");
		throw new IllegalAccessException("To tylko test");
	}

	public static void main(String args[])// throws IllegalAccessException
	{
		try {
			throwOne();
			int a = 1 /0;
		} 
		catch (IllegalAccessException e) {
			System.out.println("Obsłużyłem: ");
			e.printStackTrace();
			System.out.println("Komunikat wyjątku  : " + e.getMessage());
			//throw e;
		} 		
		catch (ArithmeticException e) {}
		catch (Exception e) {}

	}
}
