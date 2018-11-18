package loanSystem;

public class AccountNumberValidator implements Validation {

	@Override
	public boolean isValid(LoanApplication loanApplication) {

		// Algorytm (c) R.J.Żyłła 2000-2004 */

		String iban = loanApplication.getBankAccountNumber();
		iban = iban.toUpperCase().replaceAll("[\\p{Punct}\\p{Space}]*", "");
		if (!iban.matches("^[A-Z]{2}[0-9]{12,}"))

			return false;

		iban = iban.substring(4, iban.length()) + iban.substring(0, 4);

		for (int i = 0; i < iban.length(); i++) {
			char c = iban.charAt(i);
			if (Character.isUpperCase(c)) {
				int code = Character.getNumericValue(c);
				iban = iban.substring(0, i) + code + iban.substring(i + 1, iban.length());
			}
		}
		int mod = 0;
		int isize = iban.length();
		for (int i = 0; i < isize; i = i + 6) {
			try {
				mod = Integer.parseInt("" + mod + iban.substring(i, i + 6), 10) % 97;
			} catch (StringIndexOutOfBoundsException e) {

				return false;

			}
		}
		return (mod == 1);

	}

}
