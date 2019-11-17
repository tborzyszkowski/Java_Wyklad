import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;

public class Bank {
    private int accountNumber;
    private static int nextAccountNumber = 1000000000;
    private double accountBalance;
    private ArrayList<LocalDate> operationsDate;
    private ArrayList<String> operationsSums;

    public Bank() {
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
        this.accountBalance = 0;
        this.operationsDate = new ArrayList<LocalDate>();
        this.operationsSums = new ArrayList<String>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addOperationSums(String newOperation) {
        operationsSums.add(newOperation);
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void getDate() {
        operationsDate.add(LocalDate.now());
    }

    public void getDate(String dateofOperation) {
        LocalDate operationDate = LocalDate.parse(dateofOperation, DateTimeFormatter.BASIC_ISO_DATE);
        operationsDate.add(operationDate);
    }

    public double payIn(double payment) {
        this.accountBalance += payment;
        getDate();
        operationsSums.add("Payment: +" + payment + "$");
        return this.accountBalance;
    }

    public double payIn(double payment, String date) {
        this.accountBalance += payment;
        getDate(date);
        operationsSums.add("Payment: +" + payment + "$");
        return this.accountBalance;
    }

    public double payOut(double paycheck) {
        this.accountBalance -= paycheck;
        getDate();
        operationsSums.add("Paycheck: -" + paycheck + "$");
        return this.accountBalance;
    }

    public double payOut(double paycheck, String date) {
        this.accountBalance -= paycheck;
        getDate(date);
        operationsSums.add("Paycheck: -" + paycheck + "$");
        return this.accountBalance;
    }

    public void showOperations() {

        for (int i = 0; i < operationsDate.size(); i++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formatDate = operationsDate.get(i).format(formatter);
            System.out.println("Operations in account number " + this.getAccountNumber());
            System.out.println(formatDate + " ||| " + operationsSums.get(i));
        }
    }

    public void showFilteredOperations(String fromDate, String toDate) {

        LocalDate dateFrom = LocalDate.parse(fromDate, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dateTo = LocalDate.parse(toDate, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Operations in account number " + this.getAccountNumber());
        System.out.println("Date\t   ||| Operation");
        for(int i = 0; i < operationsDate.size(); i++) {
            if (operationsDate.get(i).isAfter(dateFrom) && operationsDate.get(i).isBefore(dateTo)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formatDate = operationsDate.get(i).format(formatter);
                System.out.println(formatDate + " ||| " + operationsSums.get(i));
            }
        }
    }
}