package employees.logic;

public class Adress {
	
	private String street;
	private int houseNumber;
	private int suiteNumber;
	private String city;
	
	public Adress(String street, String city, int houseNumber, int suiteNumber) {
		setStreet(street);
		setCity(city);
		setHouseNumber(houseNumber);
		setSuiteNumber(suiteNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() == obj.getClass()) {
			Adress temp = (Adress) obj;
			if(this.getHouseNumber() != temp.getHouseNumber())
				return false;
			if(!this.getStreet().equals(temp.getStreet()))
				return false;
			if(this.getSuiteNumber() != temp.getSuiteNumber())
				return false;
			if(!this.getCity().equals(temp.getCity()))
				return false;
		}
		else
			return false;
		
		return true;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getSuiteNumber() {
		return suiteNumber;
	}
	public void setSuiteNumber(int suiteNumber) {
		this.suiteNumber = suiteNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
