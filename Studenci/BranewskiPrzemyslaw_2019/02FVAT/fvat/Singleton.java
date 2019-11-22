package fvat;

public class Singleton {

	private static Singleton instance;
	private static int licznikFaktur;
	
	
	private Singleton()
	{
	}
	
	
	public static Singleton IncrementAndGetInstance()
	{
		licznikFaktur = licznikFaktur + 1;
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public int getLicznikFaktur()
	{
		return licznikFaktur;
	}
}
