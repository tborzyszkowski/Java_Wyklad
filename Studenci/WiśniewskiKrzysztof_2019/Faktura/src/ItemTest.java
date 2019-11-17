import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Test
    public void getGross_price() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getGross_price(), 3.69, 0.01);
    }


    @Test
    public void getVAT() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getVAT(), 0.23, 0.01);
    }

    @Test
    public void setVAT() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        item.setVAT(0.3);
        Assert.assertEquals(item.getVAT(), 0.3, 0.01);
    }

    @Test
    public void getNet_price() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getNet_price(), 3.0, 0.01);
    }

    @Test
    public void getUnit_price() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getUnit_price(), 1.5, 0.01);
    }

    @Test
    public void setUnit_price() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        item.setUnit_price(2);
        Assert.assertEquals(item.getUnit_price(), 2, 0.01);
    }

    @Test
    public void getQuantity() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getQuantity(), 2);
    }

    @Test
    public void setQuantity() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        item.setQuantity(3);
        Assert.assertEquals(item.getQuantity(), 3);

    }

    @Test
    public void getName() {
        Item item = new Item("Pepsi", 2, 1.5,0.23 );
        Assert.assertEquals(item.getName(), "Pepsi");
    }

}