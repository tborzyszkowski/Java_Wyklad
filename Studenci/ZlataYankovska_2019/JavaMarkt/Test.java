public class Test {
	public static void main(String args[]) {
		Product p1 = new Product("0000", "ab", 100.0);
		Product p2 = new Product("0000", "a", 70.0);
		Product p3 = new Product("0000", "ac", 20.0);
		Product p4 = new Product("0000", "ba", 10.0);
		Product p5 = new Product("0000", "c", 1000.0);
		Product p6 = new Product("0000", "d", 200.0);
		Koszyk k = new Koszyk();
		k.AddProduct(p1);
		k.AddProduct(p2);
		k.AddProduct(p3);
		k.AddProduct(p4);
		k.AddProduct(p5);
		k.AddProduct(p6);
		System.out.println();
		System.out.println("Trzy najtansze:");
		Product[] tab = k.find(3, true);
		System.out.println(tab[0].price);
		System.out.println(tab[1].price);
		System.out.println(tab[2].price);
		System.out.println();
		System.out.println("Trzy najdrozsze:");
		tab = k.find(3, false);
		System.out.println(tab[0].price);
		System.out.println(tab[1].price);
		System.out.println(tab[2].price);
		System.out.println();
		System.out.println("Nazwa rosnaco:");
		k.sortName(true);
		k.printList();
		System.out.println();
		System.out.println("Nazwa malejaco:");
		k.sortName(false);
		k.printList();
		System.out.println();
		System.out.println("Cena rosnaco:");
		k.sortPrice(true);
		k.printList();
		System.out.println();
		System.out.println("Cena malejaco:");
		k.sortPrice(false);
		k.printList();
	}
}
