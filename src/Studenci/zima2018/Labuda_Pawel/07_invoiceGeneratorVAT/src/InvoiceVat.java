import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("WeakerAccess")
public class InvoiceVat {
    private ArrayList<InvoiceItem> items = new ArrayList<>();
    private double totalGross;
    private Company company;
    private int vatInvoiceNumber;
    private Date dateOfIssue;
    private Date dateOfSale;
    private Date dateOfPayment;

    public InvoiceVat() {
    }

    public InvoiceVat(String dateOfIssue, String dateOfSale, String dateOfPayment) throws Exception {
        this();
        this.vatInvoiceNumber = hashCode();
        this.dateOfIssue = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue);
        this.dateOfSale = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfSale);
        this.dateOfPayment = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfPayment);
    }

    public InvoiceVat addProduct(Product product) {
        items.add(new InvoiceItem(product));
        this.totalGross = calcTotalGross();
        return this;
    }

    public InvoiceVat removeProduct(Product product) {
        for (InvoiceItem item : items) {
            if (item.getProduct().equals(product)) {
                items.remove(item);
                this.totalGross = calcTotalGross();
                return this;
            }
        }

        return this;
    }

    public InvoiceVat addCompany(Company company) {
        this.company = company;
        return this;
    }

    private double calcTotalGross() {
        double gross = 0;
        for (InvoiceItem item : items) gross += item.getProduct().calcGross();
        return Math.round(gross * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "\n\t\tInvoiceVat{" +
                "items=" + items +
                ", \n\t\t\t\ttotalGross=" + totalGross +
                ", \n\t\t\t\tcompany=" + company +
                ", \n\t\t\t\tvatInvoiceNumber='" + vatInvoiceNumber + '\'' +
                ", \n\t\t\t\tdateOfIssue=" + formatter.format(dateOfIssue) +
                ", \n\t\t\t\tdateOfSale=" + formatter.format(dateOfSale) +
                ", \n\t\t\t\tdateOfPayment=" + formatter.format(dateOfPayment) +
                '}';
    }
}
