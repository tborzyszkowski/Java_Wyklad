package bank;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getOwnerFirstName() {
        Account account = new Account(123, "abcd", "qwerty");
        assertEquals("abcd", account.getOwnerFirstName());
    }

    @Test
    public void getOwnerLastName() {
        Account account = new Account(123, "abcd", "qwerty");
        assertEquals("qwerty", account.getOwnerLastName());
    }

    @Test
    public void setOwnerFirstName() {
        Account account = new Account(123, "abcd", "qwerty");
        account.setOwnerFirstName("ghjk");
        assertEquals("ghjk", account.getOwnerFirstName());
    }

    @Test
    public void setOwnerLastName() {
        Account account = new Account(123, "abcd", "qwerty");
        account.setOwnerLastName("ghjk");
        assertEquals("ghjk", account.getOwnerLastName());
    }

    @Test
    public void getBalance() {
        Account account = new Account(123, "abcd", "qwerty");
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void getAccountNumber() {
        Account account = new Account(123, "abcd", "qwerty");
        assertEquals(123, account.getAccountNumber());
    }

    @Test
    public void getTransactions() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10.0);
        account1.addTransaction(transaction);
        ArrayList<Transaction> x = new ArrayList<>();
        x.add(transaction);
        assertEquals(x, account1.getTransactions());
    }

    @Test
    public void getTransactionsWithDate() {
        Account account = new Account(123, "abcd", "qwerty");
        Transaction transaction1 = new Transaction(account, account, "a", 10.0);
        Transaction transaction2 = new Transaction(account, account, "b", 10.0);
        Transaction transaction3 = new Transaction(account, account, "c", 10.0);
        Transaction transaction4 = new Transaction(account, account, "d", 10.0);
        transaction1.setDate(LocalDate.of(2019, 1, 1));
        transaction2.setDate(LocalDate.of(2019, 1, 2));
        transaction3.setDate(LocalDate.of(2019, 1, 3));
        transaction4.setDate(LocalDate.of(2019, 1, 4));
        account.addTransaction(transaction1);
        account.addTransaction(transaction2);
        account.addTransaction(transaction3);
        account.addTransaction(transaction4);
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction2);
        transactions.add(transaction3);
        assertEquals(transactions, account
                .getTransactions(LocalDate.of(2019,1,2),
                        LocalDate.of(2019, 1, 3)));
    }

    @Test
    public void addTransaction() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456, "abcd", "qwerty");
        Transaction transaction = new Transaction(account1, account2, "asdf", 10.0);
        account1.addTransaction(transaction);
        ArrayList<Transaction> x = new ArrayList<>();
        x.add(transaction);
        assertEquals(x, account1.getTransactions());
    }

    @Test
    public void addTransactionBalance() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10.0);
        account1.addTransaction(transaction);
        ArrayList<Transaction> x = new ArrayList<>();
        x.add(transaction);
        assertEquals(-10.0, account1.getBalance(), 0.001);
    }

    @Test
    public void changeBalance() {
        Account account = new Account(123, "abcd", "qwerty");
        account.changeBalance(10.0);
        assertEquals(10.0, account.getBalance(), 0.001);
    }
}
