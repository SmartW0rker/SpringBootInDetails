package com.spring_boot_learning.coreBeans.vehicleCreator;

import com.spring_boot_learning.core.vehicle.Tractor;
import com.spring_boot_learning.core.vehicle.Truck;
import com.spring_boot_learning.coreBeans.vehicle.Car;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class VehicleCreator {

    @Bean
    @Primary
    public Car  car(){
        return new Car();
    }

    @Bean
    @Qualifier("TractorQualifier")
    public Tractor tractor(){
        return new Tractor();
    }

    @Bean
    public Truck truck(){
       return new Truck();
    }
}
