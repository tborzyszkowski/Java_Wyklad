import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void prototypeConstructorGetAccount(){
        Bank PKO = new Bank();
        Account kowalski = new Account("53 1231 5452 9349 2545 3459", 25000.00, PKO);
        Assert.assertEquals(25000.00, kowalski.getBalance(), 0.01);
    }
}
