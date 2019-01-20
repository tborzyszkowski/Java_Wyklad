import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        InvoiceNumber numer = new InvoiceNumber();
        Seller sprzedawca = new Seller("Januszex", "Stolarska 32, Gdańsk", "43533535", "PL 2034 0040 4324 03244 2114 4324");
        InvoiceElement jablko = new InvoiceElement("Jabłko", 32, 2.34, 0.08);
        InvoiceElement marchew = new InvoiceElement("Marchew", 221, 0.32, 0.05);
        InvoiceElement mieso = new InvoiceElement("Mięso", 2.44, 35, 0.23);

        Calendar issued = Calendar.getInstance();

        Calendar sold = Calendar.getInstance();
        sold.getTime();

        Calendar payment = Calendar.getInstance();
        payment.add(Calendar.MONTH, 1);

        Invoice rachunek = new Invoice(numer.getNumber(), issued, sold, payment, sprzedawca);
        rachunek.addElement(jablko);
        rachunek.addElement(marchew);
        rachunek.addElement(mieso);

        rachunek.printInvoice();

        Invoice rachunek2 = new Invoice(numer.getNumber(), issued, sold, payment, sprzedawca);
        rachunek2.addElement(jablko);
        rachunek2.addElement(marchew);
        rachunek2.addElement(mieso);
        rachunek2.printInvoice();


    }
}
