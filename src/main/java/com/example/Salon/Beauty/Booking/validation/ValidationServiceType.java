package com.example.Salon.Beauty.Booking.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ServiceTypeValidator.class)
public @interface ValidationServiceType {

    public String message() default "Invalid Service Type: it should be either HAIRCUT, MANICURE, PEDICURE, MASSAGE, FACIAL";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
