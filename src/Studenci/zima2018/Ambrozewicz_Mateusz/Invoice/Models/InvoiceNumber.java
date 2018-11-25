package Invoice.Models;

import java.time.LocalDate;


public class InvoiceNumber {
    private String number;
    private int month;
    private int year;

    public InvoiceNumber(int number){
        this.number = Integer.toString(number);
    }

    public String generateNumber(){
        LocalDate today = LocalDate.now();
        month = today.getMonthValue();
        year = today.getYear();
        return number+"/"+month+"/"+year;
    }


}
