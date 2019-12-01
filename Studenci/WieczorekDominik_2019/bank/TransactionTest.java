import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void setDate() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        transaction.setDate(LocalDate.of(1999, 5, 22));
        assertEquals(transaction.getDate(), LocalDate.of(1999, 5, 22));
    }

    @Test
    void getTransferFrom() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        assertEquals(transaction.getTransferTo(), account);
    }

    @Test
    void getTransferTo() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Owner owner1 = new Owner("Stefan", "Kowlski", "44751401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Account account1 = new Account(owner1, "11123456780000000012345678");
        account.changeBalance(10);
        Transaction transaction = new Transaction(account, account1, 10, "przelew");
        assertEquals(transaction.getTransferTo(),account1);
    }

    @Test
    void getCash() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        assertEquals(transaction.getTransferTo(), account);
    }

    @Test
    void getTitle() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        assertEquals(transaction.getTitle(), "wyplata");
    }

    @Test
    void setTitle() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        transaction.setTitle("operacja");
        assertEquals(transaction.getTitle(), "operacja");

    }

    @Test
    void getDate() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account,10,"wyplata");
        assertEquals(transaction.getDate(), LocalDate.now());
    }
}