package wyklad._03klasy;

// Definicja prostej klasy z metodami i konstruktorami

class Box3{
    private double width;
    private double height;
    private double depth;

    // konstruktor bez parametrow
    Box3() {
    	width  = 0; 
    	height = 0; 
    	depth  = 0;
    }
    // konstruktor z jednym parametrem
    Box3(int n) {
    	width  = n; // tu konwersja int do double
    	height = n; 
    	depth  = n;
    }
    // konstruktor z parametrami
    Box3(int width, int height, int depth) {
    	this.width  = 2*width; 
    	this.height = 3*height; 
    	this.depth  = 4*depth;
    }
    // konstruktor z parametrami
    Box3(double w, double h, double d) {
    	this((int)w,(int)d,(int)h);
//    	width  = w; 
//    	height = h; 
//    	depth  = d;
    }
    // metoda zmieniajaca zawartosc obiektu
    // ale nie bedaca konstruktorem
    // nic nie zwraca, wiec typ wynikowy to void
    void setDim(double w, double h, double d) {
    	width  = w; 
    	height = h; 
    	depth  = d;
    }
    // metoda obliczajaca objetosc
    double volume() {
	// tu metoda oddaje obietosc
    	return width * height * depth;
    }
}

// definicja klasy demonstrujacej uzycie klasy Box 
class BoxDemo3{
    public static void main (String args[]) {
	// utworzenie instancji klasy Box
	Box3 myBox1 = new Box3();
	Box3 myBox2 = new Box3(2);
	Box3 myBox3 = new Box3(3, 4.0, 5);

	// wypisujemy objetosci 
	System.out.println("\nObjetosc myBox1 = " + myBox1.volume());
	System.out.println(  "Objetosc myBox2 = " + myBox2.volume());
	System.out.println(  "Objetosc myBox3 = " + myBox3.volume());

	// zmieniamy zawartosc obiektu myBox1
	myBox1.setDim(2, 3, 2);
	// raz jeszcze jego objetosc
	System.out.println("\nObjetosc myBox1 = " + myBox1.volume() + "\n");
//	myBox1.width = 10;
//	myBox1.szerokosc = 10;
    }
}
