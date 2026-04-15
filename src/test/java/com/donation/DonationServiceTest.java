package com.donation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DonationServiceTest {

    DonationService service = new DonationService();

    @Test
    public void testValidDonation() {
        Donation d = new Donation("User", 500);
        assertTrue(service.processDonation(d));
    }

    @Test
    public void testInvalidDonation() {
        Donation d = new Donation("User", -100);
        assertFalse(service.processDonation(d));
    }
}