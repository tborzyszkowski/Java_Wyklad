import java.util.Date;

public class DatedTransaction extends Transaction
{
    private final Date timestamp;

    public DatedTransaction(Transaction transaction, Date stamp)
    {
        super(transaction.getSender(), transaction.getReceiver(), transaction.getAmount());
        this.timestamp = stamp;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }
}
