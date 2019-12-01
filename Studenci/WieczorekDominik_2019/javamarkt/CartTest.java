import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void addToCart() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 1000);
        cart.addToCart(product);
        SortedList<Product> list = new SortedList<Product>();
        list.add(product);
        assertEquals(cart.getList(), list);
    }

    @Test
    void getLowestPrice() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 870);
        Product product1 = new Product("XD1", "ts2hit", 650);
        Product product2 = new Product("XD2", "tshi2t", 100);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(cart.getLowestPrice().getPrice(), 100);
    }
    @Test
    void getHighestPrice() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 5);
        Product product1 = new Product("XD1", "ts2hit", 90);
        Product product2 = new Product("XD2", "tshi2t", 880);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(cart.getHighestPrice().getPrice(), 880);
    }

    @Test
    void getNLowestPrices() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 5);
        Product product1 = new Product("XD1", "ts2hit", 90);
        Product product2 = new Product("XD2", "tshi2t", 880);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(cart.getNLowestPrices(2).size(), 2);
    }

    @Test
    void getNHighestPrices() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 5);
        Product product1 = new Product("XD1", "ts2hit", 90);
        Product product2 = new Product("XD2", "tshi2t", 880);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(cart.getNHighestPrices(2).size(), 2 );

    }

    @Test
    void getSum() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 10);
        Product product1 = new Product("XD1", "ts2hit", 20);
        Product product2 = new Product("XD2", "tshi2t", 30);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        assertEquals(cart.getSum(), 60);
    }

    @Test
    void viewInfo() {
        Cart cart = new Cart();
        Product product = new Product("CCC", "tshit", 100);
        Product product1 = new Product("AAA", "ts2hit", 100);
        Product product2 = new Product("BBB", "tshi2t", 100);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.viewInfo();
    }

    @Test
    void getDiscountSum() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 1000);
        Product product1 = new Product("XD1", "ts2hit", 1000);
        Product product2 = new Product("XD2", "tshi2t", 1000);
        cart.addToCart(product);
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.discounter();
        assertEquals(cart.getDiscountSum(), 1900);
    }


    @Test
    void voucher() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 1000);
        cart.addVoucher("BLACKFRIDAY");
        cart.voucher(product,"BLACKFRIDAY");
        assertEquals(product.getDiscountPrice(), 700);

    }

    @Test
    void getList() {
        Cart cart = new Cart();
        Product product = new Product("XD", "tshit", 1000);
        cart.addToCart(product);
        SortedList<Product> list = new SortedList<Product>();
        list.add(product);
        assertEquals(cart.getList(), list);

    }
}