package faktura;

public class Address {
	
	private String street;
	private String houseNumber;
    private String city;
    private String zipCode;
    
    public Address() {
    	
    }
    
	public Address(String street, String houseNumber, String city, String zipCode) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.zipCode = zipCode;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
    
    


}
