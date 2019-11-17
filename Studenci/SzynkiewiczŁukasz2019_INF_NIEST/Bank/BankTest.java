import org.junit.*;

public class BankTest {

    private Bank konto1;
    private Bank konto2;

    @Before
    public void start() {
        this.konto1 = new Bank();
        this.konto2 = new Bank();
    }

    @Test
    public void testAccountNumber() {
        Assert.assertNotEquals(konto1.getAccountNumber(), konto2.getAccountNumber());
    }

    @Test
    public void testPayIn() {
        double payment = 50.55;
        konto1.payIn(payment);
        Assert.assertEquals(konto1.getAccountBalance(), payment, 0.001);
    }

    @Test
    public void testPayOut() {
        konto1.payIn(1000);
        konto1.payOut(250.00, "20190708");
        Assert.assertEquals(konto1.getAccountBalance(), 750.00, 0.001);

    }
}
