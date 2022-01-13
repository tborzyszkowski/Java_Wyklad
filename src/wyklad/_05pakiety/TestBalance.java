package wyklad._05pakiety;

//import wyklad._05pakiety.MyPack2.*;
//import wyklad._05pakiety.MyPack1.*;

class TestBalance {
	public static void main(String[] args) {

		Balance current[] = new Balance[3];

		current[0] = new Balance("J.F.K", -8888.8888);
		current[1] = new Balance("W. Tell", 9989.9989);
		current[2] = new Balance("T.B.", 1212.1212);

		for (int i = 0; i < 3; i++)
			current[i].show();
	}
}
