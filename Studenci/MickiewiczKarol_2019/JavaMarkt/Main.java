import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    private static DecimalFormat three = new DecimalFormat("#0.000");

    public static void main(String[] args) {

        ArrayList<Product> productArrayList = ProductWarehouse.getInstance().getProductArray();

        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(productArrayList.get(0));
        chosenProducts.add(productArrayList.get(3));
        chosenProducts.add(productArrayList.get(6));
        Order order = new Order(chosenProducts);
        order.countOrderPrice();
        order.sortArrayByPrice();

        Promotion promotion = new Promotion(order);

        System.out.println("Jeśli wartość zamówienia jest większa niż 300 zł klient otrzymuje 5% zniżki na zakupione towary:");
        System.out.println("Przed zniżką: " + three.format(order.getOrderPrice()));
        promotion.fivePercentDiscount();
        System.out.println("Po zniżce: " + three.format(order.getOrderPrice()));
        System.out.println("------------------");

        System.out.println("Jeśli klient kupi 2 produkty to 3 najtańszy otrzymuje gratis");
        System.out.println("Cena przed tą promocją: " + three.format(order.getOrderPrice()));
        promotion.thirdGratis();
        System.out.println("Cena po tej promocji: " + three.format(order.getOrderPrice()));
        System.out.println("------------------");

        System.out.println("Jeśli wartość zamówienia przekracza wartość 200 zł klient otrzymuje firmowy kubek gratis");
        System.out.println("Zamówienie przed dodaniem kubka: " + order.getProducts());
        promotion.freeCup();
        System.out.println("Zamówienie po dodaniu kubka: " + order.getProducts());
        System.out.println("------------------");

        System.out.println("Jednorazowy kupon rabatowy 30% na wybrany produkt");
        productArrayList.get(0).setCoupon("fsd");
        System.out.println("Cena zamówienia przed zniżką 30% na wybrany produkt: " + three.format(order.getOrderPrice()));
        promotion.ifDiscountCoupon();
        System.out.println("Cena zamówienia po zniżce 30% na wybrany produkt: " + three.format(order.getOrderPrice()));
        System.out.println("------------------");

        System.out.println("Wyszukiwanie najtańszego/najdroższego produktu w zadanej kolekcji produktów");
        System.out.println("Najdroższy produkt: " + order.findProductWithMaxPrice());
        System.out.println("Najtańszy produkt: " + order.findProductWithMinPrice());
        System.out.println("------------------");

        System.out.println("Wyszukiwanie n najtańszych/najdrożyszych produktów w zadanej kolekcji produktów");
        System.out.printf("n najdrożyszych produktów: ");
        order.findNProductsWithMaxPrice(2);
        System.out.printf("n najtańszych produktów: ");
        order.findNProductsWithMinPrice(2);
        System.out.println("------------------");

        System.out.println("Zamówienie posortowane po cenie: " + order.toString());
        order.sortArrayByName();
        System.out.println("Gdy cena dwóch produktów jest taka sama, to posortowano po nazwie: " + order.toString());
        System.out.println("------------------");

        System.out.println("Wyliczanie sumy cen wszystkich zadanych produktów");
        System.out.println(three.format(order.getOrderPrice()));
        System.out.println("------------------");

    }

}
