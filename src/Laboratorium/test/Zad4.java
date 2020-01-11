package Laboratorium.test;

class G {
	String a() { return "1"; }
	String b() { return this.a() + "2"; }
	String c() { return b() + "3"; }
}

class H extends G {
	String a() { return "4"; }
	String b() { return super.b() + "5"; }
	String c() { return b() + "6"; }
	String d() { return super.c() + "7"; }
}

public class Zad4 {
	public static void main(String[] args) {
		G g = new G(); H h = new H();
		System.out.println(g.b() + " " + g.c());
		System.out.println(h.b() + " " + h.c() + " " + h.d());
	}
}
