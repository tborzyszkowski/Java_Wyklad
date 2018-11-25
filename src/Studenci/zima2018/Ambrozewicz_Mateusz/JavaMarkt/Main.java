package JavaMarkt;

import JavaMarkt.Modele.*;

public class Main {

    public static void main(String[] args){
        Basket basket = new Basket();
        basket.addProduct(new Product("Jablko", 2.0,8.0), 3)
                .addProduct(new Product("Gruszka", 3.0, 8.0), 4)
                .addProduct(new Product("Pietruszka", 5.0, 23.0), 5);

        System.out.println(basket);
    }

}
