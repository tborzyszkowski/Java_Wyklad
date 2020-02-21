package wyklad._02typy;

// Demonstracja dwuwymiarowej tablicy
class TwoDArray {
	public static void main(String args[]) {
		int twoD[][] = new int[4][5];
		int i, j, k = 0;

		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + "\t");
			System.out.println();
		}
	}
}
