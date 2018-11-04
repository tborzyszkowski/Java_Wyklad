public class loanSystem {
    public static void main(String[] args) throws Exception {
        LoanApplication borrower1 = new LoanApplication(
                "Sofia", "Bennett", "92071314764",
                "856-188-45-49", "PL83 1010 1023 0000 2613 9510 0000",
                "1992-07-13", "female");

        LoanApplication borrower2 = new LoanApplication(
                "David", "Hughes", "81100216357",
                "328-787-26-96", "PL41 9093 1033 6190 2896 8949 4979",
                "1981-10-02",
                "male");

        LoanApplication borrower3 = new LoanApplication(
                "", "a", "94020238432",
                "123-456-78-91", "PL22 9843 1023 4938 3924 1111 0222",
                "1999-01-01", "male");

        LoanApplication borrower4 = new LoanApplication(
                "", "aBcde 22!", "1234567",
                "123-4", "213467",
                "1999-01-01", "male");

        System.out.println(borrower1);
        System.out.println(borrower2);
        System.out.println(borrower3);
        System.out.println(borrower4);
    }
}
