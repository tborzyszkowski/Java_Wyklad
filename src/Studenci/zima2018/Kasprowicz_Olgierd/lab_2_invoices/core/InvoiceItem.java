package lab2.core;

import java.util.StringJoiner;

public class InvoiceItem
{
    private final Product product;
    private final int amount;
    private final int percentageTaxRate;

    public InvoiceItem(Product product, int amount, int percentageTaxRate)
    {
        this.product = product;
        this.amount = amount;
        this.percentageTaxRate = percentageTaxRate;
    }

    public double getGrossTotal()
    {
        final double taxMultiplier = ((100 + percentageTaxRate) / 100.0);
        return this.getNetTotal() * taxMultiplier;
    }

    public double getNetTotal()
    {
        return this.product.getPrice() * this.amount;
    }

    public Product getProduct()
    {
        return product;
    }

    public int getAmount()
    {
        return amount;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", InvoiceItem.class.getSimpleName() + "[", "]")
                .add("product=" + product)
                .add("amount=" + amount)
                .add("percentageTaxRate=" + percentageTaxRate)
                .toString();
    }
}
