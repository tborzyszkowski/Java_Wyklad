package lab3.FakrutaVat;

public class Client {
	
	private String company_name;
	private String street;
	private String post_code;
	private String city;
	private int nip;
	
	void setClientInfo(String company_name, String street, String post_code, String city) {
		
		this.company_name = company_name;
		this.street = street;
		this.post_code = post_code;
		this.city = city;
		
	}
	boolean checkNip(int nip) {
		
		char[] nip_digits = Integer.toString(nip).toCharArray();
		int[] weights = {6,5,7,2,3,4,5,6,7};
		int sum = 0;
		int digit = 0;
		boolean verified = false;
		
		if(Integer.toString(nip).length() != 10){
			return verified;
		}
		else {
			for(int i = 0; i < 9; i++) {
				digit = Character.getNumericValue(nip_digits[i]);
				sum = sum + digit * weights[i];
			}
			digit = Character.getNumericValue(nip_digits[9]);
			
			if(sum % 11 != digit) {
				return verified;
			}
			else {
				verified = true;
			}
		}
	
		return verified;
	}
	
	public void setNip(int nip) {
		if(checkNip(nip) == true) {
			this.nip = nip;
		}
		else {
			System.out.println("Wrong NIP, Try Again");
		}
	}
	@Override
	public String toString() {
		return  String.format("|  %15s  |  %10s  |  %10s  |  %10s  |  %10d  |", company_name, street, post_code, city, nip);
	}
}
