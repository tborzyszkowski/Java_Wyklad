package loanSystem;

public class FirstNameValidator implements Validation {

	@Override
	public boolean isValid(LoanApplication loanApplication) {
		String firstName = loanApplication.getFirstName();
		char[] chars = firstName.toCharArray();

		if (firstName.isEmpty()) {
			return false;
		}
		if (firstName.length() < 2) {
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
