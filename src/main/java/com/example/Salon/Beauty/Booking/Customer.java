package com.example.Salon.Beauty.Booking;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer extends Person {
    private List<Booking> bookings;

    public Customer(@NotNull(message = "Name is mandatory") String name,
                    @Email(message = "Error in enter email") String email, String phone) {

        super(name, email, phone);
        this.bookings = new ArrayList<>();
    }
//////////////////Setters and Getters///////////////////////
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setEmail(String email) {this.email=email;}
    @Override
    public String getEmail() {
        return this.email;
    }
    @Override
    public void setPhone(String phone) {this.phone=phone;}
    @Override
    public String getPhone() {
        return this.phone;
    }



///////////////////////Methods/////////////////////////

    public void bookService(Stylist stylist, ServiceType service, int dateAndTime) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Customer customer = new Customer(getName(),getEmail(),getPhone());
        this.bookings.add(new Booking(randomNumber,customer,stylist,service,dateAndTime));

    }

    public List<Booking> getBooking() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void cancelBooking(Booking booking) {

        for(int i=0;i<this.bookings.size();i++){
            if(this.bookings.get(i).equals(booking))
            {
                this.bookings.remove(booking);
            }
        }
    }

    public void rateStylist(Stylist stylist, int rating) {

    }

    @Override
    public void display() {
        System.out.println("Name : "+this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Phone : "+this.phone);
    }


}
