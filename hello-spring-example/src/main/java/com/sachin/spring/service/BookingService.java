package com.sachin.spring.service;

import com.sachin.spring.model.Booking;

public class BookingService {

    public void printBooking(Booking booking) {
        System.out.println ("Booking Details: ");
        System.out.println (booking);
    }
}