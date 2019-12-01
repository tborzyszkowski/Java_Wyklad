import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.time.LocalDate;
import java.util.ArrayList;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AccountTest {

    @Test
    void getAccountNumber() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        assertEquals(account.getAccountNumber(), "67123456780000000012345678");
    }

    @Test
    void getOwner() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        assertEquals(account.getOwner(), owner);
    }

    @Test
    void setOwner() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Owner owner1 = new Owner("Conrado", "Moreno", "45051401458");
        account.setOwner(owner1);
        assertEquals(account.getOwner(), owner1);
    }

    @Test
    void getBalance() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        assertEquals(account.getBalance(), 0);
    }

    @Test
    void changeBalance() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        account.changeBalance(100);
        assertEquals(account.getBalance(), 100);
    }

    @Test
    void getTransactionList() {
    Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
    Account account = new Account(owner, "67123456780000000012345678");
    ArrayList<Transaction> list = new ArrayList<Transaction>();
    assertEquals(account.getTransactionList(), list);
}

    @Test
    void addTransaction() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");
        Transaction transaction = new Transaction(account, 10, "wyplata");
        ArrayList<Transaction> list = new ArrayList<Transaction>();
        list.add(transaction);
        account.addTransaction(transaction);
        assertEquals(account.getTransactionList(), list);
    }
     @Test
     void transferTransaction() {
            Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
            Owner owner1 = new Owner("Stefan", "Kowlski", "44751401458");
            Account account = new Account(owner, "67123456780000000012345678");
            Account account1 = new Account(owner1, "11123456780000000012345678");
            account.changeBalance(11);
            Transaction transaction = new Transaction(account, account1, 10, "przelew");
            account.addTransaction(transaction);
            assertEquals(account.getBalance(), 1);
            assertEquals(account1.getBalance(), 10);
        }
     @Test
     void wrongTransferTransaction() {
            Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
            Owner owner1 = new Owner("Stefan", "Kowooolski", "44051901458");
            Account account = new Account(owner, "67123456780000000012345678");
            Account account1 = new Account(owner1, "11123456780000000012345678");
            account.changeBalance(11);
            assertThrows(IllegalArgumentException.class,() -> account.addTransaction(new Transaction(account, account1, -10, "przelew")));
        }

    @Test
    void getTransactionHistory() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");
        Account account = new Account(owner, "67123456780000000012345678");

        account.changeBalance(100);
        Transaction transaction = new Transaction(account,-10,"wyplata");
        transaction.setDate(LocalDate.of(2012,1,1));
        account.addTransaction(transaction);

        Transaction transaction1 = new Transaction(account,-10,"wyplata");
        transaction1.setDate(LocalDate.of(2015,1,1));
        account.addTransaction(transaction1);

        Transaction transaction2 = new Transaction(account,-10,"wyplata");
        transaction2.setDate(LocalDate.of(2022,5,22));
        account.addTransaction(transaction2);

        Transaction transaction3 = new Transaction(account,-10,"wyplata");
        transaction3.setDate(LocalDate.of(2016,5,22));
        account.addTransaction(transaction3);

        Transaction transaction4 = new Transaction(account,-10,"wyplata");
        transaction4.setDate(LocalDate.of(2016,4,22));
        account.addTransaction(transaction4);
        assertEquals(account.getTransactionHistory(LocalDate.of(2015,1,1),LocalDate.of(2019,1,1)).size(), 3);
    }
    @Test
    void wrongNumber() {
        Owner owner = new Owner("Stefan", "Kowalski", "44051401458");

        assertThrows(IllegalArgumentException.class, () -> new Account(owner, "6712345678008800001234678"));
    }
}