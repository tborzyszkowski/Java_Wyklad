import org.junit.*;

public class TransferTest {

    @Test
    public void makeTransfer() {
        Bank konto1 = new Bank();
        Bank konto2 = new Bank();

        konto1.payIn(1000.00);
        Transfer przelew = new Transfer(konto1, konto2);
        przelew.makeTransfer(1000.00, konto1, konto2);
        Assert.assertEquals(konto2.getAccountBalance(), 1000.00, 0.001);
    }
}