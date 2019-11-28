import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private String apartment;
    private String suite;

    public Address(String city, String street, String apartment, String suite) {
        this.city = city;
        this.street = street;
        this.apartment = apartment;
        this.suite = suite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(apartment, address.apartment) &&
                Objects.equals(suite, address.suite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, apartment, suite);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }
}
