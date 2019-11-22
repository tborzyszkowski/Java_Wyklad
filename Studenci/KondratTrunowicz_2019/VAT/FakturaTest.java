import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FakturaTest {
    @Test
    public void getVolume() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Client client3 = new Client("ktos", "tam", 1233, 1234);
        Faktura faktura1 = new Faktura (client, client2);
        Faktura faktura2 = new Faktura (client, client3);
        Faktura faktura3 = new Faktura (client, client3);
        Faktura faktura4 = new Faktura (client, client3);
        Assert.assertEquals(faktura4.getVolume(), faktura1.getVolume()+3);
        //MOZE BYC PRZETESTOWANE JAKO
        //Assert.assertEquals(faktura4.getVolume(), 4);
        //GDY TEST JEST GENEROWANY OSOBNO
    }

    @Test
    public void getItems() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Item item = new Item("Laptopt", 10, 3, 1.37);
        Faktura faktura = new Faktura (client, client2);
        faktura.additem(item);
        ArrayList<Item> itemslist = new ArrayList<>();
        itemslist.add(item);
      // System.out.println(faktura.getItems());
      // System.out.println(Arrays.deepToString(faktura.getItems().toArray()));
        Assert.assertEquals(faktura.getItems(), itemslist);
    }

    @Test
    public void add_item() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Item item = new Item("Pepsi", 2, 5, 1);
        Faktura faktura = new Faktura (client, client2);
        faktura.additem(item);
        ArrayList<Item> itemslist = new ArrayList<>();
        itemslist.add(item);
        //System.out.println(faktura.getItems());
        //System.out.println(Arrays.deepToString(faktura.getItems().toArray()));
            Assert.assertEquals(faktura.getItems(), itemslist);
    }

    @Test
    public void sumbrutto() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Item item = new Item("skrzynka", 10, 5, 1.37);
        Item item2 = new Item("paleta", 3, 5, 1.37);
        Faktura faktura = new Faktura (client, client2);
        faktura.additem(item);
        faktura.additem(item2);
        faktura.setClosingprice(faktura.sumbrutto());
        Assert.assertEquals(faktura.getClosingprice(), 89.05, .0001);
    }
    @Test
    public void sumbruttoWithClientDiscount() {
        Client buyer = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Client seller = new Client("tomek", "jagodwa", 5678, 1234);
        Item item = new Item("skrzynka", 10, 5, 1, buyer);
        Item item2 = new Item("paleta", 3, 5, 1, buyer);
        Faktura faktura = new Faktura (buyer, seller);
        faktura.additem(item);
        faktura.additem(item2);
        faktura.setClosingprice(faktura.sumbrutto());
        Assert.assertEquals(faktura.getClosingprice(), 58.5, .0001);
    }
    @Test
    public void getGeneratedTime() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        String data = ft.format(currentDate);
        Assert.assertEquals(faktura.getGeneratedtime(),  data);
    }
    @Test
    public void getSoldTime() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setSoldtime("2019-11-22");
        Assert.assertEquals(faktura.getSoldtime(), "2019-11-22");
    }
    @Test
    public void getPayedTime() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setPayedtime("2019-11-22");
        Assert.assertEquals(faktura.getPayedtime(), "2019-11-22");
    }
    @Test
    public void setSoldTime() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setSoldtime("2019-11-22");
        Assert.assertEquals(faktura.getSoldtime(), "2019-11-22");
    }
    @Test
    public void setPayedTime() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setPayedtime("2019-11-22");
        Assert.assertEquals(faktura.getPayedtime(), "2019-11-22");
    }
    @Test
    public void setClosingPrice() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setClosingprice(65);
        Assert.assertEquals(faktura.getClosingprice(), 65, .0001);
    }
    @Test
    public void getClosingPrice() {
        Client client = new Client("wojtek", "poziomowa", 1234, 5678);
        Client client2 = new Client("tomek", "jagodwa", 5678, 1234);
        Faktura faktura = new Faktura (client, client2);
        faktura.setClosingprice(65);
        Assert.assertEquals(faktura.getClosingprice(), 65, .0001);
    }

}
