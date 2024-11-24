package wyklad._03klasy.Sample;

import javafx.scene.paint.Stop;

public class Main {
	public static void main(String[] args) {
//		int x1 = Global.x;
//		System.out.println(Global.x.hashCode());
//		Global.x = 10;
//		System.out.println(Global.x.hashCode());
//		int x2 = Global.x;
//		String s1 = "Ala";
//		String s2 = "Ala";
		String s1 = new String("Ala");
		String s2 = new String("Ola");

		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode() + " " + s2.hashCode());

		StringBuffer sb = new StringBuffer("Ala ma kota");
		System.out.println(sb.hashCode());
		sb.setCharAt(0, 'O');
		System.out.println(sb.hashCode());
	}
}
