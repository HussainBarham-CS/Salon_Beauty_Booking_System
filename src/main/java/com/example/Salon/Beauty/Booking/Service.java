package com.example.Salon.Beauty.Booking;

import com.example.Salon.Beauty.Booking.validation.ValidationServiceType;

public abstract class Service {

    //Custome Validation
    @ValidationServiceType
    protected ServiceType serviceType;


    public Service(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
    public void setType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
    public ServiceType getType() {
        return this.serviceType;
    }





}
