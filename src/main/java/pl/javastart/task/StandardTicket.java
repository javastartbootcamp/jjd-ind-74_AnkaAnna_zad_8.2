package pl.javastart.task;

public class StandardTicket extends Ticket {
    private double additionalService;

    public StandardTicket(String eventName, Address address, double basicPrice, double bonus, double additionalService) {
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
        return super.applyFinalPrice(basicPrice, bonus) + additionalService;
    }

    @Override
    public String printInfo() {
        System.out.print("Bilet standardowy: ");
        return super.printInfo();
    }

    public String printAdditionalInfo() {
        return " Dodatkowa opłata: " + additionalService + "zł, ";
    }
}
