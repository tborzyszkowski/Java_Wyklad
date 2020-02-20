package javaMarkt;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

  @Test
  void findCheapest() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    Assert.assertEquals(cart.findCheapest(),2.3,0);
  }

  @Test
  void findMostExpensive() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    Assert.assertEquals(cart.findMostExpensive(),1000,0);
  }

  @Test
  void sortAlfabetic() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    cart.sortAlfabetic();
    ArrayList<Product> cart2 = new ArrayList<>();
    cart2.add(product4);
    cart2.add(product3);
    cart2.add(product);
    cart2.add(product2);
    Assert.assertEquals(cart.getProductlist(),cart2 );

  }

  @Test
  void sortPrice() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    cart.sortPrice();
    ArrayList<Product> cart2 = new ArrayList<>();
    cart2.add(product);
    cart2.add(product4);
    cart2.add(product3);
    cart2.add(product2);
    Assert.assertEquals(cart.getProductlist(),cart2 );
  }

  @Test
  void findCheapestN() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    cart.findCheapestN(4);
    ArrayList<Product> cart2 = new ArrayList<>();
    cart2.add(product);
    cart2.add(product4);
    cart2.add(product3);
    cart2.add(product2);
    Assert.assertEquals(cart.getProductlist(),cart2);
  }

  @Test
  void findMostExpensiveN() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    cart.findMostExpensiveN(4);
    ArrayList<Product> cart2 = new ArrayList<>();
    cart2.add(product2);
    cart2.add(product3);
    cart2.add(product4);
    cart2.add(product);
    Assert.assertEquals(cart.getProductlist(),cart2);
  }

  @Test
  void sum() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    Assert.assertEquals(cart.sum(),1027.30,0);

  }

  @Test
  void thirdGratis() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.thirdGratis();
    Assert.assertEquals(cart.sum(),1020,0);
  }

  @Test
  void blackFriday() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.blackFriday();
    Assert.assertEquals(cart.sum(),1022.3,0);
  }

  @Test
  void printCart() {
    Product product = new Product ("1234","Cola",2.30);
    Product product2 = new Product ("1235","Laptop",1000);
    Product product3 = new Product ("1236","Baton",20);
    Product product4 = new Product ("1237","Ananas",5);
    Cart cart = new Cart();
    cart.addProduct(product);
    cart.addProduct(product2);
    cart.addProduct(product3);
    cart.addProduct(product4);
    cart.printCart();
  }
}