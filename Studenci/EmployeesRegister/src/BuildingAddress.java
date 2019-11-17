public class BuildingAddress {

    private String city;
    private String street;
    private int buildingNumber;
    private int placeNumber;

    public BuildingAddress(String city, String street, int buildingNumber, int placeNumber) {
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.placeNumber = placeNumber;
    }

    @Override
    public String toString() {
        return "BuildingAddress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", placeNumber=" + placeNumber +
                '}';
    }
}
