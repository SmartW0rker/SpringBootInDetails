package com.learn_spring_boot.jspwebapp.service;

import com.learn_spring_boot.jspwebapp.model.Todo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todoList= new ArrayList<>();

    private static int todosCount=0;

    static {
        todoList.add(new Todo(++todosCount,"Hristijan","Learn Spring MVC", LocalDate.of(2022,12,21),false));
        todoList.add(new Todo(++todosCount,"Hristijan","Learn Spring boot", LocalDate.of(2020,4,21),false));
        todoList.add(new Todo(+todosCount,"Hristijan","Learn Spring security", LocalDate.of(2021,1,21),false));
    }

    public List<Todo> getAll(){
        return todoList;
    }

    public List<Todo> getAll(String username){
        Predicate<? super Todo> predicate =
                todo -> todo.getUsername().equalsIgnoreCase(username);
        return todoList.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todoList.add(todo);
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todoList.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todoList.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todoList.add(todo);
    }
}
