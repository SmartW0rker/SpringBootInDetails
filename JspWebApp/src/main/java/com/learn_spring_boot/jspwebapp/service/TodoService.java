package com.learn_spring_boot.jspwebapp.service;

import com.learn_spring_boot.jspwebapp.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todoList= new ArrayList<>();

    static {
        todoList.add(new Todo(1,"Hristijan","Learn Spring MVC", LocalDate.of(2022,12,21),false));
        todoList.add(new Todo(2,"Hristijan","Learn Spring boot", LocalDate.of(2020,4,21),false));
        todoList.add(new Todo(3,"Hristijan","Learn Spring security", LocalDate.of(2021,1,21),false));
    }

    public List<Todo> getAll(){
        return todoList;
    }
}
