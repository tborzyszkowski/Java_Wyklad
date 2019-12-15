import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void constructorTransaction()
    {
        Account acc=new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 30, new BigInteger("42565478321845987846954185"));
        Account acc2=new Account("Arkadiusz Maselniczak", "84-200 Waszyngton, Szkolna 1234", 50, new BigInteger("42565478321845987846594185"));
        new Transaction(acc, acc2, 25, new Date());
        assertEquals(5, acc.getBalance(), "aktualizowanie stanu konta płatniczego");
        assertEquals(75, acc2.getBalance(), "aktualizowanie stanu konta odbiorcy");

        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, acc2, 25.001, new Date());
        },"niepoprawna liczba groszy przelewu");
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, acc2, 31, new Date());
        },"przelew większy niż stan konta");
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, acc2, -25, new Date());
        },"ujemny przelew");
    }

    @Test
    void constructorPayout()
    {
        Account acc=new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 100, new BigInteger("42565478321845987846954185"));
        new Transaction(acc, 50, new Date(), true);
        assertEquals(50, acc.getBalance(), "aktualizowanie stanu konta po wypłacie");

        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, 40, new Date(), true);
        },"niepoprawna watość przelewu");
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, 60, new Date(), true);
        },"przelew większy niż stan konta");
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, -50, new Date(), true);
        },"ujemna wypłata");
    }

    @Test
    void constructorPayment()
    {
        Account acc=new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 100, new BigInteger("42565478321845987846954185"));
        new Transaction(acc, 50, new Date(), false);
        assertEquals(150, acc.getBalance(), "aktualizowanie stanu konta po wpłacie");

        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, 40, new Date(), false);
        },"niepoprawna watość przylewie");
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Transaction(acc, -50, new Date(), false);
        },"ujemny przylew");
    }

    @Test
    void testToString() {
        Account acc=new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 30, new BigInteger("42565478321845987846954185"));
        Account acc2=new Account("Arkadiusz Maselniczak", "84-200 Waszyngton, Szkolna 1234", 50, new BigInteger("42565478321845987846594185"));
        Transaction trans = new Transaction(acc, acc2, 25, new Date());
        assertEquals("--------------------------------------------------------------------------------------------\n" +
                "SOURCE ACCOUNT NUMBER      |TARGET ACCOUNT NUMBER      |DATE                         |AMOUNT\n" +
                "42565478321845987846954185 |42565478321845987846594185 |"+trans.getDate()+" |25.0\n",
                Transaction.stringHeader() + trans.toString());
    }
}