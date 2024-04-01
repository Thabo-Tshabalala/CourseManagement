package za.ac.cput.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public String sayHi(){
        return  "Hi from Intelli J";
    }
}
