import org.junit.Assert;

public class AddressTest {

    @org.junit.Test
    public void getCity() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Assert.assertEquals(address.getCity(), "miasto");
    }

    @org.junit.Test
    public void setCity() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        address.setCity("miasto2");
        Assert.assertEquals(address.getCity(), "miasto2");
    }

    @org.junit.Test
    public void getStreet() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Assert.assertEquals(address.getStreet(), "Ulica");
    }

    @org.junit.Test
    public void setStreet() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        address.setStreet("Ulica2");
        Assert.assertEquals(address.getStreet(), "Ulica2");
    }

    @org.junit.Test
    public void getApartment() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Assert.assertEquals(address.getApartment(), "dom");
    }

    @org.junit.Test
    public void setApartment() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        address.setApartment("dom2");
        Assert.assertEquals(address.getApartment(), "dom2");
    }

    @org.junit.Test
    public void getSuite() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Assert.assertEquals(address.getSuite(), "mieszkanie");
    }

    @org.junit.Test
    public void setSuite() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        address.setSuite("mieszkanie2");
        Assert.assertEquals(address.getSuite(), "mieszkanie2");
    }
}