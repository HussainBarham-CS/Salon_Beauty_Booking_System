package com.example.Salon.Beauty.Booking.controller;

import com.example.Salon.Beauty.Booking.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;



@RestController
public class indexController {

    /*

    @RequestMapping(value="/index",method = RequestMethod.POST)
    public ResponseEntity<Customer> fun(@RequestBody @Valid Customer customer) {

        return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value="/index/customer" ,method=RequestMethod.POST)
    public ResponseEntity<Customer> addCustomer(@RequestBody @Valid Customer customer) {

        Customer person = new Customer(customer.getName(), customer.getEmail(), customer.getPhone());

        WorkingHours clock=new WorkingHours(8,3);

        Stylist stylist = new Stylist("rahaf","rahaf@gmail.com","0592101558", Collections.singletonList(ServiceType.HAIRCUT),clock);


        try{
            person.bookService(stylist,ServiceType.MASSAGE,10);

            List<Booking> temp = person.getBooking();

            for(int i=0;i< temp.size();i++)
            {
                System.out.println(temp.get(i));
            }

            return new ResponseEntity<>(person,HttpStatus.ACCEPTED);

        }catch(Exception e){
            return new ResponseEntity<>(person,HttpStatus.BAD_REQUEST);
        }


    }

*/
    @RequestMapping(value="/stylist1",method = RequestMethod.POST)
    public ResponseEntity<List<Booking>> stylist1(@RequestBody @Valid Stylist stylist) {

        List<Booking> temp =  stylist.getBookings().stream().filter(e-> e.getCustomer().getEmail().equals("husseinx.com")).collect(Collectors.toList());

        return new ResponseEntity<>(temp, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value="/stylist2",method = RequestMethod.POST)
    public ResponseEntity<List<Customer>> stylist2(@RequestBody @Valid Stylist stylist) {

        List<Customer> temp1 = stylist.getBookings().stream().map(Booking::getCustomer).collect(Collectors.toList());

        return new ResponseEntity<>(temp1, HttpStatus.ACCEPTED);

    }

    @RequestMapping(value="/stylist3",method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Integer>> stylist3(@RequestBody @Valid Stylist stylist) {

        List<Customer> temp1 = stylist.getBookings().stream().map(Booking::getCustomer).collect(Collectors.toList());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=0;i< temp1.size();i++)
        {
            hashMap.put(temp1.get(i).getName(),Integer.parseInt(temp1.get(i).getPhone()));
        }

        return new ResponseEntity<>(hashMap, HttpStatus.ACCEPTED);

    }




}
