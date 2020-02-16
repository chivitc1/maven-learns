package com.example.service;

import com.example.core.models.Greeting;

public class HelloService {
    private Greeting greeting;

    public HelloService(Greeting greeting) {
        this.greeting = greeting;
    }
    public String sayHello(String personName) {
        return greeting.getGreeting() + " " + personName;
    }
}