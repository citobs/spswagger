package studio.citobs.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(value = "/hello")

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
