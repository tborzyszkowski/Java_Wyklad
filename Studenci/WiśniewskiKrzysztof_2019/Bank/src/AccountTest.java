import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountTest {

    @Test
    public void getOwner() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Assert.assertEquals(account.getOwner(), owner);
    }

    @Test
    public void setOwner() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Owner owner2 = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        account.setOwner(owner2);
        Assert.assertEquals(account.getOwner(), owner);

    }

    @Test
    public void getNumber() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Assert.assertEquals(account.getNumber(), 123456);
    }

    @Test
    public void getBalance() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Assert.assertEquals(account.getBalance(), 0, 0.01);
    }

    @Test
    public void changeBalance() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        account.change_balance(12.0);
        Assert.assertEquals(account.getBalance(), 12, 0.01);
    }

    @Test(expected = ValueException.class)
    public void BadLengthOfNumber() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        new Account(owner, 12345);

    }

    @Test
    public void getTransactions() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Transaction transaction = new Transaction(account, account, 12.0, "abc");
        account.addTransaction(transaction);
        ArrayList<Transaction> list = new ArrayList<>();
        list.add(transaction);
        Assert.assertEquals(account.getTransactions().size(), 3);

    }

    @Test
    public void addTransaction() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Transaction transaction = new Transaction(account, account, 12.0, "abc");
        account.addTransaction(transaction);
        ArrayList<Transaction> list = new ArrayList<>();
        list.add(transaction);
        Assert.assertEquals(account.getTransactions().get(2), list.get(0));
    }

    @Test
    public void getTransactionsWithDate() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1));
        Account account = new Account(owner, 123456);
        Transaction transaction = mock(Transaction.class);
        when(transaction.getDate()).thenReturn(LocalDate.of(1990, 1, 1))
                .thenReturn(LocalDate.of(2020, 1, 2))
                .thenReturn(LocalDate.of(2010, 1, 1));
        account.addTransaction(transaction);
        account.addTransaction(transaction);
        account.addTransaction(transaction);
        Assert.assertEquals(account.getTransactions(LocalDate.of(1980, 1, 1), LocalDate.of(2020, 1, 1)).size(), 2);
    }


}