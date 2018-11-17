package fakturaVat;

public class Comp {
	private String name;
	private String city;
	private String nip;
	private String account;
	
	public Comp(String name, String city, String nip, String account) {
		super();
		this.name = name;
		this.city = city;
		this.nip = nip;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNIP() {
		return nip;
	}
	public void setNIP(String nip) {
		this.nip = nip;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Company name " + name + 
				", City: " + city + 
				", NIP " + nip + 
				", Bank number - " + account;
	}
}
