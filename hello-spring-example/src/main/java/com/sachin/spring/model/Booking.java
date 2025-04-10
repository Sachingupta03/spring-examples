package com.sachin.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
public class Booking {
    private int id;
    private double price;
    private Address address;

}
