package _04_Dziedziczenie.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b2 = new BB();
		BBB b3 = new BBB();
		a = b2;
//		a = b3;
		b3 = (BBB)a;
	}

}
