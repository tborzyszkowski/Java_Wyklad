package loanSystem;

public class PeselValidator implements Validation {

	public boolean isValid(LoanApplication loanApplication) {

		// @ z kodatnik.blogspot.com

		String pesel = loanApplication.getPesel();
		int[] wagi = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };

		if (pesel.length() != 11)
			return false;

		int suma = 0;
		for (int i = 0; i < 10; i++)
			suma += Integer.parseInt(pesel.substring(i, i + 1)) * wagi[i];

		int cyfraKontrolna = Integer.parseInt(pesel.substring(10, 11));

		suma %= 10;
		suma = 10 - suma;
		suma %= 10;

		return (suma == cyfraKontrolna);

	}
}