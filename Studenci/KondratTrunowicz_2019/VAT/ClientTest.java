import org.junit.*;

public class ClientTest {
    @Test
    public void ClientGetName() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals("Wojtek Kowalski" ,client.getName());
    }
    @Test
    public void ClientGetAdress() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals("Poziomkowa 31" ,client.getAddress());
    }
    @Test
    public void ClientGetPESEL() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals(client.getPESEL(),99011);
    }
    @Test
    public void ClientGetNIP() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals(1234 ,client.getNIP());
    }
    @Test
    public void ClientGetBankCountry() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals("Poland" ,client.getBank_country());
    }
    @Test
    public void ClientGetBankNumber() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals(123456 ,client.getBank_account_number());
    }
    @Test
    public void ClientGetCategory() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        Assert.assertEquals("premium" ,client.getClient_category());
    }
    @Test
    public void setClientName() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setName("stefan stefanski");
        Assert.assertEquals(client.getName(), "stefan stefanski");
    }
    @Test
    public void setClientAdress() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setAddress("Jagodowa 13");
        Assert.assertEquals("Jagodowa 13" ,client.getAddress());
    }
    @Test
    public void setClientPESEL() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setPESEL(11111);
        Assert.assertEquals(client.getPESEL(),11111);
    }
    @Test
    public void setBank_account_number() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setBank_account_number(123);
        Assert.assertEquals(client.getBank_account_number(), 123);
    }
    @Test
    public void setClientNIP() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setNIP(1235);
        Assert.assertEquals(1235 ,client.getNIP());
    }
    @Test
    public void setClientBankCountry() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setBank_country("France");
        Assert.assertEquals("France" ,client.getBank_country());
    }
    @Test
    public void setClientCategory() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011, 1234, "Poland", 123456, "premium");
        client.setClient_category("non-premium");
        Assert.assertEquals("non-premium" ,client.getClient_category());
    }
}