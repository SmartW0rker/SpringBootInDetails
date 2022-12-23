package com.learn_spring_boot.webapp1;

import com.learn_spring_boot.webapp1.course.Course;
import com.learn_spring_boot.webapp1.course.jdbc.CourseJdbcRepository;
import java.math.BigInteger;

import com.learn_spring_boot.webapp1.course.jpa.CourseJpaRepository;
import com.learn_spring_boot.webapp1.course.springdatajpa.CourseSpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseRunner implements CommandLineRunner {

//    @Autowired
//    CourseJdbcRepository repository;

//    @Autowired
//    CourseJpaRepository repository;
    @Autowired
    CourseSpringDataJpa repository;

    @Override
    public void run(String... args) throws Exception {
//        this is fop jdbc and jpa
//        repository.insert(new Course(1L,"Learn Spring Boot","HristijanCH"));
//        repository.insert(new Course(2L,"React.js","Trajce"));
//        repository.insert(new Course(3L,"Node.js","Petko"));
//
//        repository.deleteById(1L);
//        System.out.println(repository.findAll());
//        repository.update(new Course(2L,"React.js","Trajce NEW"));
//        System.out.println(repository.findById((2L)));
        repository.save(new Course(1L,"Learn Spring Boot","HristijanCH"));
        repository.save(new Course(2L,"React.js","Trajce"));
        repository.save(new Course(3L,"Node.js","Petko"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));

        System.out.println(repository.findByAuthor("Trajce").orElse(null));

        System.out.println(repository.findAll());
    }

}
