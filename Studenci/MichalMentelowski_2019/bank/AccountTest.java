package bank;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void deposit() {
    Owner owner = new Owner("abc", "def");
    Account account = new Account(owner, 123456);
    account.deposit(5000);
    Assert.assertEquals(account.getBalance(), 5000, 0);
  }
  @Test
  void withdraw() {
    Owner owner = new Owner("abc", "def");
    Account account = new Account(owner, 123456);
    account.deposit(18000);
    account.withdraw(5000);
    Assert.assertEquals(account.getBalance(), 13000, 0);
  }

  @Test
  void getTransactions() {
    Owner owner = new Owner("abc", "def");
    Owner owner2 = new Owner("def", "abc");
    Account account = new Account(owner, 123456);
    Account account2 = new Account(owner2, 12345);
    Transaction transaction = new Transaction(account,account2,50,"for drinks") ;
    account.addTransaction(transaction);
    account.addTransaction(transaction);
    account.addTransaction(transaction);
    Assert.assertEquals(account.getTransactions(LocalDate.of(2000, 5, 15), LocalDate.now().plusDays(1)).size(), 4);
  }
  }