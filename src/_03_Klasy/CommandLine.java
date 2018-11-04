package _03_Klasy;

// Przyklad dostepu do parametrow wywolania

class CommandLine {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++)
			System.out.println("arg[" + i + "] =" + args[i]);
	}
}
