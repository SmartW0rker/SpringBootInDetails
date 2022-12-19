package com.spring_boot_learning.core;

import com.spring_boot_learning.core.simulator.VehicleSimulator;
import com.spring_boot_learning.core.vehicle.Tractor;
import java.util.Arrays;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(CoreApplication.class, args);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        context.getBean(VehicleSimulator.class).simulate();

    }
}
