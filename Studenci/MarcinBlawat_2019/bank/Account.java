package bank;

public class Account implements ILogObservable {
	
	@SuppressWarnings("unused")
	private Client m_owner;
	private double m_funds;
	private ILogObserver m_logger;
	private String number;
	
	public Account(Client owner, String number) {
		setOwner(owner);
		setFunds(0.0d);
		setNumber(number);
	}
	
	public Account(Client owner, String accountNumber, ILogObserver observer)
	{
		this(owner, accountNumber);
		attach(observer);
	}
	
	public void put(double amount) {
		this.m_funds += amount;
	}
	
	public String getNumber() {
		return number;
	}

	private void setNumber(String number) {
		this.number = number;
	}

	public void withdraw(double amount)
	{
		this.m_funds -= amount;
	}
	
	private void setOwner(Client owner) {
		this.m_owner = owner;
	}
	public double balance() {
		return m_funds;
	}
	private void setFunds(double funds) {
		this.m_funds = funds;
	}

	public TransactionLogger logger() {
		return (TransactionLogger)this.m_logger;
	}
	
	@Override
	public void attach(ILogObserver observer) {
		this.m_logger = observer;	
	}

	@Override
	public ILogObserver detach() {
		var temp = m_logger;
		m_logger = null;
		return temp;
	}

	@Override
	public void notifyObserver(Log log) {
		if(this.m_logger != null)
			this.m_logger.update(log);
	}
	
}
