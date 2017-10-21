package _03_Klasy;

// Przyklad przekazywania obiektow jako parametrow 
// i oddawania ich jako wartosci metod

class PassOb {
	int a, b;
	PassOb(int i, int j) {
		a = i;
		b = j;
	}
	PassOb(PassOb o) {
		a = o.a;
		b = o.b;
	}
	boolean equals(PassOb o) {
		if (o.a == this.a && o.b == b)
			return true;
		else
			return false;
	}
	PassOb add(int x, int y) {
		return (new PassOb(a + x, b + y));
	}
}

// Klasa testujaca
class PassObTest {
	public static void main(String args[]) {
		PassOb ob1 = new PassOb(100, 22);
		PassOb ob2 = new PassOb(ob1);
		PassOb ob3 = new PassOb(-1, -1);
		// czy ob1 jest taki jak ob2
		System.out.println("ob1.equals(ob2)  " + ob1.equals(ob2));
		System.out.println("ob1 == ob2  " + (ob1 == ob2));
		ob2 = ob1;
		System.out.println("ob1 == ob2  " + (ob1 == ob2));
		// czy ob1 jest taki jak ob3
		System.out.println("ob1.equals(ob3)  " + ob1.equals(ob3));
		// test wyrazen, ktorych wynikiem jest obiekt
		System.out.println("wyr1 == wyr2 "
				+ (new PassOb(ob2)).equals(new PassOb(ob1)));
		// test innych wyrazen, ktorych wynikiem jest obiekt
		System.out.print("wyr3 == wyr4 ");
		System.out.println(
				(
						( new PassOb(ob2) ).add(1, 1).add(-1, -1)
				).equals( new PassOb(ob1) )
		);
	}
}
