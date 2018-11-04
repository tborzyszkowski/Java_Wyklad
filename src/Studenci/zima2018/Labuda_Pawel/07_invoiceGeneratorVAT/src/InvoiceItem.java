@SuppressWarnings("WeakerAccess")
public class InvoiceItem {
    private Product product;

    InvoiceItem() {
    }

    InvoiceItem(Product product) {
        this();
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "\n\t\t\tInvoiceItem{" +
                "product=" + product +
                '}';
    }
}
