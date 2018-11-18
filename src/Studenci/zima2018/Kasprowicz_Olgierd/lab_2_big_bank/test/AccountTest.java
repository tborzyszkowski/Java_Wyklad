import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest
{
    private Account testAccount;

    @Before
    public void setUp()
    {
        this.testAccount = new Account(null, "test");
    }

    @Test
    public void noTransactions()
    {
        double actual = this.testAccount.getBalance();

        Assert.assertEquals(0, actual, 0.01);
    }

    @Test
    public void singleTransaction()
    {
        this.testAccount.addTransaction(new Transaction(null, this.testAccount, 10));

        double actual = this.testAccount.getBalance();

        Assert.assertEquals(10, actual, 0.01);
    }

    @Test
    public void manyTransactions()
    {
        this.testAccount.addTransaction(new Transaction(new NullAccount(), this.testAccount, 20));
        this.testAccount.addTransaction(new Transaction(this.testAccount, new NullAccount(), 30));
        this.testAccount.addTransaction(new Transaction(new NullAccount(), this.testAccount, 50));

        double actual = this.testAccount.getBalance();

        Assert.assertEquals(40, actual, 0.01);
    }
}