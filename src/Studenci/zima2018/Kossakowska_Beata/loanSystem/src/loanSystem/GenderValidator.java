package loanSystem;

public class GenderValidator implements Validation {

	@Override
	public boolean isValid(LoanApplication loanApplication) {
		
		String pesel = loanApplication.getPesel();
		int peselGender = Integer.parseInt(pesel.substring(9, 10));

		String gender = loanApplication.getGender();
		int controlNumber = peselGender % 2;
		if (controlNumber == 0 && gender == "K") {
			return true;
		} else if (controlNumber == 0 && gender == "M") {
			return true;
		}
		return false;
	}

}
