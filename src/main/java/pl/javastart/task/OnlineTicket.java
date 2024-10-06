package pl.javastart.task;

import java.util.Scanner;

public class OnlineTicket extends Ticket {

    public OnlineTicket(String eventName, Address address, double basicPrice, double bonus) {
        super(eventName, address, basicPrice, bonus);
    }

    @Override
    public double applyFinalPrice(double basicPrice, double bonus) {
        return super.applyFinalPrice(basicPrice, bonus);
    }

    @Override
    String printInfo() {
        System.out.print("Bilet internetowy: ");
        return super.printInfo();
    }
}
