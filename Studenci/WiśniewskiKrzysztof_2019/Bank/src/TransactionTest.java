import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TransactionTest {

    @Test
    public void getFrom() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
        Account account1 = new Account(owner, 123456);
        Transaction transaction = new Transaction(account1, account1, 12, "Abc");
        Assert.assertEquals(transaction.getFrom(), account1);
    }

    @Test
    public void getTo() {
            Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
            Account account1 = new Account(owner, 123456);
            Account account2 = new Account(owner, 213456);
            Transaction transaction = new Transaction(account1, account2, 12, "Abc");
            Assert.assertEquals(transaction.getTo(), account2);
    }

    @Test
    public void getAmount() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
        Account account1 = new Account(owner, 123456);
        Transaction transaction = new Transaction(account1, account1, 12, "Abc");
        Assert.assertEquals(transaction.getAmount(), 12, 0.01);
    }

    @Test
    public void getTitle() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
        Account account1 = new Account(owner, 123456);
        Transaction transaction = new Transaction(account1, account1, 12, "Abc");
        Assert.assertEquals(transaction.getTitle(), "Abc");
    }

    @Test
    public void setTitle() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
        Account account1 = new Account(owner, 123456);
        Transaction transaction = new Transaction(account1, account1, 12, "Abc");
        transaction.setTitle("Def");
        Assert.assertEquals(transaction.getTitle(), "Def");
    }

    @Test
    public void getDate() {
        Transaction transaction = mock(Transaction.class);
        when(transaction.getDate()).thenReturn(LocalDate.of(1990, 1, 1));
        Assert.assertEquals(transaction.getDate(), LocalDate.of(1990, 1, 1));
    }
    @Test
    public void getTransactionNumber() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1));
        Account account1 = new Account(owner, 123456);
        Transaction transaction = new Transaction(account1, account1, 12, "Abc");
        Transaction transaction2 = new Transaction(account1, account1, 12, "Abc");
        Assert.assertEquals(transaction.getTransaction_number(), transaction2.getTransaction_number()-1);
    }
}