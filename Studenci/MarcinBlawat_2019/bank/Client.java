package bank;

public class Client {
	
	private String m_name;
	private String m_lastName;
	
	public Client(String name, String lastName)
	{
		setName(name);
		setLastName(lastName);
	}
	
	public String getName() {
		return m_name;
	}
	private void setName(String name) {
		this.m_name = name;
	}
	public String getLastName() {
		return m_lastName;
	}
	private void setLastName(String lastName) {
		this.m_lastName = lastName;
	}
	
	
}
