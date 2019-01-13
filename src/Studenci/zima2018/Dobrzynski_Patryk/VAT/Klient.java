package VAT;

public class Klient {
	private String companyName;
	private String address;
	private int NIP;
	private int bankAccount;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNIP() {
		return NIP;
	}
	public void setNIP(int nIP) {
		NIP = nIP;
	}
	public double getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Klient(String companyName, String address, int nIP, int bankAccount) {
		super();
		this.companyName = companyName;
		this.address = address;
		NIP = nIP;
		this.bankAccount = bankAccount;
	}
	public Klient() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dane klienta: [companyName= " + companyName + ", address= " + address + ", NIP= " + NIP + ", bankAccount= "
				+ bankAccount + "]";
	}
	
	
	
	
	
	
	
	
	
}
