package _04_Dziedziczenie;

abstract class A_1 {
    // definicja klasy abstrakcyjnej 
    // tylko naglowek, bez ciala
    abstract void callMe();
    // zwykle, tj. w pelni zdefiniowane metody 
    // sa takze dozwowlone w klasach abstrakcyjnych
//    void callMeToo() {
//    	System.out.println("A: callMeToo");
//    	callMe();
//    }
}
class B_1 extends A_1 {
    // definiujemy callMe(), 
    // wymagane by tworzyc instancje klasy B
    void callMe() {
    	System.out.println("B: callMe");
    }
    void callMeToo() {
    	System.out.println("B: callMeToo");
    }
}
// klasa testujaca
class SimpleAbs {
    public static void main(String args[]) {
    	B_1 b = new B_1();
    	A_1 a = b;
    	//A_1 aa = new A_1();
    	
    	b.callMe();    // tu wywolanie kodu z B
    	System.out.println("---------------");
    	b.callMeToo(); // tu wywolanie kodu z A ????
    	System.out.println("===============");
    	
    	a.callMe();
    	System.out.println("---------------");
    	a.callMeToo();
    	System.out.println("---------------");
    	((A_1) b).callMeToo();
    }
}
