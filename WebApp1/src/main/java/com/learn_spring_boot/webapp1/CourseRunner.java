package com.learn_spring_boot.webapp1;

import com.learn_spring_boot.webapp1.course.Course;
import com.learn_spring_boot.webapp1.course.jdbc.CourseJdbcRepository;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseRunner implements CommandLineRunner {

    @Autowired
    CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(BigInteger.valueOf(1),"Learn Spring Boot","HristijanCH"));
        repository.insert(new Course(BigInteger.valueOf(2),"React.js","Trajce"));
        repository.insert(new Course(BigInteger.valueOf(3),"Node.js","Petko"));

        repository.deleteById(BigInteger.valueOf(1));
        System.out.println(repository.findAll());
        repository.update(new Course(BigInteger.valueOf(2),"React.js","Trajce NEW"));
        System.out.println(repository.findById(BigInteger.valueOf(2)));
    }

}
