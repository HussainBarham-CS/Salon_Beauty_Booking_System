package com.example.Salon.Beauty.Booking.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ServiceTypeValidator implements ConstraintValidator<ValidationServiceType,String> {
    @Override
    public boolean isValid(String serviceType, ConstraintValidatorContext constraintValidatorContext) {

        List<String> serviceTypes= Arrays.asList("HAIRCUT", "MANICURE", "PEDICURE", "MASSAGE", "FACIAL");


        return serviceTypes.contains(serviceType);
    }
}
