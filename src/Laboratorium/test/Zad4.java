package Laboratorium.test;

class F {
	String a() { return "Fa"; }
	String b() { return this.a() + "Fb"; }
}
class G extends F {
	String a() { return "Ga"; }
	String b() { return super.b() + "Gb"; }
}
class H extends G {
	String a() { return "Ha"; }
	String b() { return super.b() + super.a() + "Hb"; }
}
public class Zad4 {
	public static void main(String[] args) {
		F f = new F(); G g = new G(); H h = new H();
		System.out.println(f.b() + " " + g.b() + " " + h.b());
	}
}

