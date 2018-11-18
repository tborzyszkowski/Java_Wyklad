package faktura;
import faktura.Address;
public class Company {

	private String companyName;
	private Address address;
	private String nip;
	private String accountNumber;
	
	
	public Company(String companyName, Address address, String nip, String accountNumber) {
		this.companyName = companyName;
		this.address = address;
		this.nip = nip;
		this.accountNumber = accountNumber;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getNip() {
		return nip;
	}


	public void setNip(String nip) {
		this.nip = nip;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	
}
