import org.junit.*;

import java.util.ArrayList;

public class CartTest {
    @Test
    public void sorting(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Product product6 = new Product ("6666","Cola",10);
        Product product5 = new Product ("5555","Dola",10);
        Product product4 = new Product ("4444","Bola",10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);
        cart.addProduct(product6);
        cart.sorting();
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product3);
        koszyk.add(product);
        koszyk.add(product2);
        koszyk.add(product4);
        koszyk.add(product6);
        koszyk.add(product5);
        Assert.assertEquals(cart.getProductlist(), koszyk);
    }
    @Test
    public void sortbyName(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.sortbyName();
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product3);
        koszyk.add(product2);
        koszyk.add(product);
        Assert.assertEquals(cart.getProductlist(), koszyk);
    }
    @Test
    public void sortbyPrice(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.sortbyPrice();
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product2);
        koszyk.add(product);
        koszyk.add(product3);
        Assert.assertEquals(cart.getProductlist(), koszyk);
    }
    @Test
    public void lowcost(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Product product6 = new Product ("6666","Cola",10);
        Product product5 = new Product ("5555","Dola",10);
        Product product4 = new Product ("4444","Bola",10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);
        cart.addProduct(product6);
        Assert.assertEquals(product5, cart.lowcost());
    }
    @Test
    public void highcost(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Product product6 = new Product ("6666","Cola",10);
        Product product5 = new Product ("5555","Dola",10);
        Product product4 = new Product ("4444","Bola",10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);
        cart.addProduct(product6);
        Assert.assertEquals(product3, cart.highcost());
    }
    @Test
    //For 3 products
    public void lowcostN(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Product product6 = new Product ("6666","Cola",10);
        Product product5 = new Product ("5555","Dola",10);
        Product product4 = new Product ("4444","Bola",10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);
        cart.addProduct(product6);
        cart.sorting();
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product5);
        koszyk.add(product6);
        koszyk.add(product4);
        Assert.assertEquals(cart.lowcostN(3), koszyk);
    }
    @Test
    //For 3 products
    public void highostN(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Product product3 = new Product ("3333","Komputer",200);
        Product product6 = new Product ("6666","Cola",10);
        Product product5 = new Product ("5555","Dola",10);
        Product product4 = new Product ("4444","Bola",10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);
        cart.addProduct(product6);
        cart.sorting();
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product3);
        koszyk.add(product);
        koszyk.add(product2);
        Assert.assertEquals(cart.highcostN(3), koszyk);
    }
    @Test
    public void addProduct(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product);
        koszyk.add(product2);
        Assert.assertEquals(cart.getProductlist(), koszyk);
    }
    @Test
    public void getProductlist(){
        Product product = new Product ("1111","Telewizor",100);
        Cart cart = new Cart();
        cart.addProduct(product);
        ArrayList<Product> koszyk = new ArrayList<>();
        koszyk.add(product);
        Assert.assertEquals(cart.getProductlist(), koszyk);
    }
    @Test
    public void sumPrice(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",50);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.sumPrice();
        Assert.assertEquals(cart.getSuma(), 150,0.1);
    }
    @Test
    public void SumaRabat(){
        Product product = new Product ("1111","Telewizor",210);
        Product product2 = new Product ("2222","Laptop",100);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.sumPrice();
        cart.conclusion();
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 294.5,0.1);
    }
    @Test
    public void conslusion300(){
        Product product = new Product ("1111","Telewizor",200);
        Product product2 = new Product ("2222","Laptop",100);
        Product product3 = new Product ("3333","Cola",10);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.addProduct(product3);
        cart.sorting();
        cart.sumPrice();
        cart.conclusion();
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 285,0.1);
    }
    @Test
    public void conslusion200(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",100);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.sorting();
        cart.sumPrice();
        cart.conclusion();
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 200,0.1);
    }
    @Test
    public void conslusion3items(){
        Product product = new Product ("1111","Telewizor",200);
        Product product2 = new Product ("2222","Laptop",100);
        Product product3 = new Product ("3333","Cegła",30);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.addProduct(product3);
        cart.sorting();
        cart.sumPrice();
        cart.conclusion();
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 285,0.1);
    }
    @Test
    public void conclusionWithRabat(){
        Product product = new Product ("1111","Telewizor",200);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.sumPrice();
        cart.sorting();
        cart.conclusionWithRabat("Telewizor");
        cart.SumaRabat();
        cart.printCart();
        Assert.assertEquals(cart.getSumaRabat(), 140,0.1);
    }
    @Test
    public void conslusion3itemsWithRabat(){
        Product product = new Product ("1111","Telewizor",100);
        Product product2 = new Product ("2222","Laptop",100);
        Product product3 = new Product ("3333","Cegła",50);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.addProduct(product3);
        cart.sorting();
        cart.sumPrice();
        cart.conclusionWithRabat("Telewizor");
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 170,0.1);
    }
    @Test
    public void conslusion300withRabat(){
        Product product = new Product ("1111","Telewizor",200);
        Product product2 = new Product ("2222","Laptop",100);
        Product product3 = new Product ("3333","Cegła",50);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product);
        cart.addProduct(product3);
        cart.sorting();
        cart.sumPrice();
        cart.conclusionWithRabat("Telewizor");
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 285,0.1);
    }
    @Test
    public void conslusion200withRabat(){
        Product product2 = new Product ("2222","Laptop",100);
        Product product3 = new Product ("3333","Cegła",100);
        Cart cart = new Cart();
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.sorting();
        cart.sumPrice();
        cart.conclusionWithRabat("Laptop");
        cart.SumaRabat();
        Assert.assertEquals(cart.getSumaRabat(), 170,0.1);
    }
}
