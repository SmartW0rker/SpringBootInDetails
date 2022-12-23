package com.learn_spring_boot.jspwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap model){
        model.put("name",name);
        return "login";
    }
}
