# Salon_Beauty_Booking_System
Salon Beauty Booking System

#### to test
```
{
    "name":"hussein",
    "email":"hussein.com",
    "phone":"0592101558",
    "specialties": ["MASSAGE","HAIRCUT"], 
    "workingHours": {
        "startTime":8,
        "endTime":3
    },
    "bookings": [{
        "bookingID":12,
        "customer":{
            "name":"hussein",
            "email":"husseinx.com",
            "phone":"0592101558"
        },
        "stylist":{
            "name":"hussein",
            "email":"hussein.com",
            "phone":"0592101558",
            "workingHours": {
                "startTime":8,
                "endTime":3
            },
            "specialties": ["MASSAGE","HAIRCUT"]
        },
        "service":"MASSAGE",
        "dateAndTime":10
        
    },{
        
        "bookingID":12,
        "customer":{
            "name":"bono",
            "email":"bonox.com",
            "phone":"0592222222"
        },
        "stylist":{
            "name":"hussein",
            "email":"hussein.com",
            "phone":"0592101558",
            "workingHours": {
                "startTime":8,
                "endTime":3
            },
            "specialties": ["MASSAGE","HAIRCUT"]
        },
        "service":"MASSAGE",
        "dateAndTime":10
    }
    ]}
```




1- return  only customer with email “husseinx.com” for booking list in /stylist api

*** localhost:8080/stylist1

2- return set  customer’s names in all of bookings

*** localhost:8080/stylist2

3- hash map for every customer with its phone nember

*** localhost:8080/stylist3








