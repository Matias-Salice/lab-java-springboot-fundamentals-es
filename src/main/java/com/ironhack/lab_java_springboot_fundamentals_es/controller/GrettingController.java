package com.ironhack.lab_java_springboot_fundamentals_es.controller;

import com.ironhack.lab_java_springboot_fundamentals_es.service.GrettingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GrettingController {

    private final GrettingService grettingService;

    public GrettingController(GrettingService grettingService) {
        this.grettingService = grettingService;
    }

    @GetMapping
    public String helloWorld(){
        return grettingService.sayHello();
    }

    @GetMapping("/{name}")
    public String helloWorldWithName(@PathVariable String name){
        return grettingService.sayHelloName(name);
    }

    @GetMapping("/add/{num1}/{num2}")
    public String addNumbers (@PathVariable int num1, @PathVariable int num2){
        return grettingService.add(num1,num2);
    }

    @GetMapping("/product/{num1}/{num2}")
    public String productOfNumbers (@PathVariable int num1, @PathVariable int num2){
        return grettingService.productOf(num1, num2);
    }

}
