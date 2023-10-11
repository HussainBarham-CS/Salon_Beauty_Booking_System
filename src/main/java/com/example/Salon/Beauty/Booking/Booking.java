package com.example.Salon.Beauty.Booking;

import java.awt.print.Book;
import java.util.stream.DoubleStream;

public class Booking {

    private int bookingID;
    private Customer customer;
    private Stylist stylist;
    private ServiceType service;
    private int dateAndTime;

    public Booking(int bookingID, Customer customer, Stylist stylist, ServiceType service, int dateAndTime) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.stylist = stylist;
        this.service = service;
        this.dateAndTime = dateAndTime;
    }



    public Customer getCustomer() {
        return customer;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getDateAndTime() {
        return dateAndTime;
    }

    public Stylist getStylist() {
        return stylist;
    }

    public ServiceType getService() {
        return service;
    }

    public Booking isValid() {
        return new Booking(this.getBookingID(),this.getCustomer(),this.getStylist(),this.getService(),this.getDateAndTime());
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDateAndTime(int dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setService(ServiceType service) {
        this.service = service;
    }

    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }
}
