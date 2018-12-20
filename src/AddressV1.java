public class AddressV1 {
    private int houseNumber;
    private String apartmentNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public AddressV1(int houseNumber, String street, String city, String state, int zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }

    public AddressV1(String apartmentNumber, String street, String city, String state, int zipCode) {
        this.apartmentNumber = apartmentNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }

    @Override
    public String toString() {
        return "Address: " + houseNumber + " "+ street + ", in " + city + ", " + state  + ". The zip code is " + zipCode;
    }

    public String toStringApartment() {
        return "Address: Apartment " + apartmentNumber +"on " + street + ", in " + city + ", " + state  + ". The zip code is " + zipCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
