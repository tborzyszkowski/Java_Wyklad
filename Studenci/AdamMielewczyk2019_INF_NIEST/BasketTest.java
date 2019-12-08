import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void sortProductsByPriceAndName() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        b.sortProductsByPriceAndName();
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020537967|margaryna                                      |8.5   |8.5\n" +
                "978020537967|masło deluxe                                   |8.5   |8.5\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "SUMMARRY: 33.5", b.toString(),"sortowanie po cenie malejáco i po nazwie" );
    }

    @Test
    void sortProductsByPriceASC() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        b.sortProductsByPrice(true);
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020537967|margaryna                                      |8.5   |8.5\n" +
                "978020537967|masło deluxe                                   |8.5   |8.5\n" +
                "SUMMARRY: 33.5", b.toString(), "Sortowanie po cenie rosnáco");
    }

    @Test
    void sortProductsByPriceDSC() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        b.sortProductsByPrice(false);
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020537967|margaryna                                      |8.5   |8.5\n" +
                "978020537967|masło deluxe                                   |8.5   |8.5\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "SUMMARRY: 33.5", b.toString(), "Sortowanie po cenie malejáco");
    }

    @Test
    void findCheapest() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        assertEquals("978020137962|masło aro                                      |3.5   |3.5", b.find(false).toString(), "szukanie najtañszego");
    }

    @Test
    void findExpensive() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        assertEquals("978020537967|margaryna                                      |8.5   |8.5", b.find(true).toString(), "szukanie najdroæszego");
    }

    @Test
    void findCheap() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        assertEquals("[978020137962|masło aro                                      |3.5   |3.5, 978020137967|masło aro                                      |5.5   |5.5]", b.find(2,false).toString(), "szukanie dwóch tanich");
    }

    @Test
    void findMinusOneCheap() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        assertEquals("[]", b.find(-1,false).toString(), "szukanie ujemnej iloß©i tanich");
    }

    @Test
    void findToMuchCheap() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537967", "margaryna", 8.50));
        assertEquals("[978020137962|masło aro                                      |3.5   |3.5," +
                " 978020137967|masło aro                                      |5.5   |5.5," +
                " 978020137967|masło deluxe                                   |7.5   |7.5," +
                " 978020537967|margaryna                                      |8.5   |8.5," +
                " 978020537967|masło deluxe                                   |8.5   |8.5]", b.find(10,false).toString(), "szukanie za duzych ilosci tanich");
    }

    @Test
    void promoGlass() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(new Product("978020537867", "koparka", 250));
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020537867|koparka                                        |250.0 |250.0\n" +
                "978020537967|masło deluxe                                   |8.5   |8.5\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "3748592857384|firmowy kubek                                 |0.0   |0.0\n" +
                "SUMMARRY: 275.0", b.toString(), "promo kubek przy zakupach za ponad 200");
    }

    @Test
    void promoGlassDelete() {
        Basket b=new Basket();
        Product koparka=new Product("978020537867", "koparka", 250);
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("978020537967", "masło deluxe", 8.50));
        b.add(koparka);
        b.toString();
        b.delete(koparka);
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020537967|masło deluxe                                   |8.5   |8.5\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "SUMMARRY: 25.0", b.toString(), "usuwanie kubka z koparka");
    }

    @Test
    void promoCoupon() {
        Basket b=new Basket();
        b.add(new Product("978020137967", "masło aro", 5.50));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        b.add(new Product("3333333333333", "coupon", 0));
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020137967|masło deluxe                                   |7.5   |5.25\n" +
                "978020137967|masło aro                                      |5.5   |5.5\n" +
                "978020137962|masło aro                                      |3.5   |3.5\n" +
                "3333333333333|coupon                                        |0.0   |0.0\n" +
                "SUMMARRY: 14.25", b.toString(), "kupon -30");
    }

    @Test
    void promoThreeFree() {
        Basket b=new Basket();
        b.add(new Product("978020347967", "Rx 590", 100));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020347967|Rx 590                                         |100.0 |100.0\n" +
                "978020137967|masło deluxe                                   |7.5   |7.5\n" +
                "978020137962|masło aro                                      |3.5   |0.0\n" +
                "SUMMARRY: 107.5", b.toString(), "promocja na trzeci produkt najtañszy za darmo");
    }

    @Test
    void promoDiscount() {
        Basket b=new Basket();
        b.add(new Product("978020347967", "Rx 590", 400));
        b.add(new Product("978020137962", "masło aro", 3.50));
        b.add(new Product("978020137967", "masło deluxe", 7.50));
        assertEquals("CODE        |NAME                                           |Price |DISCOUNTPRICE\n" +
                "978020347967|Rx 590                                         |400.0 |380.0\n" +
                "978020137967|masło deluxe                                   |7.5   |7.125\n" +
                "978020137962|masło aro                                      |3.5   |3.3249999999999997\n" +
                "3748592857384|firmowy kubek                                 |0.0   |0.0\n" +
                "SUMMARRY: 390.45", b.toString(), "promocja przy zakupach powyzej 300");
    }
}