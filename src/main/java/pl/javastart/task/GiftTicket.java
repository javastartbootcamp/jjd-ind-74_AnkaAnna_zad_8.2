package pl.javastart.task;

public class GiftTicket extends Ticket {

    private double additionalService;

    public GiftTicket(String eventName, Address address, double basicPrice, double bonus, double additionalService) {
        super(eventName, address, basicPrice, bonus);

        this.additionalService = additionalService;
    }

    public double getAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(double additionalService) {
        this.additionalService = additionalService;
    }

    @Override
    public double applyFinalPrice(double basicPrice, double bonus) {
        return super.applyFinalPrice(basicPrice, bonus) + additionalService + giftService();
    }

    public double giftService() {
        return getBonus() * (getBasicPrice() - (getBonus() * getBasicPrice()));
    }

    @Override
    String printInfo() {
        System.out.print("Bilet prezentowy: ");
        return super.printInfo();
    }

    public String printAdditionalInfo() {
        return " Dodatkowa opłata: " + additionalService + "zł, ";
    }
}
