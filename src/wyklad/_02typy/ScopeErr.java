package wyklad._02typy;

class ScopeErr {
	public static void main(String[] args) {
//		int x = 1;
		{
			int y = 1;
			int x = 2;
		}
		int y = 2;
		int x = 5;
	}
}
