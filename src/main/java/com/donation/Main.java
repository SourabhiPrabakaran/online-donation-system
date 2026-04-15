package com.donation;

public class Main {

    public static void main(String[] args) {

        DonationService service = new DonationService();

        Donation d1 = new Donation("Sourabhi", 500);
        Donation d2 = new Donation("User2", -100);

        System.out.println("Processing Donation 1:");
        System.out.println(service.processDonation(d1));

        System.out.println("Processing Donation 2:");
        System.out.println(service.processDonation(d2));
    }
}