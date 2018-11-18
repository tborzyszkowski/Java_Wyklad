package fakturaVat;

public class Client {
	
	private String name;
	private String surname;
	private String city;
	private String account;
	
	public Client(String name, String surname, String city, String account) {
		super();
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return name + " " + surname + ", City: " + city + ", transfer from - " + account;
	}
}
