package com.example.Salon.Beauty.Booking;

import lombok.AllArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


public class Stylist extends Person{

    private List<ServiceType> specialties;
    private WorkingHours workingHours;
    private List<Booking> bookings;


    public Stylist(@NotNull(message = "Name is mandatory") String name,
                   @Email(message = "Error in enter email") String email,
                   String phoneNumber, List<ServiceType> specialties, WorkingHours workingHours) {

        super(name, email, phoneNumber);
        this.specialties = specialties;
        this.workingHours = workingHours;
        bookings = new ArrayList<>();
    }

    @Override
    public void setName(String name) { this.name=name;}
    @Override
    public String getName() {return this.name;}
    @Override
    public void setEmail(String email) {this.email=email;}
    @Override
    public String getEmail() {return this.email;}
    @Override
    public void setPhone(String phone) {this.phone=phone;}
    @Override
    public String getPhone() {return this.phone;}


    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }


    public void setSpecialties(List<ServiceType> specialties) {
        this.specialties = specialties;
    }

    public List<ServiceType> getSpecialties() {
        return specialties;
    }


    public void setWorkingHours(WorkingHours workingHours) {
        this.workingHours = workingHours;
    }

    public WorkingHours getWorkingHours() {
        return workingHours;
    }
}
