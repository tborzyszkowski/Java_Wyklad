package invoice;

public class Customer {

	private String company;
	private String address;
	private String nip;
	private String bankAccount;

	public Customer(String company, String address, String nip, String bankAccount) {
		this.company = company;
		this.address = address;
		this.nip = nip;
		this.bankAccount = bankAccount;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getNip() {
		return nip;
	}

	public String getBankAccount() {
		return bankAccount;
	}
	
	public void showCustomer() {
		System.out.println("company: " + company +
				", address: " + address 
				+ ", nip: " + nip 
				+", bankAccount: " +  bankAccount
				);
	}

}
