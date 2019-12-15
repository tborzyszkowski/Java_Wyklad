import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts=new ArrayList<>();

    void addAccount(Account acc)
    {
        accounts.add(acc);
    }
}
