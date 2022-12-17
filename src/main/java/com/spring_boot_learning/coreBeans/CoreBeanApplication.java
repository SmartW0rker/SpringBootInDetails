package com.spring_boot_learning.coreBeans;

import com.spring_boot_learning.coreBeans.simulator.VehicleSimulator;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoreBeanApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(CoreBeanApplication.class, args);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        context.getBean(VehicleSimulator.class).simulate();

    }
}
