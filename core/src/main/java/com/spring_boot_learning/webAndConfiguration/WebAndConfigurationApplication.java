package com.spring_boot_learning.webAndConfiguration;

import com.spring_boot_learning.coreBeans.simulator.VehicleSimulator;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebAndConfigurationApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(WebAndConfigurationApplication.class, args);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
