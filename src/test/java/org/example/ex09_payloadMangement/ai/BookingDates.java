package org.example.ex09_payloadMangement.ai;

import java.time.LocalDate;

class BookingDates {
    private LocalDate checkin;
    private LocalDate checkout;

    // Constructors
    public BookingDates() {}
    public BookingDates(LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Getters and Setters
    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
