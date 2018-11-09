package _03_Klasy;

// Demonstracja zmiennych, metod i bloku statycznego
class Static1 {
    // zmienne statyczne
    static int a = 3;
    static int b = 1;
   
    static void pisz(int x) {
    	System.out.println("x = " + x);
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    } 
    static void test(Integer i){
    	System.out.println("i = " + i.intValue());
    }
    // blok statyczny - bedzie wywolany tylko raz
    static {
    	System.out.println("Blok statyczny wykonany");
    	b = b * 4;
    }
    // klasyczna metoda main() - tez statyczna
    public static void main(String args[]) {
    	pisz(1234);
    	test(new Integer(3));
    	// teraz wypiszemy cos innego by sprawdzic czy 
    	// uruchomi sie blok statyczny
    	pisz(56789);
    }
}
