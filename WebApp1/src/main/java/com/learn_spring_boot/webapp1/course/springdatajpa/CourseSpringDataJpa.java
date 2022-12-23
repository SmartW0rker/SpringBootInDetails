package com.learn_spring_boot.webapp1.course.springdatajpa;

import com.learn_spring_boot.webapp1.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseSpringDataJpa extends JpaRepository<Course,Long> {
    Optional<Course> findByAuthor(String author);
}
