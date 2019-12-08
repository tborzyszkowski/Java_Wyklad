import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    public void getSource() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10);
        assertEquals(transaction.getSource(), account1);
    }

    @Test
    public void getDestination() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10);
        assertEquals(transaction.getDestination(),account2);
    }

    @Test
    public void getTitle() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10);
        assertEquals(transaction.getTitle(), "asdf");
    }

    @Test
    public void getAmount() {
        Account account1 = new Account(123, "abcd", "qwerty");
        Account account2 = new Account(456,"abcd", "qwerty" );
        Transaction transaction = new Transaction(account1, account2, "asdf", 10);
        assertEquals(transaction.getAmount(), 10, 0.001);
    }


    }
