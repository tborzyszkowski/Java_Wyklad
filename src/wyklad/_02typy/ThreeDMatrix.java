package wyklad._02typy;

class ThreeDMatrix {
	public static void main(String[] args) {
		int[][][] threeD = new int[3][][];

		for (int i = 0; i < 3; i++) {
			threeD[i] = new int[i + 1][];
		}
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < i + 1; j++) {
				threeD[i][j] = new int[j + 1];
			}
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < i + 1; j++)
				for (int k = 0; k < j + 1; k++)
					threeD[i][j][k] = i * j * k;


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				for (int k = 0; k < j + 1; k++)
					System.out.print(threeD[i][j][k] + "\t");
				System.out.println();
			}
			System.out.println();
		}
	}
}
