package _06_Kolekcje;
import java.util.*;

public class ContainsTest {

	public static void main(String[] args) {
		ArrayList<Long> a1 = new ArrayList<Long>();
		
		a1.add(new Long(1));
		System.out.println(a1.contains(new Integer(1)));
		Long ll = 1L;
		Integer ii = 1;
		System.out.println(ll.equals(ii));
	}

}
