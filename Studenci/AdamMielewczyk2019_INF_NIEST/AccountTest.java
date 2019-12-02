import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testToString() {
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 30.0 | NUMBER: 42565478321845987846954185 |\n",
                new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 30, new BigInteger("42565478321845987846954185")).toString(),
                "wpisywanie konta");
    }

    @Test
    void testRaport() {
        Account acc=new Account("Tadeusz Maselniczak", "80-200 Miejsce, Maślana 20", 130, new BigInteger("42565478321845987846954184"));
        Account acc2=new Account("Arkadiusz Maselniczak", "84-200 Waszyngton, Szkolna 1234", 150, new BigInteger("42565478321845987846594185"));
        Date date1=new Date();
        date1.setMinutes(new Date().getMinutes()-10);

        Date date2=new Date();
        date2.setMinutes(new Date().getMinutes()-7);
        Date date3=new Date();
        date3.setMinutes(new Date().getMinutes()-6);
        Date date4=new Date();
        date4.setMinutes(new Date().getMinutes()-5);
        Date dateM=new Date();
        dateM.setMinutes(new Date().getMinutes()-3);
        Date date5=new Date();
        date5.setMinutes(new Date().getMinutes()-2);
        Date date6=new Date();

        new Transaction(acc, acc2, 5, date2);
        new Transaction(acc, 50, date3, false);
        new Transaction(acc, 50, date4, true);

        new Transaction(acc2, acc, 3, date5);
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                "==============================================================\n" +
                "TO: 42565478321845987846594185 | DATE: "+date2+" | AMOUNT_AFTER: 125.0\n" +
                "|| WPłATA || | DATE: "+date3+" | AMOUNT_AFTER: 175.0\n" +
                "|| WYPłATA || | DATE: "+date4+" | AMOUNT_AFTER: 125.0\n" +
                "FROM: 42565478321845987846594185 | DATE: "+date5+" | AMOUNT_AFTER: 128.0\n",
                acc.raport(date1, date6), "wypisywanie raportu");
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                        "==============================================================\n" +
                        "TO: 42565478321845987846594185 | DATE: "+date2+" | AMOUNT_AFTER: 125.0\n" +
                        "|| WPłATA || | DATE: "+date3+" | AMOUNT_AFTER: 175.0\n" +
                        "|| WYPłATA || | DATE: "+date4+" | AMOUNT_AFTER: 125.0\n",
                acc.raport(date1, dateM), "wypisywanie raportu");
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                        "==============================================================\n" +
                        "|| WPłATA || | DATE: "+date3+" | AMOUNT_AFTER: 175.0\n" +
                        "|| WYPłATA || | DATE: "+date4+" | AMOUNT_AFTER: 125.0\n" +
                        "FROM: 42565478321845987846594185 | DATE: "+date5+" | AMOUNT_AFTER: 128.0\n",
                acc.raport(date2, date6), "wypisywanie raportu");
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                        "==============================================================\n" +
                        "|| WYPłATA || | DATE: "+date4+" | AMOUNT_AFTER: 125.0\n",
                acc.raport(date3, date4), "wypisywanie raportu");
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                        "==============================================================\n",
                acc.raport(date1, date1), "wypisywanie raportu");
        assertEquals("OWNER: Tadeusz Maselniczak | ADRESS: 80-200 Miejsce, Maślana 20 | BALANCE: 128.0 | NUMBER: 42565478321845987846954184 |\n" +
                        "==============================================================\n",
                acc.raport(date6, date6), "wypisywanie raportu");
    }
}