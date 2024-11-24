package wyklad._05pakiety.MyPack;

import wyklad._05pakiety.MyPack1.*;
import wyklad._05pakiety.MyPack2.*;

class AccountBalance {
	public static void main(String[] args) {
		IBalance[] current = new wyklad._05pakiety.MyPack1.Balance[3];

		current[0] = new wyklad._05pakiety.MyPack1.Balance("J.F.K", 123.123);
		current[1] = new wyklad._05pakiety.MyPack1.Balance("W. Tell", -150.150);
		current[2] = new wyklad._05pakiety.MyPack2.Balance("T.B.", 111.222);

		for (int i = 0; i < 3; i++)
			current[i].show();
	}
}
