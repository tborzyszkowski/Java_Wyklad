package Invoice;
import java.util.Calendar;
import java.util.Date;

public class InvoiceData {

    public static int x = 0;
    private String invoice_nr;
    private Date pay_date;
    private Date invoice_date;
    private Date sell_date;


    public String generate_invoice_nr(){
        x = x + 1;
        invoice_nr = "ABCD" + x;
        return invoice_nr;
    }

    public Date getPay_date() {
        Calendar c = Calendar.getInstance();
        c.setTime(invoice_date);
        c.add(Calendar.DATE, 20);
        pay_date = c.getTime();
        return pay_date;
    }

    public Date getInvoice_date() {
        invoice_date = new Date();
        return invoice_date;
    }

    public Date getSell_date() {
        Calendar c = Calendar.getInstance();
        c.setTime(invoice_date);
        c.add(Calendar.DATE, -2);
        sell_date = c.getTime();
        return sell_date;
    }

    @Override
    public String toString() {
        return "InvoiceData{" +
                "invoice_nr='" + invoice_nr + '\'' +
                ", pay_date='" + pay_date + '\'' +
                ", invoice_date=" + invoice_date +
                ", sell_date='" + sell_date + '\'' +
                '}';
    }
}
