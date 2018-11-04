@SuppressWarnings("WeakerAccess")
public class Address {
    private String street;
    private String city;
    private String region;
    private String zipCode;
    private String country;

    public Address(String street, String city, String region, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
