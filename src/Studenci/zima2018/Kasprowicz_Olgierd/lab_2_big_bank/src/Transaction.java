import java.util.StringJoiner;

public class Transaction
{
    private final Account sender;
    private final Account receiver;
    private final double amount;

    public Transaction(Account sender, Account receiver, double amount)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public Account getSender()
    {
        return sender;
    }

    public Account getReceiver()
    {
        return receiver;
    }

    public double getAmount()
    {
        return amount;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Transaction.class.getSimpleName() + "[", "]")
                .add("sender=" + sender)
                .add("receiver=" + receiver)
                .add("amount=" + amount)
                .toString();
    }
}
