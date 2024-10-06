package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Warszawa", "Polna", "5A");
        OnlineTicket onlineTicket = new OnlineTicket("Koncert", address, 100, 0.05);
        double onlineTicketFinalPrice = onlineTicket.applyFinalPrice(100, 0.05);
        System.out.println(onlineTicket.printInfo() + ", cena ostateczna: " + onlineTicketFinalPrice + "zł ");
        StandardTicket standardTicket = new StandardTicket("Koncert", address, 100, 0.05, 5);
        double standardTicketFinalPrice = standardTicket.applyFinalPrice(100, 0.05);
        System.out.println(standardTicket.printInfo() + standardTicket.printAdditionalInfo() + " cena ostateczna: "
                + standardTicketFinalPrice + "zł ");
        GiftTicket giftTicket = new GiftTicket("Koncert", address, 100, 0.05, 5);
        double giftService = giftTicket.giftService();
        double giftTicketFinalPrice = giftTicket.applyFinalPrice(100, 0.05);
        System.out.println(giftTicket.printInfo() + giftTicket.printAdditionalInfo() + ", opłata prezentowa: "
                + giftService + ", cena ostateczna: " + giftTicketFinalPrice + "zł ");
    }

    public OnlineTicket createOnlineTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę wydarzenia: ");
        String eventName = scanner.nextLine();
        System.out.println("Podaj adres wydarzenia: miasto, ulicę, numer");
        String city = scanner.nextLine();
        String street = scanner.nextLine();
        String streetNumber = scanner.nextLine();
        System.out.println("Podaj cenę pierwotną: ");
        double basicPrice = scanner.nextDouble();
        System.out.println("Podaj bonus: ");
        double bonus = scanner.nextDouble();
        scanner.nextLine();
        return new OnlineTicket(eventName, new Address(city, street, streetNumber), basicPrice, bonus);
    }
}

