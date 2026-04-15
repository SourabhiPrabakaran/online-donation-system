package com.donation;

public class DonationService {

    public boolean processDonation(Donation donation) {

        if (donation.getAmount() <= 0) {
            return false;
        }

        System.out.println("Donation processed: " + donation.getDonorName());
        return true;
    }
}