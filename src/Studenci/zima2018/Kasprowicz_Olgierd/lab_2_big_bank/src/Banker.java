import java.util.Date;
import java.util.stream.Stream;

public class Banker
{
    public boolean request(TransactionRequest transactionRequest)
    {
        if (transactionRequest.isValid())
        {
            Date stampDate = new Date();
            Transaction transaction = transactionRequest.getTransaction();

            DatedTransaction datedTransaction = new DatedTransaction(transaction, stampDate);

            Stream
                    .of(
                        transaction.getReceiver(),
                        transaction.getSender()
                    )
                    .forEach(
                        account ->
                            account.addTransaction(datedTransaction)
                    )
            ;

            return true;
        }
        else
        {
            // throw TransactionRejected
            return false;
        }
    }
}
