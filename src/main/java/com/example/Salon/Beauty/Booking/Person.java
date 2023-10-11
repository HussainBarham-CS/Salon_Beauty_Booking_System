package com.example.Salon.Beauty.Booking;


import javax.validation.constraints.*;

public abstract class Person {
    @NotNull(message="Name is mandatory")
    protected String name;
    @Email(message = "Error in enter email")
    protected String email;
    protected String phone;

    public Person(String name, String email, String phone) {
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setEmail(String email);
    public abstract String getEmail();

    public abstract void setPhone(String phone);
    public abstract String getPhone();


    public void display() {
        System.out.println("Name : "+this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Phone : "+this.phone);
    }



}
