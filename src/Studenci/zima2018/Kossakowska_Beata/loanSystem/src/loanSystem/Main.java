package loanSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		LoanApplication loanApplication1 = new LoanApplication("Aa", "Zaq", "98765432192", "12345", "1234567890",
				LocalDate.of(1900, 10, 10), "K");
		LoanApplication loanApplication2 = new LoanApplication("Aaa", "Zaq", "77111110211", "12345", "1234567890",
				LocalDate.of(1977, 11, 11), "K");

		List<Validation> validations = new ArrayList<>();
		validations.add(new NipValidator());
		validations.add(new AccountNumberValidator());
		validations.add(new DateOfBirthValidation());
		validations.add(new PeselValidator());
		validations.add(new GenderValidator());
		validations.add(new FirstNameValidator());
		validations.add(new SurnameValidator());

		checkApplication(loanApplication1, validations);
		checkApplication(loanApplication2, validations);

	}

	private static void checkApplication(LoanApplication loanApplication, List<Validation> validations) {
		for (Validation validation : validations) {
			if (validation.isValid(loanApplication)) {
				System.out.println("correct data");
			} else {
				System.out.println("incorrect data");
			}
		}
	}

}
