import java.util.StringJoiner;

public class Customer
{
    private final String name;
    private Banker banker;

    public Customer(String name, Banker banker)
    {
        this.name = name;
        this.banker = banker;
    }

    public String getName()
    {
        return name;
    }

    public void setBanker(Banker banker)
    {
        this.banker = banker;
    }

    public void deposit(Account target, double amount) // throw TransactionRejected
    {
        banker.request(new DepositRequest(this, target, amount));
    }

    public void transfer(Account from, Account to, double amount) // throw TransactionRejected
    {
        banker.request(new TransferRequest(this, from, to, amount));
    }

    public void withdraw(Account target, double amount) // throw TransactionRejected
    {
        banker.request(new WithdrawRequest(this, target, amount));
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
