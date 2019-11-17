import static org.mockito.Mockito.*;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDate;
import java.util.ArrayList;

public class InvoiceTest {

    @Test
    public void getItems() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        Assert.assertEquals(invoice.getItems(), items);
    }

    @Test
    public void add_item() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        Assert.assertEquals(invoice.getItems(), items);
    }

    @Test
    public void getClient() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        Assert.assertEquals(invoice.getClient(), client);

    }

    @Test
    public void setClient() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        Client client2 = new Client("nazwa2", "Gdziestam2", 1234, 5678);
        invoice.setClient(client2);
        Assert.assertEquals(invoice.getClient(), client2);
    }


    @Test
    public void getCreation_time() {
        Invoice invoice = mock(Invoice.class);
        when(invoice.getCreation_time()).thenReturn(LocalDate.parse("2019-11-17"));
        Assert.assertEquals(invoice.getCreation_time(), LocalDate.parse("2019-11-17"));
    }

    @Test
    public void getSell_time() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.setSell_time(LocalDate.parse("2019-11-17"));
        Assert.assertEquals(invoice.getSell_time(), LocalDate.parse("2019-11-17"));
    }

    @Test
    public void setSell_time() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.setSell_time(LocalDate.parse("2019-11-17"));
        Assert.assertEquals(invoice.getSell_time(), LocalDate.parse("2019-11-17"));
    }

    @Test
    public void getPayment_time() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.setPayment_time(LocalDate.parse("2019-11-17"));
        Assert.assertEquals(invoice.getPayment_time(), LocalDate.parse("2019-11-17"));
    }

    @Test
    public void setPayment_time() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.setPayment_time(LocalDate.parse("2019-11-17"));
        Assert.assertEquals(invoice.getPayment_time(), LocalDate.parse("2019-11-17"));
    }

    @Test
    public void get_sum() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Item item2 = new Item("Lays", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        invoice.add_item(item2);
        Assert.assertEquals(invoice.get_sum(), 7.38, .001);
    }

    @Test
    public void get_invoice_number() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        Invoice invoice2 = new Invoice(client);
        Assert.assertEquals(invoice2.get_invoice_number(), invoice.get_invoice_number() + 1);
    }

    @Test
    public void remove_item() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Item item2 = new Item("Lays", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        invoice.add_item(item2);
        invoice.remove_item("Pepsi");
        Assert.assertEquals(invoice.getItems().size(), 1);
    }
    @Test
    public void edit_item() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Item item2 = new Item("Pepsi", 3, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        invoice.edit_item(item2);
        Assert.assertEquals(invoice.get_item("Pepsi"), item2);

    }
    @Test
    public void get_item() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Item item = new Item("Pepsi", 2, 1.5, 0.23);
        Invoice invoice = new Invoice(client);
        invoice.add_item(item);
        Assert.assertEquals(invoice.get_item("Pepsi"), item);
    }
    @Test(expected = IllegalArgumentException.class)
    public void get_item_exception(){
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.get_item("abc");

    }
    @Test(expected = IllegalArgumentException.class)
    public void remove_item_exception(){
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Invoice invoice = new Invoice(client);
        invoice.remove_item("abc");

    }



}