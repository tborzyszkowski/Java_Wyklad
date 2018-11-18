package lab2;

import lab2.core.Buyer;
import lab2.core.Invoice;
import lab2.core.Product;
import lab2.core.TaxRateProvider;
import lab2.utils.NowDateProvider;
import lab2.utils.UniqueIdProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        NowDateProvider nowDateProvider = new NowDateProvider();
        UniqueIdProvider uniqueIdProvider = new UniqueIdProvider();
        TaxRateProvider taxRateProvider = new TaxRateProvider();

        InvoiceFactory invoiceFactory = new InvoiceFactory(uniqueIdProvider, nowDateProvider, taxRateProvider);

        Invoice invoice = invoiceFactory.makeInvoiceFor(new ArrayList<>(Arrays.asList(
           new Product(30, "elo"),
           new Product(30, "elo")
        )), new Buyer(), new Date());

        System.out.println(invoice.getTotal());
    }
}
