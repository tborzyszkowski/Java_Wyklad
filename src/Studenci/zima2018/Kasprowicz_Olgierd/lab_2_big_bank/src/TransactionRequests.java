abstract class TransactionRequest
{
    protected Transaction transaction;
    protected Customer originator;

    public Transaction getTransaction()
    {
        return transaction;
    }

    public Customer getOriginator()
    {
        return originator;
    }

    abstract public boolean isValid();
}

class TransferRequest extends TransactionRequest
{
    public TransferRequest(Customer originator, Account from, Account to, double amount)
    {
        this.originator = originator;
        this.transaction = new Transaction(from, to, amount);
    }

    @Override
    public boolean isValid()
    {
        return this.originator.equals(this.transaction.getSender().getOwner());
    }
}

class DepositRequest extends TransactionRequest
{

    public DepositRequest(Customer originator, Account to, double amount)
    {
        this.originator = originator;
        this.transaction = new Transaction(new NullAccount(), to, amount);
    }

    @Override
    public boolean isValid()
    {
        return true;
    }
}

class WithdrawRequest extends TransactionRequest
{
    public WithdrawRequest(Customer originator, Account from, double amount)
    {
        this.originator = originator;
        this.transaction = new Transaction(from, new NullAccount(), amount);
    }

    @Override
    public boolean isValid()
    {
        return this.originator.equals(this.transaction.getSender().getOwner());
    }
}