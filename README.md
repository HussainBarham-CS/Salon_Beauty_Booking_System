# Salon_Beauty_Booking_System
Salon Beauty Booking System



1- use foreach instead of using normal for loop

2- Use SET not List in example2

3- MAP<STRING,STRING>


1--------->
```
//use foreach

HashMap<String, String> hashMap = new HashMap<>();
temp1.forEach(e -> hashMap.put(e.getName(), e.getPhone()));
```
```
//use stream
HashMap<String, String> hashMap = (HashMap<String, String>) temp1.stream()
                .collect(Collectors.toMap(
                        Customer::getName,
                        Customer::getPhone
                ));
```

2---------> use Set

```
Set<String> temp1 = stylist.getBookings().stream().map(e->e.getCustomer().getName()).collect(Collectors.toSet());

```


3---------------->
```
public ResponseEntity<HashMap<String, String>> stylist3(@RequestBody @Valid Stylist stylist)
```
=======
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








