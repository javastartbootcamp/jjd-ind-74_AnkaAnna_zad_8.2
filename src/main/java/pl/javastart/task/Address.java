package pl.javastart.task;

public class Address {
    private String city;
    private String street;
    private String streetNumber;

    public Address(String city, String street, String streetNumber) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
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

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    
    String getInfo() {
        return city + ", " + street + " " + streetNumber;
    }
}
