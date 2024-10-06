package pl.javastart.task;

public class Ticket {
    private String eventName;
    private Address address;
    private double basicPrice;
    private double bonus;
    private static int id = 0;

    public Ticket(String eventName, Address address, double basicPrice, double bonus) {
        this.eventName = eventName;
        this.address = address;
        this.basicPrice = basicPrice;
        this.bonus = bonus;
        id++;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    String printInfo() {
        return "Nazwa wydarzenia: " + eventName + ", " +
                "Adres: " + address.getInfo() + ", " +
                "Nr biletu: " + id + ", " +
                "cena podstawowa: " + basicPrice + "zł, " +
                "zniżka: " + bonus;
    }

    public double applyFinalPrice(double basicPrice, double bonus) {
        return basicPrice - (bonus * basicPrice);
    }
}
