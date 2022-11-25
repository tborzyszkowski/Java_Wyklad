package wyklad._02typy;

import javax.jws.soap.SOAPBinding;
import java.math.BigInteger;
import java.util.Objects;

class MyInt{
	private int number;

	public MyInt(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MyInt)) return false;
		MyInt myInt = (MyInt) o;
		return getNumber() == myInt.getNumber();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNumber());
	}
//	HashCode: zasady:
//	Każde wywołanie metody hashCode na tym samym obiekcie musi kończyć się zwróceniem tej samej liczy całkowitej.
//	Jeżeli dwa obiekty są sobie równe (wg metody equals), to ich hashCode również musi być równy.
//	Jeżeli obiekty są różne (wg metody equals), to ich hashCode może być równy, jednak ze względów wydajnościowych powinno to być unikane.
//	Relacja wyznaczona metodą equals musi być zwrotna, czyli dla każdej zmiennej x różnej od null wyrażenie x.equals(x) musi zwracać wartość = true.
//	Relacja wyznaczona metodą equals musi być symetryczna, czyli dla każdej pary zmiennych x i y, wyrażenie x.equals(y) ma wartość true i wtedy i tylko wtedy gdy y.equals(x) = true.
//	Relacja wyznaczona metodą equals musi być przechodnia, czyli dla dowolnych zmiennych z, y i z, jeżeli x.equals(y) = true oraz y.equals(z) = true, to x.equals(z) musi również = true.
//	Relacja wyznaczona metodą equals musi być spójna, czyli każdorazowe wywołanie x.equals(y) (przy założeniu, że między wywołaniami obiekty nie były modyfikowane) zawsze musi zwracać tę samą wartość – zawsze true albo zawsze false.
//	Każdy obiekt jest różny od null, czyli wywołanie x.equals(null) dla obiektu x różnego od null, zawsze musi zwrócić false.
}

public class StringImmutable {
	public static void main(String[] args) {
		String s1 = "Ala";
		String s2 = "Ala1";

		System.out.println("s1 eq s2: " + (s1.equals(s2)));
		System.out.println("s1 == s2: " + (s1 == s2));
		s1 = s1 + "1";
		System.out.println(s2);
		System.out.println("s1 eq s2: " + (s1.equals(s2)));
		System.out.println("s1 == s2: " + (s1 == s2));
//		BigInteger b1 = BigInteger.valueOf(1);
//		BigInteger b2= BigInteger.valueOf(1);;
//
//		System.out.println("b1 eq b2: " + (b1.equals(b2)));
//		System.out.println("b1 == b2: " + (b1 == b2));

		MyInt m1 = new MyInt(1);
		MyInt m2 = new MyInt(1);;

		System.out.println("m1 eq m2: " + (m1.equals(m2)));
		System.out.println("m1 == m2: " + (m1 == m2) );
		System.out.println("m1: " + m1.hashCode() + " m2: " +m2.hashCode() );
	}
}