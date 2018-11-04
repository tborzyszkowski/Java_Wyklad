import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class InvoiceSystem {
    private ArrayList<InvoiceSystemItem> invoices = new ArrayList<>();

    public InvoiceSystem() {
    }

    public InvoiceSystem addInvoice(InvoiceVat invoice) {
        invoices.add(new InvoiceSystemItem(invoice));
        return this;
    }

    @Override
    public String toString() {
        return "\nInvoiceSystem{" +
                "invoices=" + invoices +
                '}';
    }
}
