package _04_Dziedziczenie.example;

class A{
	int x;
	A(int x){
		this.x = x;
	}
}
class B extends A{
	int x;
	B(int a, int b){
		super(a);
		this.x = b;
	}
	int superX(){
		return super.x;
	}
}
class C extends B{
	int x;
	C(int a, int b, int c){
		super(a,b);
		this.x = c;
	}
    public String toString() {
    	return "A.x = " + super.superX() + " B.x = " + super.x + " C.x = " + x;
    }
}
public class ABCExample {

	public static void main(String[] args) {
		C c = new C(1,2,3);
		System.out.println(c);
	}

}
