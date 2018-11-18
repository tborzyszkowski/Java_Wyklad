package lab3.FakrutaVat;

import java.util.Arrays;

public class Vendor extends Client {
	
	private String bank_account;
	
	void setVendorInfo(String company_name, String street, String post_code, String city, int nip, String bank_account) {
		
		setClientInfo(company_name, street, post_code, city);
		this.setBankAccount(bank_account);
		this.setNip(nip);
		
	}
	
	public void setBankAccount(String bank_account) {
		
		if(checkBankAccountNumber(bank_account) == true) {
			this.bank_account = bank_account;
		}
		else {
			System.out.println("Wrong bank account number, Try Again");
		}
	}

	boolean checkBankAccountNumber(String bank_account) {
		
		boolean verified = false;
		String accepted_characters[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String bank_account_nm[] = bank_account.split("");
		
		if(bank_account.length() != 26) {
			return verified;
		}
		
		for(String digit : bank_account_nm) {
			if(Arrays.stream(accepted_characters).anyMatch(digit::equals)) {
				verified = true;
			}
			else {
				verified = false;
			}
		}
		
		return verified;
	}
		
	public String toString() {
		return super.toString() + String.format("  %s |", bank_account);
	}

}
