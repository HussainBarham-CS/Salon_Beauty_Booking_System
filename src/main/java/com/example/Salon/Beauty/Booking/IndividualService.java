package com.example.Salon.Beauty.Booking;

import javax.validation.constraints.NotNull;

public class IndividualService extends Service {

    private int duration;
    private double price;

    public IndividualService(ServiceType serviceType,int duration,double price) {
        super(serviceType);
        this.duration=duration;
        this.price=price;
    }



}
