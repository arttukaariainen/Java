package com.repe.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {
    @PostMapping("Person")
    public String addPerson(@RequestParam String fname, @RequestParam String age){
       
        return "Hello" + fname + ". your age is " + age+"</h1>";
    }
}
