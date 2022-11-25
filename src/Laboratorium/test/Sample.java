package Laboratorium.test;

import java.util.HashMap;
import java.util.Hashtable;

class SS{
	private String name;
	public SS(String a) {
		this.name = a;
	}

	@Override
	public int hashCode() {
		return 1;
	}
}

public class Sample {
	public static void main(String[] args) {
//		Hashtable ht = new Hashtable();
//
//		ht.put("1", "jeden");
//		ht.put(null, "aaa");
//		ht.put(null, null);
//
//		System.out.println(ht.size());
//		System.out.println(ht);
		HashMap hm = new HashMap();
		hm.put(new SS("a"), "emp1a");
		hm.put(new SS("b"), "emp1b");
		hm.put(new SS("a"), "emp1a ov");

		System.out.println(hm.size());
		System.out.println(hm.get(new SS("a")));
		System.out.println(hm);

//		3
//		null


		// Serializacja

	}
}
