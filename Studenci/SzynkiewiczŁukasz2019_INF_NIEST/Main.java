import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Bank konto1 = new Bank();
        Bank konto2 = new Bank();

        konto1.payIn(1500.00);
        konto1.payOut(345.55);

        Transfer przelew1 = new Transfer(konto1, konto2);
        przelew1.makeTransfer(300, konto1, konto2);

        //Pokaż wszystkie operacje wykonane z konta 1
        konto1.showOperations();

        konto2.payIn(2344, "20191102");
        konto2.payOut(34.56);
        konto2.payIn(150.45, "20191108");
        konto2.payOut(20.00, "20191110");

        LocalDate now = LocalDate.now();
        String currentDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);

        //Pokaż operacje w danym okresie
        konto2.showFilteredOperations("20191107", currentDate);
    }
}