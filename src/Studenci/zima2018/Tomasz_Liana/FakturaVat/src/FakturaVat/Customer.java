package FakturaVat;

public class Customer {

	private String company;
	private String street;
	private String city;
	private String post_code;
	private String nip;
	private String bankAccount;

	public Customer(String company, String city, String street, String post_code,  String nip, String bankAccount) {
		this.company = company;
		this.city = city;
		this.street = street;
		this.post_code = post_code;
		this.nip = nip;
		this.bankAccount = bankAccount;
	}

	public String getCompany() {
		return company;
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPost_code() {
		return post_code;
	}


	public String getNip() {
		return nip;
	}

	public String getBankAccount() {
		return bankAccount;
	}
	
	public void showCustomer() {
		System.out.println("company: " + company +
				", city: " + city 
				+",strret " + street
				+",post_code " + post_code
				+ ", nip: " + nip 
				+", bankAccount: " +  bankAccount
				);
	}

	

}
