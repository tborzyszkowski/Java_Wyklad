import org.junit.*;
public class ClientTest {
    @Test
    public void ClientGetName() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        Assert.assertEquals("Wojtek Kowalski" ,client.getName());
    }
    @Test
    public void ClientGetAdress() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);

        Assert.assertEquals("Poziomkowa 31" ,client.getAddress());
    }
    @Test
    public void ClientGetBankNumber() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 123456);

        Assert.assertEquals(123456 ,client.getTel_number());
    }
    @Test
    public void setClientName() {
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        client.setName("stefan stefanski");
        Assert.assertEquals(client.getName(), "stefan stefanski");
    }
    @Test
    public void setClientAdress() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        client.setAddress("Jagodowa 13");
        Assert.assertEquals("Jagodowa 13" ,client.getAddress());
    }
    @Test
    public void setClientBankCountry() {
        // Arrange
        Client client = new Client ("Wojtek Kowalski", "Poziomkowa 31", 99011);
        client.setTel_number(123456);
        Assert.assertEquals(123456 ,client.getTel_number());
    }


}