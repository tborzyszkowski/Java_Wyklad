package loanSystem;

import java.time.LocalDate;

public class DateOfBirthValidation implements Validation {

	@Override
	public boolean isValid(LoanApplication loanApplication) {
		String pesel = loanApplication.getPesel();

		int peselToIntYear = Integer.parseInt(pesel.substring(0, 2));
		int peselToIntMonth = Integer.parseInt(pesel.substring(2, 4));
		int peselToIntDay = Integer.parseInt(pesel.substring(4, 6));

		String a = Integer.toString(loanApplication.getDateOfBirth().getYear());
		int x = Integer.parseInt(a.substring(2, 4));

		if (peselToIntYear == x && peselToIntMonth == loanApplication.getDateOfBirth().getMonthValue()
				&& peselToIntDay == loanApplication.getDateOfBirth().getDayOfMonth()) {
			return true;
		}
		return false;
	}

}
