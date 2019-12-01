package bank;

public interface ILogObservable {
	
	public void attach(ILogObserver observer);
	
	public ILogObserver detach();
	
	public void notifyObserver(Log log);	
}
