import org.junit.*;

public class OperationsTest {

    @Test
    public void prototypeConstructorGetAmount(){
        Bank pko = new Bank();
        Account kowalski = new Account("53 1231 5452 9349 2545 3459", 25000.00, pko);
        Operations trans1 = new Operations("2019-11-11", kowalski, 2000.0);
        Assert.assertEquals(2000.0, trans1.getAmount(), 0.01);
    }

    @Test
    public void prototypeConstructorGetBalance(){
        Bank pko = new Bank();
        Account kowalski = new Account("53 1231 5452 9349 2545 3459", 25000.00, pko);
        Account nowak = new Account("32 5346 8462 9401 0000 0001", 54000.00, pko);
        Operations trans1 = new Operations("2019-11-11", kowalski, nowak, 2000.0);
        Assert.assertEquals(56000.0, nowak.getBalance(), 0.01);
    }
}

