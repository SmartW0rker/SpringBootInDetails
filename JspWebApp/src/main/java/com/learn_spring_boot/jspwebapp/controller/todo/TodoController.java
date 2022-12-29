package com.learn_spring_boot.jspwebapp.controller.todo;

import com.learn_spring_boot.jspwebapp.model.Todo;
import com.learn_spring_boot.jspwebapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/todos")
    public String getAll(ModelMap model){
        model.put("todos",todoService.getAll());
        return "listTodos";
    }
}
