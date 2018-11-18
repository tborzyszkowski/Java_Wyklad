package loanSystem;

import java.time.LocalDate;
import java.util.Date;

public class LoanApplication {
	private String firstName;
	private String surname;
	private String pesel;
	private String nip;
	private String bankAccountNumber;
	private LocalDate dateOfBirth;
	private String gender;

	public LoanApplication(String firstName, String surname, String pesel, String nip, String bankAccountNumber,
			LocalDate dateOfBirth, String gender) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.pesel = pesel;
		this.nip = nip;
		this.bankAccountNumber = bankAccountNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
