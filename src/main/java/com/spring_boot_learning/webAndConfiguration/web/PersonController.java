package com.spring_boot_learning.webAndConfiguration.web;

import com.spring_boot_learning.webAndConfiguration.model.Person;
import com.spring_boot_learning.webAndConfiguration.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/all")
    public List<Person> getPeople(){
        return personService.getPeople();
    }

    @RequestMapping("/info")
    public List<String> getInfo(){
        return personService.getAppData();
    }
}
