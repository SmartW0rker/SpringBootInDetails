package com.learn_spring_boot.jspwebapp.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello-world")
    @ResponseBody
    public String helloWorld(){
        return "Hello Spring Framework !";
    }

    @RequestMapping("/hello-world-html")
    @ResponseBody
    public String helloWorldHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    @RequestMapping("/hello-world-jsp")
    public String helloWorldJsp(){
        return "sayHello";
    }
}
