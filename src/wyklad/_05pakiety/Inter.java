package wyklad._05pakiety;

interface II {
	int i = 0;
}

interface II1 extends II {
	int i = 1;
}

interface II2 extends II {
	int i = 2;
}

class AQQ implements II1, II2 {
	public static void main(String[] a) {
		II2 aa = new AQQ();
		System.out.println("i = " + II2.i);
		System.out.println("i = " + aa.i);
	}
}