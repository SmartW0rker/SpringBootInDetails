package com.learn_spring_boot.jspwebapp.controller.login;

import com.learn_spring_boot.jspwebapp.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

    @Autowired
    AuthenticationService authenticationService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcome(@RequestParam String username,@RequestParam String password, ModelMap model){
        model.put("username",username);
        model.put("password",username);
        if (authenticationService.authenticate(username,password))
            return "welcome";
        else
            return "login";

    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
