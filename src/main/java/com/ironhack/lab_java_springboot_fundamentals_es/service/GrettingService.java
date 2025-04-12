package com.ironhack.lab_java_springboot_fundamentals_es.service;
import org.springframework.stereotype.Service;

@Service
public class GrettingService {

    public String sayHello() {
        return "Hello World";
    }

    public String sayHelloName (String name){
        return "Hello " + name + " welcome!";
    }

    public String add(int num1, int num2){
        int result= num1+num2;
        return "El resultado de la suma es " + result;
    }

    public String productOf (int num1, int num2){
        return "El resultado de la multiplicación es " + num1*num2;
    }

}
