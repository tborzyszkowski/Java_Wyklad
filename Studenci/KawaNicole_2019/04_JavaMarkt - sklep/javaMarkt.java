public class javaMarkt {
    public static void main(String[] args) {

        // create cart and add products to cart
        Cart cart = new Cart();
        cart.addProdukt(new Produkt("1", "Mleko", 4.50))
                .addProdukt(new Product("2", "Pomarancze", 3.99))
                .addProdukt(new Produkt("3", "Jajka", 2.60))
                .addProdukt(new Produkt("4", "Chleb", 2.80))
                .addProdukt(new Produkt("5", "Masło", 3.69))
                .addProdukt(new Produkt("6", "Ananas", 3.79))
                .addProdukt(new Produkt("7", "Kawa", 120));

        cart.printTheCheapest();
        cart.printTheMostExpensive();
        cart.printTheCheapestN(3);
        cart.printTheMostExpensiveN(3);

        cart.addPromotion(new FreeCup()).applyPromotions();
        cart.addPromotion(new FivePercentOff()).applyPromotions();
        cart.addPromotion(new FreeProduct()).applyPromotions();
        cart.removePromotion(new FreeCup()).applyPromotions();
        System.out.println(cart);
    }
}
