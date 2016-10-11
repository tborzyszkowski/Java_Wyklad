package _05_Pakiety.InterfejsyEx;

interface Wymaganie{
	void f();
}
class A{
	public void f(){}
}

class B extends A implements Wymaganie{	
}
public class IfaceImpl {
	public static void main(String[] args) {
		Wymaganie zm  = new B();
		//Wymaganie zm2 = new A();
		zm.f();
	}
}
