package com.sachin.spring;

import com.sachin.spring.model.Address;
import com.sachin.spring.model.Booking;
import com.sachin.spring.service.AddressService;
import com.sachin.spring.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Load Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");

        // Get AddressService bean
        AddressService addressService =  context.getBean("addressService", AddressService.class);

        Address address =  context.getBean("address", Address.class);

        // Call the printAddress method
        addressService.printAddress(address);

        BookingService bookingService = context.getBean ("bookingService", BookingService.class);

        Booking booking =context.getBean ("booking", Booking.class);

        bookingService.printBooking (booking);
    }
}
