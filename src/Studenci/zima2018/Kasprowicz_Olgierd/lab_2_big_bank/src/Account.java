import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Account
{
    private final Customer owner;
    private final String number;

    private final List<DatedTransaction> history;

    protected Account()
    {
        this.owner = null;
        this.history = new ArrayList<>();
        this.number = null;
    }

    public Account(Customer owner, String number)
    {
        this.owner = owner;
        this.history = new ArrayList<>();
        this.number = number;
    }

    public List<Transaction> getHistory(Date from, Date to)
    {
        return this.history
                .stream()
                .filter(x -> x.getTimestamp().after(from))
                .filter(x -> x.getTimestamp().before(to))
                .collect(Collectors.toList())
                ;
    }

    public double getBalance()
    {
        return Stream
            .concat(
                history
                    .stream()
                    .filter(transaction -> transaction.getReceiver().equals(this))
                    .map(Transaction::getAmount),
                history
                    .stream()
                    .filter(transaction -> !transaction.getReceiver().equals(this))
                    .map(Transaction::getAmount)
                    .map(x -> -x)
            )
            .reduce(0.0, Double::sum)
            ;
    }

    public void addTransaction(DatedTransaction transaction)
    {
        this.history.add(transaction);
    }

    @Deprecated
    public void addTransaction(Transaction transaction)
    {
        this.history.add(new DatedTransaction(transaction, null));
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
                .add("owner=" + owner)
                .add("number='" + number + "'")
                .toString();
    }

    public Customer getOwner()
    {
        return owner;
    }

    public String getNumber()
    {
        return number;
    }
}
