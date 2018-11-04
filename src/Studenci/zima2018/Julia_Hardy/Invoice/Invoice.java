
package Invoice;
public class Invoice {
    public static void main(String[] args) {

        double total_price = 0;

        Order[] positions = new Order[3];

        positions[0] = new Order("apple", 20, 2.5);
        positions[1] = new Order("banana", 40, 2.67);
        positions[2] = new Order("water", 15, 3.44);


        int x = 0;
        while(x < positions.length){
            positions[x].getOrder_price();
            positions[x].getTax();
            total_price = total_price + positions[x].getPrice_b();
            System.out.println(positions[x]);
            x = x + 1;
        }
        System.out.println("Total price: " + total_price);

        PersonalData client = new PersonalData("adbc","ul.Mazowiecka 15/3B Warszawa", "123417", "12345669876500000");
        System.out.println("Personal data:" + client);

        InvoiceData i = new InvoiceData();
        i.getInvoice_date();
        i.getPay_date();
        i.getSell_date();
        i.generate_invoice_nr();
        System.out.println(i);

    }
}
