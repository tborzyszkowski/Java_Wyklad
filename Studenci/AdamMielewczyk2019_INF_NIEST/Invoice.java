import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    static private int inovoiceQuantity;

    private int inovoiceNumber;
    private List<Item> items = new ArrayList<Item>();
    private Client client;
    private Date creationDate;
    private Date saleDate;
    private Date transactionDate;

    public Invoice(Client client, Date saleDate, Date transactionDate) throws IllegalArgumentException{
        if(saleDate.after(new Date()))
            throw new IllegalArgumentException("towar sprzedany w przyszłości");
        if(transactionDate.after(new Date()))
            throw new IllegalArgumentException("towar zapłacony w przyszłości");
        creationDate = new Date();
        this.client = client;
        this.saleDate = saleDate;
        this.transactionDate = transactionDate;
        inovoiceNumber=++inovoiceQuantity;
    }

    @Override
    public String toString() {
        //nie drukuj pustej
        String temp="======================================================================================================\n" +
                    "||CREATION DATE                |SALE DATE                   |TRANSACTION DATE              |NUM     ||\n";
        String invoiceInfo= "||"+creationDate+" |"+saleDate+"| "+transactionDate+" |"+inovoiceNumber;
        for(int i=invoiceInfo.length();i<100;i++)
        {
            invoiceInfo+=" ";
        }
        invoiceInfo+="||\n";
        temp+=invoiceInfo;
        //trzecia linia skończona
        temp+=Client.stringLabel()+client.toString()+Item.stringLabel();
        for (Item item : items) {
            temp += item.toString()+"\n";
        }
        temp+="======================================================================================================\n"+
                "SUMMARY "+sumValue();
        return temp;
    }

    public static int getInovoiceQuantity() {
        return inovoiceQuantity;
    }

    public int getInovoiceNumber() {
        return inovoiceNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    public double sumValue(){
        int sum=0;
        for (Item item : items) {
            sum += item.getGrossPrice();
        }
        return sum;
    }

    public static void setInovoiceQuantity(int inovoiceQuantity) {
        Invoice.inovoiceQuantity = inovoiceQuantity;
    }

    public void setInovoiceNumber(int inovoiceNumber) {
        this.inovoiceNumber = inovoiceNumber;
    }
}