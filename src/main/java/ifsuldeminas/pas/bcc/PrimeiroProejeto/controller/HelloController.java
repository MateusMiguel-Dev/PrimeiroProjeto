package ifsuldeminas.pas.bcc.PrimeiroProejeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@GetMapping ("/hello")
@RestController

public class HelloController {
    public String hello(){
        return "Hello World";
    }
}
