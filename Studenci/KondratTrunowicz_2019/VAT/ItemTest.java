import org.junit.*;
public class ItemTest {
    @Test
    public void ItemGetName() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        Assert.assertEquals("skrzynka", item.getItem_name());
    }
    @Test
    public void ItemGetQuantiyty() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        Assert.assertEquals(20, item.getQuantity());
    }
    @Test
    public void ItemGetPrice() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        Assert.assertEquals(40, item.getPrice());
    }
    @Test
    public void setItemName() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        item.setItem_name("belka");
        Assert.assertEquals("belka", item.getItem_name());
    }
    @Test
    public void setItemQuantiyty() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        item.setQuantity(50);
        Assert.assertEquals(50, item.getQuantity());
    }
    @Test
    public void setItemPrice() {
        Item item = new Item ("skrzynka", 20, 40,1.37);
        item.setPrice(35);
        Assert.assertEquals(35, item.getPrice());
    }
    @Test
    public void netto() {
        Item item = new Item ("skrzynka", 20, 40,1.37);

        Assert.assertEquals(item.getNetto(), 800);
    }
    @Test
    public void ItemGetvat() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        Assert.assertEquals(1.37, item.getvat(), 0.001);
    }
    @Test
    public void setItemvat() {
        Item item = new Item ("skrzynka", 20, 40, 1.37);
        item.setvat(50);
        Assert.assertEquals(50, item.getvat(), 0.001);
    }
    @Test
    //STALY KLIENT POWINIEN OTRZYMAC 10% ZNIZKI
    public void ClientWithDiscount() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Item item = new Item ("skrzynka", 20, 40, 1.37, client);
        Assert.assertEquals(item.getBrutto(), 986.4,0.001);
    }
    @Test
    public void ClientWithOutDiscount() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "newclient");
        Item item = new Item ("skrzynka", 20, 40, 1.37, client);
        Assert.assertEquals(item.getBrutto(), 1096,0.001);
    }



}
