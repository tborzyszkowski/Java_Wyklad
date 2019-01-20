public class InvoiceElement {
    private String name;
    private double quantity;
    private double netValue;
    private double tax;

    public InvoiceElement(String name, double quantity, double netValue, double tax) {
        this.name = name;
        this.quantity = quantity;
        this.netValue = netValue;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getNetValue() {
        return netValue;
    }

    public double getTax() {
        return tax;
    }

    public double getElementNetValue() {
        return getQuantity() * getNetValue();
    }

    public double getElementTaxValue() {
        return getQuantity() * getNetValue() * getTax();
    }

    public double getElementValue() {
        return getQuantity() * getNetValue() * (1 + getTax());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setNetValue(double netValue) {
        this.netValue = netValue;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return name + '\t' +
                +quantity + '\t' +
                +netValue + '\t' +
                +tax + '\t' +
                +getElementNetValue() + '\t' +
                +getElementTaxValue() + '\t' +
                +getElementValue();
    }
}
