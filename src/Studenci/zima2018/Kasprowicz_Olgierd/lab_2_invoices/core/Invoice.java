package lab2.core;

import java.util.Collection;
import java.util.Date;

public class Invoice
{
    private final Collection<InvoiceItem> items;
    private final Buyer buyer;
    private final Integer id;
    private final Date issueDate;
    private final Date goodsSoldDate;

    private Date paymentReceivedDate;
    private boolean isPaymentReceiveDateSet = false;

    public Invoice(Collection<InvoiceItem> invoiceItems, Buyer buyer, Date goodsSoldDate, Integer id, Date currentDate)
    {
        this.items = invoiceItems;
        this.buyer = buyer;
        this.goodsSoldDate = goodsSoldDate;
        this.id = id;
        this.issueDate = currentDate;
    }

    public double getTotal()
    {
        return items
            .stream()
            .map(InvoiceItem::getGrossTotal)
            .reduce(0.0, Double::sum)
            ;
    };

    public void setPaymentReceivedDate(Date paymentReceivedDate)
    {
        if (!this.isPaymentReceiveDateSet)
        {
            this.paymentReceivedDate = paymentReceivedDate;
            this.isPaymentReceiveDateSet = true;
        }
        // or throw, but missing the point here really
    }

    public Collection<InvoiceItem> getItems()
    {
        return items;
    }

    public Buyer getBuyer()
    {
        return buyer;
    }

    public Integer getId()
    {
        return id;
    }

    public Date getIssueDate()
    {
        return issueDate;
    }

    public Date getGoodsSoldDate()
    {
        return goodsSoldDate;
    }

    public Date getPaymentReceivedDate()
    {
        return paymentReceivedDate;
    }
}
