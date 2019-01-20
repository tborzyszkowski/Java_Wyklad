package JavaMarkt;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tworzenie produktów\n");
        Product jablko = new Product("1", "jablko", 4);
        Product mleko = new Product("2", "mleko", 3.20);
        Product rower = new Product("3", "rower", 300);
        Product rowing_set = new Product("4", "rowing set", 300);

        System.out.println("Tworzenie koszyka i dodawanie do niego produktów\n");
        Cart koszyk = new Cart();
        koszyk.addProduct(jablko);
        koszyk.addProduct(mleko);
        koszyk.addProduct(rower);
        koszyk.addProduct(rowing_set);

        System.out.println("Testowanie znajtowania najtańszego i najdroższego produktu\n");
        System.out.println("Najdroższy: " + koszyk.getExpensive());
        System.out.println("Najtańszy: " + koszyk.getCheapest());

        System.out.println("Testowanie znajdowania listy 5 najtańszych i najdroższych produktów\n");
        System.out.println("lista 2 najtańszych: " + koszyk.getNCheapest(2));
        System.out.println("lista 3 najdroższych: " + koszyk.getNExpensive(3));

        System.out.println("SORTOWANIE KOSZYKA PO NAZWIE I CENIE\n");
        System.out.println(koszyk.sort("name"));
        System.out.println(koszyk.sort("price"));

        System.out.println("Testowanie zniżki 5 procent przy wartości koszyka powyżej 300\n");
        Promotion5PercentDiscount promo5off = new Promotion5PercentDiscount();
        System.out.println(promo5off.isApplicable(koszyk));
        koszyk.addPromotion(promo5off);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());
        koszyk.removePromotion(promo5off);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());

        System.out.println("Testowanie trzeciego, najtańszego przedmiotu gratis\n");
        PromotionThirdForFree thirdForFree = new PromotionThirdForFree();
        System.out.println(thirdForFree.isApplicable(koszyk));
        koszyk.addPromotion(thirdForFree);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());
        koszyk.removePromotion(thirdForFree);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());

        System.out.println("Testowanie kubka gratis przy zakupach za > 200\n");
        PromotionFreeMug freeMug = new PromotionFreeMug();
        System.out.println(freeMug.isApplicable(koszyk));
        koszyk.addPromotion(freeMug);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());
        koszyk.removePromotion(freeMug);
        System.out.println(koszyk.getProducts());
        System.out.println(koszyk.totalDiscountPrice());

    }
}
