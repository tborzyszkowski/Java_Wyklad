import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransferTest {

    @Test
    void makeTransfer() {

        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Owner owner2 = new Owner("Kuba", "Kowalski",new Date(2001, Calendar.APRIL, 14));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Account account2 = new Account(owner2,"0943 2154 9583 2357 2143 2345",3456.56);

        Transfer transfer = new Transfer();
        transfer.MakeTransfer("przelew",account1,account2,100.0);
        Assert.assertEquals(12214.12,account1.getBalance(),0.001);
        Assert.assertEquals(3556.56,account2.getBalance(),0.001);

    }

    @Test
    void withdraw() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Transfer transfer = new Transfer();
        transfer.Withdraw(account1,100.0);
        Assert.assertEquals(12214.12,account1.getBalance(),0.001);
    }

    @Test
    void deposit() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Transfer transfer = new Transfer();
        transfer.Deposit(account1,100.0);
        Assert.assertEquals(12414.12,account1.getBalance(),0.001);
    }
}