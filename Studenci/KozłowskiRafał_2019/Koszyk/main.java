public class main {
    public static void main(String[] args){
        Product szampon = new Product(1, "szampon", 10.99);
        Product shower_gel = new Product(2, "Żel pod prysznic", 16.99);
        Product perfume = new Product(3, "Chanel 5", 299.99);
        Product perfume2 = new Product(3, "Chanel 5", 299.99);
        Product soap = new Product(4, "Mydlo", 2.0);
        Product matches = new Product(5, "Zapałki", 0.20);
        Product test = new Product(6, "Chanel 6", 299.99);
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(szampon);
        cart1.addProduct(shower_gel);
        cart1.addProduct(soap);
        cart1.addProduct(perfume);
        cart1.useCoupon(perfume);
        cart1.addProduct(test);
//        cart1.removeProduct(perfume);
//        cart1.removeProduct(shower_gel);
        cart1.useCoupon(szampon);
        cart1.addProduct(matches);
        cart1.addProduct(perfume2);
        System.out.println(cart1.toString());
        System.out.println(cart1.listCheapestProducts(2));
        System.out.println(cart1.listMostExpensiveProducts(2));
    }
}
