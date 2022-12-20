package com.learn_spring_boot.webapp1.course.jpa;

import com.learn_spring_boot.webapp1.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
@Transactional
public class CourseJpaRepository {
    @Autowired
    EntityManager entityManager;

    public void insert(Course course){
        entityManager.persist(course);
    }

    public Course findById(BigInteger id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(BigInteger id){
        Course course=findById(id);
        entityManager.remove(course);
    }

    public Course update(Course course){
        return entityManager.merge(course);
    }
}
