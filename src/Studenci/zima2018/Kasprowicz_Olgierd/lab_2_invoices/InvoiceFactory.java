package lab2;

import lab2.core.*;

import lab2.utils.NowDateProvider;
import lab2.utils.UniqueIdProvider;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

public class InvoiceFactory
{
    private final UniqueIdProvider idProvider;
    private final NowDateProvider nowProvider;
    private final TaxRateProvider taxRateProvider;

    public InvoiceFactory(UniqueIdProvider idProvider, NowDateProvider nowProvider, TaxRateProvider taxRateProvider)
    {
        this.idProvider = idProvider;
        this.nowProvider = nowProvider;
        this.taxRateProvider = taxRateProvider;
    }

    public Invoice makeInvoiceFor(Collection<Product> products, Buyer buyer, Date goodsSoldDate)
    {
        Collection<InvoiceItem> invoiceItems = products
                .stream()
                .distinct()
                .map(distinctProduct -> this.makeInvoiceItem(distinctProduct, products))
                .collect(Collectors.toList())
                ;

        Integer invoiceId = this.idProvider.getNextId();
        Date currentDate = this.nowProvider.getCurrentDate();

        return new Invoice(invoiceItems, buyer, goodsSoldDate, invoiceId, currentDate);
    }

    private InvoiceItem makeInvoiceItem(Product product, Collection<Product> allProducts)
    {
        return new InvoiceItem(
                product,
                (int) allProducts
                        .stream()
                        .filter(product::equals)
                        .count()
                ,
                this.taxRateProvider.getTaxRateFor(product)
        );
    }

    public Invoice makeInvoiceFor(Collection<Product> products, Buyer buyer, Date goodsSoldDate, Date paymentReceivedDate)
    {
        Invoice invoice = this.makeInvoiceFor(products, buyer, goodsSoldDate);

        invoice.setPaymentReceivedDate(paymentReceivedDate);

        return invoice;
    }
}
