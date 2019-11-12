import java.util.*;

public class Bank {
    private List<Account> listAcc = new ArrayList<>();

    void listAccAdd(Account newAccount){
        listAcc.add(newAccount);
    }

    public static void main(String[] args){
        Bank pko = new Bank();
        Account kowalski = new Account("53 1231 5452 9349 2545 3459", 25000.00, pko);
        Account nowak = new Account("32 5346 8462 9401 0000 0001", 54000.00, pko);
        Operations trans1 = new Operations("2019-11-11", kowalski, nowak, 2000.0);
        Operations trans2 = new Operations("2019-11-11", kowalski, -2000.0);
        System.out.println(kowalski.toString());
    }
}
