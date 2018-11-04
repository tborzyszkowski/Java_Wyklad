@SuppressWarnings("WeakerAccess")
public class InvoiceSystemItem {
    private InvoiceVat invoiceVat;

    InvoiceSystemItem() {
    }

    InvoiceSystemItem(InvoiceVat invoiceVat) {
        this();
        this.invoiceVat = invoiceVat;
    }

    @Override
    public String toString() {
        return "\n\tInvoiceSystemItem{" +
                "invoiceVat=" + invoiceVat +
                '}';
    }
}
