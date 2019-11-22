import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
    private static int number = 1;
    private int invoice_number;
    private ArrayList<Item> items;
    private Client client;
    private LocalDate creation_time;
    private LocalDate sell_time;
    private LocalDate payment_time;
    private double sum;

    public Invoice(Client client) {
        this.client = client;
        this.creation_time = LocalDate.now();
        this.items = new ArrayList<>();
        this.invoice_number = number;
        number++;

    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public void add_item(Item item) {
        this.items.add(item);
        calculate_sum();
    }

    public void remove_item(String name) {
         if (!items.removeIf(item -> item.getName() == name)) {
             throw new IllegalArgumentException("Item not found");
         }
        calculate_sum();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreation_time() {
        return creation_time;
    }

    public LocalDate getSell_time() {
        return sell_time;
    }

    public void setSell_time(LocalDate sell_time) {
        this.sell_time = sell_time;
    }

    public LocalDate getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(LocalDate payment_time) {
        this.payment_time = payment_time;
    }
    public int get_invoice_number(){
        return this.invoice_number;
    }
    public double get_sum(){
        return this.sum;
    }
    public void edit_item(Item item) {
        this.remove_item(item.getName());
        this.add_item(item);
    }
    public Item get_item(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName() == name){
                return items.get(i);
            }
        }
        throw new IllegalArgumentException("Item not found");
    }


    private void calculate_sum() {
        sum = 0;
        items.forEach(item -> sum += item.getGross_price());
    }

}
