package com.learn_spring_boot.jspwebapp.repository;

import com.learn_spring_boot.jspwebapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Override
    List<Todo> findAll();
}
