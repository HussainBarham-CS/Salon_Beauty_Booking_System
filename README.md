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
