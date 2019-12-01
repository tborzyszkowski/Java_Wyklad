import org.junit.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class accountTest {


@Test
   public  void getbalanceafterpayment()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        konto.payment(konto, 50);
       Assert.assertEquals(50 ,konto.getBalance());
    }
    @Test
    public  void getbalanceafterwithdraw()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        konto.withdraw(konto, 50);
        Assert.assertEquals(-50 ,konto.getBalance());
    }
    @Test
    public  void getBalance()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        // konto.wypiszHistory();
        Assert.assertEquals(0 ,konto.getBalance());
    }
    @Test
    public  void setBalance()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        konto.setBalance(50);
        // konto.wypiszHistory();
        Assert.assertEquals(50 ,konto.getBalance());
    }
    @Test
    public  void getClient()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        Assert.assertEquals(client , konto.getClient());
    }
    @Test
    public  void setClient()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        Client client2 = new Client ("Wojtek Kowal", "Poziomkowa 31", 99011);

        account konto = new account (client);
        konto.setClient(client2);
        Assert.assertEquals(client2 , konto.getClient());
    }

    @Test
    public  void checkhistory()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        Client client2 = new Client ("Wojt Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        account konto2 = new account (client);
        konto.payment(konto, 50);
        konto.withdraw(konto, 30);
        konto.payment(konto, 90);
        konto.transaction(konto,konto2,50);
        LocalDate ld1 = LocalDate.parse("2019-11-27");
        LocalDate ld2 = LocalDate.parse("2019-11-29");
        konto.checkHistory(konto, ld1, ld2);
    }

    @Test
    public  void CheckHistoryWithCustomdate()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        LocalDate date1 = LocalDate.parse("2019-11-25");
        LocalDate date2 = LocalDate.parse("2019-11-26");
        LocalDate date3 = LocalDate.parse("2019-11-27");
        konto.paymentnotToday(konto, 50,date1);
        konto.withdrawnotToday(konto, 30,date2);
        konto.paymentnotToday(konto, 90,date3);
        LocalDate ld1 = LocalDate.parse("2019-11-26");
        LocalDate ld2 = LocalDate.parse("2019-11-28");
        konto.checkHistory(konto, ld1, ld2);
    }
    @Test
    public  void wypiszhistory()  {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        konto.payment(konto, 50);
        konto.payment(konto, -30);
        konto.payment(konto, 90);
        konto.wypiszHistory();
    }
    @Test
    public  void getwithdraw() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        account konto = new account (client);
        konto.withdraw(konto, 500);
        Assert.assertEquals( -500,konto.getBalance());
        //konto.wypiszHistory();
    }
    @Test
    public  void transcation() {
        Client client1 = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        Client client2 = new Client ("Wojtek Niekowalski", "Poziomkowa 30", 99001);
        account konto1 = new account (client1);
        account konto2 = new account (client2);
        konto1.transaction(konto1,konto2,300);
        Assert.assertEquals( -300,konto1.getBalance());
        Assert.assertEquals( 300,konto2.getBalance());
    }
    @Test
    public  void transcationNotToday() {
        Client client1 = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        Client client2 = new Client ("Wojtek Niekowalski", "Poziomkowa 30", 99001);
        LocalDate sent = LocalDate.parse("2019-11-26");
        LocalDate received = LocalDate.parse("2019-11-27");
        account konto1 = new account (client1);
        account konto2 = new account (client2);
        konto1.transactionnotToday(konto1,konto2,300,sent,received);
        Assert.assertEquals( -300,konto1.getBalance());
        Assert.assertEquals( 300,konto2.getBalance());
        Assert.assertEquals( sent,konto1.getOperations().get(0).getDate());
        Assert.assertEquals( received,konto2.getOperations().get(0).getDate());

    }
}