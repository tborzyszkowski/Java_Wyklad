import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
    void constructor()
    {
        Date date=new Date();
        date.setMinutes(date.getMinutes()+1);
        assertThrows(IllegalArgumentException.class, () -> {
            new Invoice(new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new BigInteger("42565478321845987846954185"))
                    , date, new Date(118,12,29,9,25));
        }, "niepoprawna data sprzedaży");
        assertThrows(IllegalArgumentException.class, () -> {
            new Invoice(new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new BigInteger("42565478321845987846954185"))
                    , new Date(118,12,29,9,25), date);
        }, "niepoprawna data zapłaty");
    }

    @Test
    void testToString() {
        Invoice.setInovoiceQuantity(0);
        Invoice toTest=new Invoice(new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new BigInteger("42565478321845987846954185"))
        , new Date(118,12,29,9,20), new Date(118,12,29,9,25));
        toTest.addItem(new Item("Koparka cat", 5, 400000, 0.12));
        toTest.addItem(new Item("Buty cat", 10, 40000, 0.24));
        assertEquals(
       "======================================================================================================\n" +
                "||CREATION DATE                |SALE DATE                   |TRANSACTION DATE              |NUM     ||\n" +
                "||"+toTest.getCreationDate()+" |Tue Jan 29 09:20:00 CET 2019| Tue Jan 29 09:25:00 CET 2019 |1       ||\n" +
                "======================================================================================================\n" +
                "||COMPANY NAME           |ADDRESS                           |NIP       |BANK ACCOUNT                ||\n" +
                "||SpaceX sp.z.o.o.       |84-200 Waszyngton, Szkolna 1234   |6794682576|42565478321845987846954185  ||\n" +
                "======================================================================================================\n" +
                "||PRODUCT NAME                                              |COUNT  |INDI.NETPRI|GROSS PRICE        ||\n" +
                "||Koparka cat                                               |5x     |400000.0   |2240000.0          ||\n" +
                "||Buty cat                                                  |10x    |40000.0    |496000.0           ||\n" +
                "======================================================================================================\n" +
                "SUMMARY 2736000.0", toTest.toString(), "toString");
    }


    @Test
    void getInovoiceNumber() {
        Invoice.setInovoiceQuantity(0);
        Invoice toTest=new Invoice(new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new BigInteger("42565478321845987846954185"))
                , new Date(118,12,29,9,20), new Date(118,12,29,9,25));
        toTest.addItem(new Item("Koparka cat", 5, 400000, 0.12));
        toTest.addItem(new Item("Buty cat", 10, 40000, 0.24));

        Invoice toTest2=new Invoice(new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new BigInteger("42565478321845987846954185"))
                , new Date(118,12,29,9,20), new Date(118,12,29,9,25));
        toTest.addItem(new Item("Koparka cat", 5, 400000, 0.12));
        toTest.addItem(new Item("Buty cat", 10, 40000, 0.24));

        assertEquals(2,toTest2.getInovoiceNumber(),"licznik faktur");
    }
}