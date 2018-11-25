package Invoice;

import Invoice.Models.CompanyData;
import Invoice.Models.InvoiceNumber;
import Invoice.Models.InvoicePosition;
import Invoice.Models.TimeStemp;
import JavaMarkt.Modele.Product;


public class Main {
    public static void main(String[] args){
        TimeStemp timeStemp = new TimeStemp();
        TimeStemp payTyme = new TimeStemp(2018,12,10);
        TimeStemp buyTime = new TimeStemp(2018,10,23);
        InvoiceNumber invoiceNumber = new InvoiceNumber(2);
        CompanyData companyData = new CompanyData("Nazwa", "Adres", "58588");
        InvoicePosition produkts = new InvoicePosition();
        produkts.addProduct(new Product("Jablko", 2.0,8.0), 3)
                .addProduct(new Product("Gruszka", 3.0, 8.0), 4)
                .addProduct(new Product("Pietruszka", 5.0, 23.0), 5);


        System.out.println("Data wystawienia: " + timeStemp);
        System.out.println(companyData);
        System.out.println("Nr faktury: " + invoiceNumber.generateNumber());
        System.out.println("Data kupna: " + buyTime);
        System.out.println(produkts);
        System.out.println("Kwota brutto do zapłaty: " + produkts.invoiceBruttoPrice() + "zł");
        System.out.println("Data zapłaty: " + payTyme);
    }
}
