import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void getBank_account_number() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Assert.assertEquals(client.getName(), "nazwa");
    }

    @Test
    public void setBank_account_number() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        client.setBank_account_number(4321);
        Assert.assertEquals(client.getBank_account_number(), 4321);
    }

    @Test
    public void getNIP() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Assert.assertEquals(client.getNIP(), 1234);
    }

    @Test
    public void setNIP() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        client.setNIP(8765);
        Assert.assertEquals(client.getNIP(),8765 );
    }

    @Test
    public void getAddress() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Assert.assertEquals(client.getAddress(), "Gdziestam");
    }

    @Test
    public void setAddress() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        client.setAddress("Tamgdzies");
        Assert.assertEquals(client.getAddress(), "Tamgdzies");
    }

    @Test
    public void getName() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        Assert.assertEquals(client.getName(), "nazwa");
    }

    @Test
    public void setName() {
        Client client = new Client("nazwa", "Gdziestam", 1234, 5678);
        client.setName("innanazwa");
        Assert.assertEquals(client.getName(), "innanazwa");
    }
}