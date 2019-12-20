class Address {
    private String city;
    private String street;
    private int buildingNumber;
    private int placeNumber;

    public Address(String city, String street, int buildingNumber, int placeNumber) {
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.placeNumber = placeNumber;
    }

    public Address(String city, String street, int buildingNumber) {
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.placeNumber = -1;
    }

    @Override
    public String toString() {
        if(placeNumber==-1)
            return buildingNumber+" "+street+", "+city;
        else
            return placeNumber+", "+buildingNumber+" "+street+", "+city;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }
}