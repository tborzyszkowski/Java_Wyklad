import org.junit.Assert;
import org.junit.Test;

public class ClientSellerTest {
    @Test
    public void Test_name(){
        ClientSeller client = new ClientSeller("Wojtek","Malbork", "213112312");
        Assert.assertEquals("Wojtek",client.getName());
    }
    @Test
    public void Test_adress(){
        ClientSeller client = new ClientSeller("Wojtek","Malbork", "213112312");
        Assert.assertEquals("Malbork",client.getAdress());
    }
    @Test
    public void Test_NIP(){
        ClientSeller client = new ClientSeller("Wojtek","Malbork", "213112312");
        Assert.assertEquals("213112312",client.getNIP());
    }
    @Test
    public void Test_name_buyer(){
        ClientSeller client = new ClientSeller("Wojtek","Malbork", "213112312", "123 1231 3123 123 123");
        Assert.assertEquals("123 1231 3123 123 123",client.getBankAccount());
    }
    @Test
    public void Test_set_name() {
        ClientSeller client = new ClientSeller();
        client.setName("Wojtek");
        Assert.assertEquals("Wojtek",client.getName());
    }
    @Test
    public void Test_set_adress() {
        ClientSeller client = new ClientSeller();
        client.setAdress("Malbork");
        Assert.assertEquals("Malbork",client.getAdress());
    }
    @Test
    public void Test_set_NIP() {
        ClientSeller client = new ClientSeller();
        client.setNIP("1234567890");
        Assert.assertEquals("1234567890",client.getNIP());
    }
    @Test
    public void Test_set_bank_account() {
        ClientSeller client = new ClientSeller();
        client.setBankAccount("1234 1243 1244 1234");
        Assert.assertEquals("1234 1243 1244 1234",client.getBankAccount());
    }
}
