package loanSystem;

public class SurnameValidator implements Validation {
	@Override
	public boolean isValid(LoanApplication loanApplication) {
		String surname = loanApplication.getSurname();
		char[] chars = surname.toCharArray();

		if (surname.isEmpty()) {
			return false;
		}
		if (surname.length() < 2) {
			return false;
		}
		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}

		return true;

	}
}
